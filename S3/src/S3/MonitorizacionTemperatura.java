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
        TiempoSatelital satelite = new TiempoSatelital();
        Simulador simulador = new Simulador(grafica, boton);
        
        boton.setSimulador(simulador);
        pantalla.setSimulador(simulador);
        
        
        Simulador simulador2 = new Simulador(grafica, boton);
        Simulador simulador3 = new Simulador(grafica, boton);
        satelite.setSimulador(simulador,simulador2,simulador3);
        
        satelite.setVisible(true);
        pantalla.setVisible(true);
        boton.setVisible(true);
        grafica.setVisible(true);
        
        simulador.empezar();
        simulador2.empezar();
        simulador3.empezar();
        pantalla.setTemperatura();
    }
    
}
