/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.SCACV;
import Controlador.Motor;
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
public class PanelRevisiones extends JPanel{
    private SCACV SCACV;
    private Motor motor;
    private RoundRectangle2D  marco, marcoMotor, marcoPastillas, marcoGeneral;
    private Rectangle2D cuadroMotor, cuadroPastillas, cuadroGeneral;
    
    public PanelRevisiones(SCACV SCACV, Motor motor){
        this.SCACV = SCACV;
        this.motor = motor;
        
        this.setSize(315, 315);
            
        this.marco = new RoundRectangle2D.Double(5.0D, 5.0D, getWidth()-5, getHeight(), 15.0D, 15.0D);
        this.marcoMotor = new RoundRectangle2D.Double(10.0D, 60.0D, 300.0D, 75.0D, 10.0D, 10.0D);
        this.marcoPastillas = new RoundRectangle2D.Double(10.0D, 140.0D, 300.0D, 75.0D, 10.0D, 10.0D);
        this.marcoGeneral = new RoundRectangle2D.Double(10.0D, 220.0D, 300.0D, 75.0D, 10.0D, 10.0D);
        
        this.cuadroMotor = new Rectangle2D.Double(180.0D, 70.0D, 115.0D, 55.0D);
        this.cuadroPastillas = new Rectangle2D.Double(180.0D, 150.0D, 115.0D, 55.0D);
        this.cuadroGeneral = new Rectangle2D.Double(180.0D, 230.0D, 115.0D, 55.0D);
        
        setBackground(Color.DARK_GRAY);
        
        addMouseListener(new MouseRevisiones(this.motor, this.SCACV));
    }
    
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setPaint(Color.blue);
        g2.fill(marco);
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.BOLD, 30));
        g2.drawString("Notificaciones", 77, 40);
        
        g2.setPaint(Color.cyan);
        if(SCACV.getRevolucionesRevisionMotor()>10000){
            g2.setPaint(Color.red);
        }
        g2.fill(marcoMotor);
        
        g2.setPaint(Color.cyan);
        if(SCACV.getRevolucionesRevisionPastillas()>100000){
             g2.setPaint(Color.red);
        }
        g2.fill(marcoPastillas);
        
        g2.setPaint(Color.cyan);
        if(SCACV.getRevolucionesRevisionGeneral()>1000000){
             g2.setPaint(Color.red);
        }
        g2.fill(marcoGeneral);
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.PLAIN, 20));
        g2.drawString("WAR Rev.Motor", 20, 105);
        g2.drawString("WAR Rev.Pastillas", 20, 185);
        g2.drawString("WAR Rev.General", 20, 265);
        
        g2.setPaint(Color.black);
        g2.draw(cuadroMotor);
        g2.draw(cuadroPastillas);
        g2.draw(cuadroGeneral);
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.PLAIN, 20));
        g2.drawString(String.valueOf(SCACV.getRevolucionesRevisionMotor()), 233, 105);
        g2.drawString(String.valueOf(SCACV.getRevolucionesRevisionPastillas()), 233, 185);
        g2.drawString(String.valueOf(SCACV.getRevolucionesRevisionGeneral()), 233, 265);
        
       
    }
    
    public void actualizar(){
        repaint();
    }
}
