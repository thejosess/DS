let http = require('http');
let fs = require('fs');
 
let handleRequest = (request, response) => {
    console.log(request.url);
    if(request.url == '/js/juego.js')
    {    
        console.log("eooooooooo estoy en js");
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
 
http.createServer(handleRequest).listen(8181);