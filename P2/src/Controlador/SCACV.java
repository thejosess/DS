/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Vehiculo;
import static java.lang.Math.pow;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author José Santos y Raúl Soria
 */
public class SCACV extends Thread{
    private Vehiculo vehiculo;
    
    private EstadoSCACV EstadoSCACV;
    private Acelerador acelerador;
    
    private double velocidadCalculada;
    private double velocidadMemorizada;
    private double distancia;
    private int rpm;
    private int revolucionesTotal;
    private int revolucionesRevisionMotor;
    private int revolucionesRevisionPastillas;
    private int revolucionesRevisionGeneral;
    private double gasolina;
    private Random random = new Random();
    
    public SCACV(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        this.EstadoSCACV = EstadoSCACV.APAGADO;
        
        this.velocidadCalculada = 0.0;
        this.velocidadMemorizada = 0.0;
        this.distancia = 0.0;
        this.rpm = 0;
        this.repostar();
        
        this.revolucionesRevisionGeneral=0;
        this.revolucionesRevisionMotor=0;
        this.revolucionesRevisionPastillas=0;
        this.revolucionesTotal=0;
        
    }
    
    public void encender(){
        if(!isAlive())
            start();
    }
    
    public void repostar(){
        if(this.vehiculo.getEstadoMotor() == EstadoMotor.APAGADO)
            this.gasolina = 60.0 + (100.0 - 60.0) * this.random.nextDouble();
    }
    
    public void apagar(){
        this.eliminarVelocidad();
    }
    
    public void setAcelerador(Acelerador acelerador){
        this.acelerador = acelerador;
    }

    public int getRevolucionesTotal() {
        return revolucionesTotal;
    }
    
    public double getGasolina(){
        return this.gasolina;
    }

    public int getRevolucionesRevisionMotor() {
        return revolucionesRevisionMotor;
    }

    public int getRevolucionesRevisionPastillas() {
        return revolucionesRevisionPastillas;
    }

    public int getRevolucionesRevisionGeneral() {
        return revolucionesRevisionGeneral;
    }
    
    public void reiniciarRevolucionesRevisionMotor(){
        this.revolucionesRevisionMotor = 0;
    }
    
    public void reiniciarRevolucionesRevisionPastillas(){
        this.revolucionesRevisionPastillas = 0;
    }
    
    public void reiniciarRevolucionesRevisionGeneral(){
        this.revolucionesRevisionGeneral = 0;
    }
    
    public void acumularRevoluciones(){
        if(rpm>0){
            this.revolucionesRevisionGeneral+=(rpm*0.1);
            this.revolucionesRevisionMotor+=(rpm*0.1);
            this.revolucionesRevisionPastillas+=(rpm*0.1);
            this.revolucionesTotal+=(rpm*0.1);
        }
    }
    
    public EstadoSCACV getEstadoSCACV(){
        return this.EstadoSCACV;
    }  

    public double getVelocidadCalculada() {
        this.calcularVelocidad();
        return this.velocidadCalculada;
    }

    public double getVelocidadMemorizada() {
        return this.velocidadMemorizada;
    }

    public double getDistancia() {
        this.calcularDistancia();
        return this.distancia;
    }
    
    public int getRpm(){
        this.calcularRpm();
        return this.rpm;
    }
    
    public void setEstadoSCACV(EstadoSCACV EstadoSCACV){
        this.EstadoSCACV = EstadoSCACV;
    }
    
    public boolean tieneVelocidadAlmacenada(){
        if(velocidadMemorizada>0.0)
            return true;
        else return false;
    }
    
    public void setVelocidadMemorizada(double velocidad){
        this.velocidadMemorizada = velocidad;
    }
    
    public void eliminarVelocidad(){
        this.velocidadCalculada = 0.0;
        this.velocidadMemorizada = 0.0;
    }
    
    public void calcularVelocidad(){
        this.velocidadCalculada = this.vehiculo.getVelocidad();
    }
    
    public void calcularDistancia(){
        this.distancia = this.vehiculo.getDistancia();
    }
    
    public void calcularRpm(){
        this.rpm = this.vehiculo.getRpm();
    }
    
    public double getConsumo(){
        return this.getRpm() * this.getRpm() * 5 * pow(10,-10);
    }
    
    public void calcularGasolina(){
        this.gasolina -=  this.getConsumo();
        if(gasolina < 0)
            gasolina = 0;
    }
    
    
    
    @Override
    public void run(){
        while(true){
            switch(this.EstadoSCACV){
                case APAGADO:
                    this.vehiculo.soltarFreno();
                    this.vehiculo.desacelerar();
                    try {
                        sleep(100);
                    }catch (InterruptedException ex) {
                        Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                break;

                case ACELERANDO_SIN_SCACV:
                    this.vehiculo.acelerar();
                    try {
                        sleep(100);
                    }catch (InterruptedException ex) {
                        Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                break;

                case ACELERANDO:
                    this.vehiculo.soltarFreno();
                    this.acelerador.acelerarSCACV();
                    try {
                        sleep(100);
                    }catch (InterruptedException ex) {
                        Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                break;

                case MANTENIENDO:
                    if (velocidadMemorizada > velocidadCalculada) this.acelerador.acelerarSCACV();
                    else this.acelerador.desacelerarSCACV();

                    try {
                        sleep(100);
                    }catch (InterruptedException ex) {
                        Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                break;

                case REINICIANDO:
                    if (velocidadMemorizada > velocidadCalculada) this.vehiculo.acelerar();
                    else{
                        this.EstadoSCACV = EstadoSCACV.MANTENIENDO;
                    }
                    try {
                        sleep(100);
                    }catch (InterruptedException ex) {
                        Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                break;

                case FRENANDO:
                    this.vehiculo.pisarFreno();
                    try {
                        sleep(100);
                    }catch (InterruptedException ex) {
                        Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                break;
            }
            this.calcularGasolina();
            if(this.getGasolina() == 0.0)
            {
                this.vehiculo.apagar();
                this.EstadoSCACV = EstadoSCACV.APAGADO;
            }
        }
    }
}