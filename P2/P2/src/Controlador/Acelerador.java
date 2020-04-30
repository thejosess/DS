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
public class Acelerador {
    private SCACV SCACV;
    private Vehiculo vehiculo;
    
    private EstadoPedal EstadoPedal;
    
    public Acelerador(SCACV SCACV, Vehiculo vehiculo){
        this.SCACV = SCACV;
        this.vehiculo = vehiculo;
        
        this.EstadoPedal = EstadoPedal.SUELTO;
    }
    
    public void setEstado(EstadoPedal EstadoPedal){
        this.EstadoPedal = EstadoPedal;
    }
    
    public EstadoPedal getEstado(){
        return this.EstadoPedal;
    }
    
    public void pisarAcelerador(){
        if(SCACV.getEstadoSCACV()==EstadoSCACV.APAGADO){
            this.EstadoPedal = EstadoPedal.PISADO;
            SCACV.setEstadoSCACV(EstadoSCACV.ACELERANDO_SIN_SCACV);
        }
    }
    
    public void soltarAcelerador(){
        if(SCACV.getEstadoSCACV()==EstadoSCACV.ACELERANDO_SIN_SCACV){
            this.EstadoPedal = EstadoPedal.SUELTO;
            SCACV.setEstadoSCACV(EstadoSCACV.APAGADO);
        } 
    }
    
    public void acelerarSCACV(){
        this.vehiculo.acelerar();
    }
    
    public void desacelerarSCACV(){
        this.vehiculo.desacelerar();
    }
    
    public void eliminarAceleramiento(){ 
        this.vehiculo.eliminarAceleramiento();
    }
}