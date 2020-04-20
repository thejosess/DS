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
public class Palanca {
    private EstadoPalanca estadoPalanca;
    private SCACV SCACV;
    
    public Palanca(SCACV SCACV){
        this.SCACV = SCACV;
        this.estadoPalanca = EstadoPalanca.APAGAR;
    }
    
    public EstadoPalanca getEstadoPalanca(){
        return this.estadoPalanca;
    } 
    
    public void cambiarPalanca(EstadoPalanca estadoPalanca){
        EstadoSCACV EstadoSCACV = SCACV.getEstadoSCACV();
        boolean tieneVelocidadAlmacenada = SCACV.tieneVelocidadAlmacenada();
        switch(estadoPalanca){
            case APAGAR: 
                if(EstadoSCACV==EstadoSCACV.ACELERANDO || EstadoSCACV==EstadoSCACV.MANTENIENDO){
                    this.estadoPalanca = estadoPalanca;
                    this.SCACV.setEstadoSCACV(EstadoSCACV.APAGADO);
                }
            break;
            
            case ACELERAR:   
                this.estadoPalanca = estadoPalanca;
                this.SCACV.setEstadoSCACV(EstadoSCACV.ACELERANDO);  
            break;
            
            case MANTENER:    
                if(EstadoSCACV==EstadoSCACV.ACELERANDO){
                    this.estadoPalanca = estadoPalanca; 
                    this.SCACV.setVelocidadMemorizada(this.SCACV.getVelocidadCalculada());
                    this.SCACV.setEstadoSCACV(EstadoSCACV.MANTENIENDO);
                }
            break;
            
            case REINICIAR:    
                if(EstadoSCACV==EstadoSCACV.APAGADO && tieneVelocidadAlmacenada){
                    this.estadoPalanca = estadoPalanca;
                    this.SCACV.setEstadoSCACV(EstadoSCACV.REINICIANDO);
                }
            break;
        }
    }
}