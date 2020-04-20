/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Vehiculo;

/**
 *
 * @author José Santos y Raúl Soria
 */
public class Motor {
    private Vehiculo vehiculo;
    private SCACV SCACV;
    private EstadoMotor estadoMotor;
    
    public Motor(SCACV SCACV, Vehiculo vehiculo){
        this.SCACV = SCACV;
        this.vehiculo = vehiculo;
        this.estadoMotor = EstadoMotor.APAGADO; 
    }
    
    public void arrancarMotor(){
        this.vehiculo.arrancar();
        this.SCACV.encender();
        this.estadoMotor = EstadoMotor.ENCENDIDO; 
    }
    
    public void apagarMotor(){
        this.vehiculo.apagar();
        this.SCACV.apagar();
        this.estadoMotor = EstadoMotor.APAGADO; 
    }
    
    public EstadoMotor getEstadoMotor(){
        return this.estadoMotor;
    }
}