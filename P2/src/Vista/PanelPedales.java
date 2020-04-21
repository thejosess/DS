/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Acelerador;
import Controlador.EstadoMotor;
import Controlador.EstadoPedal;
import Controlador.EstadoPedal;
import Controlador.Freno;
import Controlador.Motor;
import Controlador.Palanca;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author José Santos y Raúl Soria
 */
public class PanelPedales extends JPanel{
    private Motor motor;
    private Freno freno;
    private Acelerador acelerador;
    private Palanca palanca;
    private RoundRectangle2D  marcoMotor, marcoAcelerador, marcoFreno;
    private Rectangle2D cuadroMotor, cuadroAcelerador, cuadroFreno;
    
    public PanelPedales(Motor motor, Acelerador acelerador, Freno freno, Palanca palanca){
        this.motor = motor;
        this.acelerador = acelerador;
        this.freno = freno;
        this.palanca = palanca;
       
        this.setSize(630, 70);
            
        this.marcoMotor = new RoundRectangle2D.Double(20.0D, 10.0D, 176.0D, 50.0D, 10.0D, 10.0D);
        this.cuadroMotor = new Rectangle2D.Double(20.0D, 10.0D, 176.0D, 50.0D);
        
        this.marcoAcelerador = new RoundRectangle2D.Double(226.0D, 10.0D, 176.0D, 50.0D, 10.0D, 10.0D);
        this.cuadroAcelerador = new Rectangle2D.Double(226.0D, 10.0D, 176.0D, 50.0D);
        
        this.marcoFreno = new RoundRectangle2D.Double(442.0D, 10.0D, 176.0D, 50.0D, 10.0D, 10.0D);
        this.cuadroFreno = new Rectangle2D.Double(442.0D, 10.0D, 176.0D, 50.0D);
        setBackground(Color.DARK_GRAY);
        
        addMouseListener(new MousePedales(this, this.palanca));
    
    }
    
    public void arrancarMotor(){
        this.motor.arrancarMotor();
    }
    
    public void apagarMotor(){
        this.motor.apagarMotor();
    }
    
    public void pisarAcelerador(){
        this.acelerador.pisarAcelerador();
    }
    
    public void soltarAcelerador(){
        this.acelerador.soltarAcelerador();
    }
    
    public void pisarFreno(){
        this.freno.pisarFreno();
    }
    
    public void soltarFreno(){
       this.freno.soltarFreno();
    }
    
    public EstadoMotor getEstadoMotor(){
        return this.motor.getEstadoMotor();
    }
    
    public EstadoPedal getEstadoAcelerador(){
        return this.acelerador.getEstado();
    }
        
    public EstadoPedal getEstadoFreno(){
        return this.freno.getEstado();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.BOLD, 15));
        
        if(motor.getEstadoMotor()==EstadoMotor.APAGADO){
           g2.setPaint(Color.red);
           g2.fill(marcoMotor);
           g2.setPaint(Color.black);
           g2.draw(this.cuadroMotor);
           g2.drawString("ARRANCAR", 62, 40);
        }
        
        else if(motor.getEstadoMotor()==EstadoMotor.ENCENDIDO){
           g2.setPaint(Color.blue);
           g2.fill(marcoMotor);
           g2.setPaint(Color.black);
           g2.draw(this.cuadroMotor);
           g2.drawString("APAGAR", 75, 40);
        }
                
        if(acelerador.getEstado()==EstadoPedal.PISADO){
           g2.setPaint(Color.cyan);
           g2.fill(marcoAcelerador);
           g2.setPaint(Color.black);
           g2.draw(this.cuadroAcelerador);
           g2.drawString("SOLTAR ACELERADOR", 228, 40);
        }
        
        else if(acelerador.getEstado()==EstadoPedal.SUELTO){
           g2.setPaint(Color.yellow);
           g2.fill(marcoAcelerador);
           g2.setPaint(Color.black);
           g2.draw(this.cuadroAcelerador);
           g2.drawString("PISAR ACELERADOR", 237, 40);
        }
        
        if(freno.getEstado()==EstadoPedal.PISADO){
           g2.setPaint(Color.cyan);
           g2.fill(marcoFreno);
           g2.setPaint(Color.black);
           g2.draw(this.cuadroFreno);
           g2.drawString("SOLTAR FRENO", 470, 40);
        }
        
        else if(freno.getEstado()==EstadoPedal.SUELTO){
           g2.setPaint(Color.yellow);
           g2.fill(marcoFreno);
           g2.setPaint(Color.black);
           g2.draw(this.cuadroFreno);
           g2.drawString("PISAR FRENO", 482, 40);
        }
       
     }
    
    public void actualizar(){
        repaint();
    }
}