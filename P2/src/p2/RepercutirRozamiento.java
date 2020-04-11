/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author ray
 */
public class RepercutirRozamiento implements Filtro {
    
    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor)
    {
        return revoluciones - ROZAMIENTO;
    }
}
