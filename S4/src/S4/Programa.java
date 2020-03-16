/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S4;

/**
 *
 * @author juse
 */
public class Programa {
    public static void main(String[] args) throws InterruptedException {
        
        Salpicadero salpicadero = new Salpicadero();
        GestorFiltros gestor = new GestorFiltros(salpicadero);
        CalcularVelocidad velocidad = new CalcularVelocidad();
        RepercutirRozamiento rozamiento = new RepercutirRozamiento();
        
        gestor.addFiltro(velocidad);
        gestor.addFiltro(rozamiento);
        
        Cliente cliente = new Cliente(gestor);
        
        Ventana ventana = new Ventana(salpicadero);
        ventana.setVisible(true);
        
        while(true)
        {
            cliente.solicitar();
            Thread.sleep(1000);
        }
        
    }
}
