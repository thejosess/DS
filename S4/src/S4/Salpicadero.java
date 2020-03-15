/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S4;

/**
 *
 * @author ray
 */
public class Salpicadero {
    private int rpm;
    private double velocidad;
    private double distancia;
    
    static final double RADIO = 0.15;
    
    double velocidad()
    {
        return 2*Math.PI*RADIO * rpm * (60/1000);
    }
}
