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
public class GestorFiltros {
    
    private CadenaFiltros cadena;
    
    GestorFiltros()
    {
        cadena = new CadenaFiltros();
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
        return cadena.ejecutar(revoluciones, estadoMotor);
    }
}
