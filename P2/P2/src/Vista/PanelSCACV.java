/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.SCACV;
import Controlador.EstadoSCACV;
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
public class PanelSCACV extends JPanel{
    private SCACV SCACV;
    private RoundRectangle2D  marco, marcoEstado, marcoVelocidad;
    private Rectangle2D cuadroEstado, cuadroVelocidad;
    
    public PanelSCACV(SCACV SCACV){
        this.SCACV = SCACV;
       
        this.setSize(315, 315);
            
        this.marco = new RoundRectangle2D.Double(5.0D, 5.0D, getWidth()-5, getHeight(), 15.0D, 15.0D);
        this.marcoEstado = new RoundRectangle2D.Double(10.0D, 60.0D, 300.0D, 110.0D, 10.0D, 10.0D);
        this.marcoVelocidad = new RoundRectangle2D.Double(10.0D, 180.0D, 300.0D, 110.0D, 10.0D, 10.0D);

        this.cuadroEstado = new Rectangle2D.Double(25.0D, 110.0D, 270.0D, 45.0D);
        this.cuadroVelocidad = new Rectangle2D.Double(90.0D, 230.0D, 150.0D, 45.0D);
        
        setBackground(Color.DARK_GRAY);
    }
    
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setPaint(Color.blue);
        g2.fill(marco);
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.BOLD, 30));
        g2.drawString("SCACV", 125, 40);
        
        g2.setPaint(Color.cyan);
        g2.fill(marcoEstado);
        g2.fill(marcoVelocidad);
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.PLAIN, 20));
        g2.drawString("Estado", 140, 95);
        g2.drawString("Velocidad Memorizada", 67, 215);

        g2.setPaint(Color.black);
        g2.draw(cuadroEstado);
        g2.draw(cuadroVelocidad);
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.PLAIN, 20));
        
        if(SCACV.getEstadoSCACV() == EstadoSCACV.ACELERANDO || SCACV.getEstadoSCACV() == EstadoSCACV.MANTENIENDO || SCACV.getEstadoSCACV() == EstadoSCACV.REINICIANDO){
            g2.drawString(String.valueOf(SCACV.getEstadoSCACV()), 98, 140);
        }
        
        else if(SCACV.getEstadoSCACV() == EstadoSCACV.APAGADO || SCACV.getEstadoSCACV() == EstadoSCACV.FRENANDO){
            g2.drawString(String.valueOf(SCACV.getEstadoSCACV()), 118, 140);
        }
        
        else if(SCACV.getEstadoSCACV() == EstadoSCACV.ACELERANDO_SIN_SCACV ){
            g2.drawString(String.valueOf(SCACV.getEstadoSCACV()),  42, 140);
        }
        
        g2.drawString(String.valueOf(SCACV.getVelocidadMemorizada()), 153, 260);
    }
    
    public void actualizar(){
        repaint();
    }
}