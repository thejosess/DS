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
public class Freno {
    private SCACV SCACV;
    
    private EstadoPedal EstadoPedal;
    private boolean estabaAcelerando;
    
    public Freno(SCACV SCACV){
        this.SCACV = SCACV;
        
        this.EstadoPedal = EstadoPedal.SUELTO;
        this.estabaAcelerando = false;
    }
    
    public void setEstado(EstadoPedal EstadoPedal){
        this.EstadoPedal = EstadoPedal;
    }
    
    public EstadoPedal getEstado(){
        return this.EstadoPedal;
    }
    
    public void pisarFreno(){
        this.EstadoPedal = EstadoPedal.PISADO;
        
        if(SCACV.getEstadoSCACV()==(EstadoSCACV.ACELERANDO)){
            this.estabaAcelerando = true;
        }
        
        SCACV.setEstadoSCACV(EstadoSCACV.FRENANDO);
    }
    
    public void soltarFreno(){
        this.EstadoPedal = EstadoPedal.SUELTO;
           
        if(this.estabaAcelerando){
            SCACV.setEstadoSCACV(EstadoSCACV.ACELERANDO);
            this.estabaAcelerando = false;
        }
        
        else SCACV.setEstadoSCACV(EstadoSCACV.APAGADO);
    }
}