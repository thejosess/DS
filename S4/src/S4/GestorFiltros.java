/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S4;

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
        this.salpicadero = new Salpicadero();
        this.salpicadero.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
        });
        //en el guion pone que es CadenaFiltros quien hace salpicadero.ejecutar, por eso no está aqui el atributo
    }
    
    void addFiltro(Filtro f)
    {
        cadena.addFiltro(f);
    }
    
    void vaciarFiltros()
    {
        cadena.vaciarFiltros();
    }
    
    double aplicarFiltros(double revoluciones, EstadoMotor estadoMotor)
    {
        double conFiltros = cadena.ejecutar(revoluciones, estadoMotor);
        
        return salpicadero.ejecutar(conFiltros, estadoMotor);
    }
}
