/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author ray
 */
public class GestorFiltros {
    
    private CadenaFiltros cadena;
    private Salpicadero salpicadero;
    
    GestorFiltros(Salpicadero salpicadero)
    {
        cadena = new CadenaFiltros();
        this.salpicadero = salpicadero;
        this.salpicadero.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
        });
    }
    
    void addFiltro(Filtro f)
    {
        cadena.addFiltro(f);
    }
    
    void vaciarFiltros()
    {
        cadena.vaciarFiltros();
    }
    
    double ejecutar()
    {
        double revoluciones = cadena.ejecutar(salpicadero.getRPM(), salpicadero.getEstado());
        
        if(revoluciones >= salpicadero.LIMITE)
        {
            System.out.println("El motor ha llegado a sus revoluciones máximas");
            revoluciones = salpicadero.LIMITE;
        }
        else if(revoluciones <= 0)
        {
            System.out.println("El coche esta parado");
            revoluciones = 0;
        }
        
        return salpicadero.ejecutar(revoluciones, salpicadero.getEstado());
    }
}
