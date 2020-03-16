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
public interface Filtro {
    
    static final int ROZAMIENTO = 30;
    
    double ejecutar(double revoluciones, EstadoMotor estadoMotor);
}
