/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S4;

import java.awt.BorderLayout;

/**
 *
 * @author ray
 */
public class Cliente {

    private GestorFiltros gestorFiltros;

    public Cliente(GestorFiltros gestorFiltros) {
        this.gestorFiltros = gestorFiltros;
    }
    
    public void solicitar(){
        gestorFiltros.ejecutar();
    }
}