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
public class CalcularVelocidad implements Filtro {
    
    private int incrementoVelocidad;
    
    private void calcularIncremento(EstadoMotor estado)
    {
        switch(estado)
        {
            case ACELERANDO:
                incrementoVelocidad = 100;
                break;
                
            case FRENANDO:
                incrementoVelocidad = -100;
                break;
                
            default:
                incrementoVelocidad = 0;
        }
    }

    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor)
    {   
        calcularIncremento(estadoMotor);
        
        revoluciones = revoluciones + incrementoVelocidad;
        
        return revoluciones;
    }
}
