/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EstadoMotor;
import Controlador.SCACV;
import Controlador.Palanca;
import Controlador.EstadoPalanca;
import Controlador.Motor;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author José Santos y Raúl Soria
 */
public class PanelPalanca extends JPanel{
    private Palanca palanca;
    private Motor motor;
    private RoundRectangle2D  marco;
    private RoundRectangle2D cuadroParar, cuadroAcelerar, cuadroMantener, cuadroReiniciar;
    private Shape circulo;
    
    public PanelPalanca(Motor motor, Palanca palanca){
        this.motor = motor;
        this.palanca = palanca;
        double radius = 50.0D;
        this.setSize(370, 315);
            
        this.marco = new RoundRectangle2D.Double(5.0D, 5.0D, getWidth()-5, getHeight(), 15.0D, 15.0D);
        
        this.cuadroParar = new RoundRectangle2D.Double(15.0D, 136.0D, 101.5D, 63.0D, 10.0D, 10.0D);
        this.cuadroAcelerar = new RoundRectangle2D.Double(106.5D, 63.0D, 101.5D, 63.0D, 10.0D, 10.0D);
        this.cuadroMantener = new RoundRectangle2D.Double(198.0D, 136.0D, 130.0D, 63.0D, 10.0D, 10.0D);
        this.cuadroReiniciar = new RoundRectangle2D.Double(106.5D, 209.0D, 101.5D, 63.0D, 10.0D, 10.0D);
        this.circulo = new Ellipse2D.Double(157.5 - radius, 167.5 - radius, 2.0 * radius, 2.0 * radius);
       
        setBackground(Color.DARK_GRAY);
        
        addMouseListener(new MousePalanca(this.motor, this.palanca));
    
    }
    
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setPaint(Color.blue);
        g2.fill(marco);
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.BOLD, 30));
        g2.drawString("Palanca", 105, 40);
        
        g2.setPaint(Color.YELLOW);
        if(palanca.getEstadoPalanca()==EstadoPalanca.APAGAR){
           g2.setPaint(Color.green);
        }
        g2.fill(cuadroParar);
              
        g2.setPaint(Color.YELLOW);
        if(palanca.getEstadoPalanca()==EstadoPalanca.ACELERAR){
           g2.setPaint(Color.green);
        }
        g2.fill(cuadroAcelerar);

        g2.setPaint(Color.YELLOW);
        if(palanca.getEstadoPalanca()==EstadoPalanca.MANTENER){
           g2.setPaint(Color.green);
        }
        g2.fill(cuadroMantener);

        g2.setPaint(Color.YELLOW);
        if(palanca.getEstadoPalanca()==EstadoPalanca.REINICIAR){
           g2.setPaint(Color.green);
        }
        g2.fill(cuadroReiniciar);
        
        g2.setPaint(Color.black);
        g2.fill(circulo);
        
        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.PLAIN, 23));
        g2.drawString("Parar", 40, 176);
        g2.drawString("Acelerar", 120, 100);
        g2.drawString("Mantener", 212, 176);
        g2.drawString("Reiniciar", 117, 249);
        
        /*if(motor.getEstadoMotor() == EstadoMotor.APAGADO)
        {
            palanca.cambiarPalanca(EstadoPalanca.APAGAR);
        }*/
       
     }
    
    public void actualizar(){
        repaint();
    }
}