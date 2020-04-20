/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.*;
import Controlador.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JFrame;

/**
 *
 * @author José Santos y Raúl Soria
 */
public class Interfaz  extends JApplet{
    private Vehiculo vehiculo;
    private SCACV SCACV;
    
    private Acelerador acelerador;
    private Freno freno;
    private Motor motor;
    private Palanca palanca;
    
    private PanelSCACV PanelSCACV;
    private PanelVelocimetro panelVelocimetro;
    private PanelPedales PanelPedales;
    private PanelPalanca panelPalanca;
    private PanelRevisiones PanelRevisiones;
    
    public Interfaz(){
        super();
        
        this.vehiculo = new Vehiculo(this);
        this.SCACV = new SCACV(this.vehiculo);
        
        this.acelerador = new Acelerador(this.SCACV, this.vehiculo);
        this.SCACV.setAcelerador(this.acelerador);
        this.freno = new Freno(this.SCACV);
        this.motor = new Motor(this.SCACV,this.vehiculo);
        this.palanca = new Palanca(this.SCACV);

        this.panelVelocimetro = new PanelVelocimetro(this.SCACV);
        this.PanelSCACV = new PanelSCACV(this.SCACV);
        this.PanelPedales = new PanelPedales(this.motor,this.acelerador,this.freno, this.palanca);
        this.panelPalanca = new PanelPalanca(this.motor,this.palanca);
        this.PanelRevisiones = new PanelRevisiones(this.SCACV,this.motor);
    }
    
    @Override
    public void init(){       
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints pos = new GridBagConstraints();
        
        pos.fill=1;
        this.setSize(650, 700);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK));
        
        setBackground(Color.BLACK);
        setLayout(gridbag);
        
        pos.gridx = 0;
        pos.gridy = 0;
        pos.weightx = 5.0D;
        pos.weighty = 5.0D;
        gridbag.setConstraints(panelVelocimetro, pos);
        add(panelVelocimetro);
        
        pos.gridx = 1;
        pos.gridy = 0;
        pos.weightx = 5.0D;
        pos.weighty = 5.0D;
        gridbag.setConstraints(PanelSCACV, pos);
        add(PanelSCACV);
        
        pos.gridx = 0;
        pos.gridy = 1;
        pos.weightx = 2.0D;
        pos.weighty = 1.0D;
        pos.gridwidth = 2;
        gridbag.setConstraints(PanelPedales, pos);
        add(PanelPedales);  
        
        pos.gridx = 0;
        pos.gridy = 2;
        pos.weightx = 5.0D;
        pos.weighty = 5.0D;
        pos.gridwidth = 1;
        gridbag.setConstraints(panelPalanca, pos);
        add(panelPalanca);  
        
        pos.gridx = 1;
        pos.gridy = 2;
        pos.weightx = 5.0D;
        pos.weighty = 5.0D;
        gridbag.setConstraints(PanelRevisiones, pos);
        add(PanelRevisiones);  
        
        
        validate();
    }
    
    public void actualizar(){
        this.SCACV.acumularRevoluciones();
        this.panelVelocimetro.actualizar();        
        this.PanelSCACV.actualizar();
        this.PanelPedales.actualizar();
        this.panelPalanca.actualizar();
        this.PanelRevisiones.actualizar();
    }
    
}