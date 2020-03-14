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
public class CalcularVelocidad implements Filtro {
    
    private int incrementoVelocidad;
    private final int LIMITE = 5000;
    
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
        
        if(incrementoVelocidad != 0)
        {
            revoluciones = revoluciones + incrementoVelocidad;

            if(revoluciones > LIMITE)
            {
                System.out.println("El motor ha llegado a sus revoluciones máximas");
                revoluciones = LIMITE;
                estadoMotor = EstadoMotor.ENCENDIDO;
            }
            else if(revoluciones < 0)
            {
                System.out.println("El coche se ha parado");
                revoluciones = 0;
                estadoMotor = EstadoMotor.ENCENDIDO;
            }
        }
        
        return 2*Math.PI*RADIO * revoluciones * (60/1000);
    }
}
