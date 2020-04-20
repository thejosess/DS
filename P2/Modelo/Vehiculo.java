/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.EstadoMotor;
import Vista.Interfaz;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author José Santos y Raúl Soria
 */
public class Vehiculo extends Thread{
    private final double ROZAMIENTO = -1;
    private final double MAX_ACELERAMIENTO = 6000;
    private final double MIN_ACELERAMIENTO = 0;
    private final double ACELERAMIENTO = 25;
    private final double FRENO = 25;
    private final double RADIO = 0.15;
    
    private Interfaz interfaz;
    private EstadoMotor estadoMotor; 
    private int rpm;
    private double frenando;
    private double acelerando;
    
    private double velocidad;
    private double distancia;
    
    
    public Vehiculo(Interfaz interfaz){
        this.interfaz = interfaz;
        this.estadoMotor = EstadoMotor.APAGADO;
        this.rpm = 0;
        this.frenando = 0.0;
        this.acelerando = 0.0;
        
        this.velocidad = 0.0;
        this.distancia = 0.0;
        
    }
    
    public void arrancar(){
        this.estadoMotor = EstadoMotor.ENCENDIDO;
        
        if(!isAlive())
            start();
    }
    
    public void apagar(){
        this.estadoMotor = EstadoMotor.APAGADO;
        this.interfaz.actualizar();
        
    }
    
    public void pisarFreno(){
        this.frenando = FRENO;
        this.acelerando -= this.frenando;
        if(this.acelerando < MIN_ACELERAMIENTO){
            this.acelerando = MIN_ACELERAMIENTO;
        }
    }
    
    public void soltarFreno(){
        this.frenando = 0.0;
    }
    
    public void acelerar(){
        this.acelerando += ACELERAMIENTO;
        if(this.acelerando > MAX_ACELERAMIENTO){
            this.acelerando = MAX_ACELERAMIENTO;
        }
    }
    
    public void desacelerar(){
        this.acelerando -= ACELERAMIENTO;
        if(this.acelerando < MIN_ACELERAMIENTO){
            this.acelerando = MIN_ACELERAMIENTO;
        }
    }
    
    public void eliminarAceleramiento(){
        this.acelerando = MIN_ACELERAMIENTO;
    }
    
    public double getVelocidad(){
        return this.velocidad;
    }
    
    public double getDistancia(){
        return this.distancia;
    }
    
    public int getRpm(){
        return this.rpm;
    }
    
    
    @Override
    public void run(){
        while(true){
            if(this.acelerando==0){
                this.rpm = 0;
            }
            else this.rpm = (int)(this.acelerando + this.ROZAMIENTO);
            
            if(this.rpm>=0){
                this.velocidad = 2*Math.PI*RADIO * this.rpm * (60.0/1000);
                this.velocidad = (double)(Math.round(this.velocidad * 100d) / 100d);
                this.distancia += this.velocidad/60;
                this.distancia = (double)(Math.round(this.distancia * 100d) / 100d);
            }
            this.interfaz.actualizar();
            
            try {
                sleep(100);
            }catch (InterruptedException ex) {
                Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

