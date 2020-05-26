var http = require("http");
var url = require("url");
var fs = require("fs");
var path = require("path");
var socketio = require("socket.io");
const socketClusterServer = require('socketcluster-server');

var MongoClient = require('mongodb').MongoClient;
var MongoServer = require('mongodb').Server;

var llave1 = false;
var llave2 = false;
 
let handleRequest = (request, response) => {
    if(request.url == '/js/juego.js')
    {    
        response.writeHead(200, {
        'Content-Type': 'text/javascript'
        });
        fs.readFile('js/juego.js', null, function (error, data) {
            if (error) {
                response.writeHead(404);
                response.write('Whoops! js not found!');
            } else {
                response.write(data);
            }
            response.end();
        });
    }
    else if(request.url == '/img/tilemap.png')
    {    
        response.writeHead(200, {
        'Content-Type': 'image/png'
        });
        fs.readFile('img/tilemap.png', null, function (error, data) {
            if (error) {
                response.writeHead(404);
                response.write('Whoops! img not found!');
            } else {
                response.write(data);
            }
            response.end();
        });
    }
    else if(request.url == '/css/style.css')
    {    
        response.writeHead(200, {
        'Content-Type': 'text/css'
        });
        fs.readFile('css/style.css', null, function (error, data) {
            if (error) {
                response.writeHead(404);
                response.write('Whoops! img not found!');
            } else {
                response.write(data);
            }
            response.end();
        });
    }
    else
    {    
        response.writeHead(200, {
            'Content-Type': 'text/html'
        });
        fs.readFile('./index.html', null, function (error, data) {
            if (error) {
                response.writeHead(404);
                response.write('Whoops! File not found!');
            } else {
                response.write(data);
            }
            response.end();
        });
    }
};

//cada que llegue a la puerta 5p, por nivel pasado

httpServer = http.createServer(handleRequest);

MongoClient.connect("mongodb://localhost:27017/", function(err, db) {
	httpServer.listen(8181);
    var io = socketio.listen(httpServer);
    var nick;
    var puntuacion;
    var nivel = 5;

	var dbo = db.db("pruebaBaseDatos");
	dbo.createCollection("test", function(err, collection){
    	io.sockets.on('connection',
		function(client) {
            client.on("set-llave1", function(data){
                llave1 = data;
                console.log("set 1: " + llave1);
            });
            
            client.on("set-llave2", function(data){
                llave2 = data;
                console.log("set 1: " + llave2);
            });
    
            client.on("get-llaves", function() {
                client.emit("get-llaves", {llave1:llave1, llave2:llave2});
            });
            
            client.on("get-llave1", function(data){
                io.sockets.emit("get-llave1", llave1);
            });
            
            client.on("get-llave2", function(data){
                io.sockets.emit("get-llave2", llave2);
            });

            client.on("nick", function(data){
                nick = data;
                puntuacion = 0;
            });

            client.on("sumarPuntuacion", function(){
                puntuacion = puntuacion + nivel;
            });

            client.on("sesionTerminada", function(){
                if(nick != null && puntuacion != null)
                {
                    console.log(nick);
                    var puntuacion_anterior;
                    collection.find({_id:nick}).toArray(function(err, result) {
                        if(result.length == 0)
                        {
                            var data = {_id:nick, nick:nick, puntuacion:puntuacion};
                            collection.insert(data, {safe:true}, function(err, result) {});
                            console.log("metido bd de forma correcta");
                            console.log(data);
                            puntuacion = 0;
                            client.emit("actualizar-ranking");
                        }
                        else
                        {
                            collection.find({_id:nick}).forEach(function(result){
                                var data = {nick:nick, puntuacion:puntuacion};
                                puntuacion_anterior = result.puntuacion;
                                console.log(puntuacion_anterior);
                                console.log(puntuacion);
                                if(puntuacion > puntuacion_anterior)
                                {
                                    console.log("modificando puntuacion")
                                    collection.update({_id:nick},{$set:{puntuacion:puntuacion}});
                                }
                                puntuacion = 0;
                                client.emit("actualizar-ranking");
                            });
                        }
                    });
                }
            });

            client.on('ranking', function () {
                collection.find().limit(10).sort({puntuacion:-1}).forEach(function(result){
                    var informacion = result.nick + " con una puntuación de: " + result.puntuacion + " pts";
                    console.log("enviando ranking");
                    client.emit('ranking',informacion);
                });
            });

		});
    });
});

console.log("Mazmorra iniciada");