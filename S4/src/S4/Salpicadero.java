/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S4;

import java.util.concurrent.TimeUnit;
import javax.swing.JPanel;

/**
 *
 * @author ray
 */
public class Salpicadero extends JPanel{
    private double rpm;
    private double velocidad;
    private double distancia;
    private long inicio;
    private long fin;
    
    static final double RADIO = 0.15;

    public Salpicadero() {
        inicio = System.currentTimeMillis();
        fin = 0;
        //podriamos hacer una variable que sea duracion o algo asi
    }
    
    void velocidad()
    {
        velocidad = (((2*Math.PI)*RADIO)* rpm) * (double) 60/1000;
        //hay que hacerlo asi, de la otra forma velocidad nos daba siempre cero
    }
    
    double duracion(){
        long tiempo = fin - inicio;       
        double duracion = (double)TimeUnit.MILLISECONDS.toSeconds(tiempo)/3600;
        return duracion;
    }
    
    double ejecutar(double revoluciones, EstadoMotor estadoMotor)
    {
        fin = System.currentTimeMillis();
        this.rpm = revoluciones;
        this.velocidad();
        this.distancia = this.velocidad * this.duracion();
   
        return rpm;
    }
}
