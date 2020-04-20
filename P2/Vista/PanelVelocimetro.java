/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.SCACV;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author José Santos y Raúl Soria
 */
public class PanelVelocimetro extends JPanel{
    private SCACV SCACV;
    private RoundRectangle2D  marco, marcoVelocidad, marcoRpm, marcoDistancia;
    private Rectangle2D cuadroVelocidad, cuadroRpm, cuadroDistancia;
    
    public PanelVelocimetro(SCACV SCACV){
         this.SCACV = SCACV;
       
        this.setSize(315, 315);
            
        this.marco = new RoundRectangle2D.Double(5.0D, 5.0D, getWidth()-5, getHeight(), 15.0D, 15.0D);
        this.marcoVelocidad = new RoundRectangle2D.Double(10.0D, 60.0D, 300.0D, 75.0D, 10.0D, 10.0D);
        this.marcoRpm = new RoundRectangle2D.Double(10.0D, 140.0D, 300.0D, 75.0D, 10.0D, 10.0D);
        this.marcoDistancia = new RoundRectangle2D.Double(10.0D, 220.0D, 300.0D, 75.0D, 10.0D, 10.0D);
        
        this.cuadroVelocidad = new Rectangle2D.Double(160.0D, 70.0D, 135.0D, 55.0D);
        this.cuadroRpm = new Rectangle2D.Double(160.0D, 150.0D, 135.0D, 55.0D);
        this.cuadroDistancia = new Rectangle2D.Double(160.0D, 230.0D, 135.0D, 55.0D);
        
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
        g2.drawString("Velocimetro", 85, 40);
        
        g2.setPaint(Color.cyan);
        g2.fill(marcoVelocidad);
        g2.fill(marcoRpm);
        g2.fill(marcoDistancia);
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.PLAIN, 20));
        g2.drawString("Velocidad(km/h)", 20, 105);
        g2.drawString("RPM", 65, 185);
        g2.drawString("Distancia(km)", 30, 265);
        
        g2.setPaint(Color.black);
        g2.draw(cuadroVelocidad);
        g2.draw(cuadroRpm);
        g2.draw(cuadroDistancia);
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.PLAIN, 20));
        g2.drawString(String.valueOf(SCACV.getVelocidadCalculada()), 218, 105);
        g2.drawString(String.valueOf(SCACV.getRpm()), 225, 185);
        g2.drawString(String.valueOf(SCACV.getDistancia()), 218, 265);
        
       
    }
    
    public void actualizar(){
        repaint();
    }
}