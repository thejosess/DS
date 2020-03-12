/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3;

/**
 *
 * @author ray
 */
public class MonitorizacionTemperatura {
    
    
    public static void main(String arg[]){
        PantallaTemperatura pantalla = new PantallaTemperatura();
        BotonCambio boton = new BotonCambio();
        GraficaTemperatura grafica = new GraficaTemperatura();
        Simulador simulador = new Simulador(grafica, boton);
        
        boton.setSimulador(simulador);
      
        pantalla.setVisible(true);
        boton.setVisible(true);
        grafica.setVisible(true);
        
        simulador.empezar();
    }
    
}
