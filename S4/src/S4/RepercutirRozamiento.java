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
public class RepercutirRozamiento implements Filtro {

    final int ROZAMIENTO = 60;
    
    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor)
    {
        if(revoluciones != 0)
            return revoluciones - ROZAMIENTO;
        else
            return revoluciones;
    }
}
