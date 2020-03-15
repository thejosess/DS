/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S4;

import java.util.ArrayList;

/**
 *
 * @author ray
 */
public class CadenaFiltros {
    
    ArrayList<Filtro> filtros;
    Salpicadero salpicadero;
    
    CadenaFiltros()
    {
        filtros = new ArrayList<>();
        this.salpicadero = salpicadero;
    }
    
    void addFiltro(Filtro filtro)
    {
        filtros.add(filtro);
    }
    
    void vaciarFiltros()
    {
        filtros.clear();
    }
    
    double ejecutar(double revoluciones, EstadoMotor estadoMotor)
    {
        for(Filtro f : filtros)
        {
            revoluciones = f.ejecutar(revoluciones, estadoMotor);
        }
        
        return revoluciones;
    }
}
