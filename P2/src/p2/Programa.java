/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;
import javax.swing.JLabel;

/**
 *
 * @author juse
 */
public class Programa extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        Salpicadero salpicadero = new Salpicadero();
        GestorFiltros gestor = new GestorFiltros(salpicadero);
        CalcularVelocidad velocidad = new CalcularVelocidad();
        RepercutirRozamiento rozamiento = new RepercutirRozamiento();
        
        gestor.addFiltro(velocidad);
        gestor.addFiltro(rozamiento);
        
        Ventana ventana = new Ventana(salpicadero);
        ventana.setVisible(true);
        
        Cliente cliente = new Cliente(gestor);
        
        try {
            cliente.solicitar();
        } catch (InterruptedException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}