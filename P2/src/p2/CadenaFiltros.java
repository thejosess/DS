/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;

/**
 *
 * @author ray
 */
public class CadenaFiltros {
    
    ArrayList<Filtro> filtros;
    
    CadenaFiltros()
    {
        filtros = new ArrayList<>();
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
