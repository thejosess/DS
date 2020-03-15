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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Salpicadero salpicadero = new Salpicadero();
        GestorFiltros gestor = new GestorFiltros(salpicadero);
        CalcularVelocidad velocidad = new CalcularVelocidad();
        RepercutirRozamiento rozamiento = new RepercutirRozamiento();
        
        gestor.addFiltro(velocidad);
        gestor.addFiltro(rozamiento);
        
        double revolucionesFinal = gestor.aplicarFiltros(100, EstadoMotor.ACELERANDO);
        
        System.out.println(revolucionesFinal);
        
        //PanelBotones panelBotones = new PanelBotones();
        //panelBotones.setVisible(true);
        
    }
    
}
