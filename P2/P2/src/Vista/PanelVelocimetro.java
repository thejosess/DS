/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.SCACV;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author juse
 */
public class PanelVelocimetro extends javax.swing.JPanel {

    private SCACV SCACV;
    private RoundRectangle2D  marco, marcoVelocidad, marcoRpm, marcoDistancia;
    private Rectangle2D cuadroVelocidad, cuadroRpm, cuadroDistancia;

    
    PanelVelocimetro(SCACV SCACV){
        initComponents();
        this.SCACV = SCACV;
        this.setBackground(Color.BLUE);
        
        this.marcoRpm = new RoundRectangle2D.Double(10.0D, 240.0D, 385.0D, 75.0D, 10.0D, 10.0D);
        this.marcoDistancia = new RoundRectangle2D.Double(10.0D, 320.0D, 385.0D, 75.0D, 10.0D, 10.0D);

        this.cuadroRpm = new Rectangle2D.Double(220.0D, 250.0D, 135.0D, 55.0D);
        this.cuadroDistancia = new Rectangle2D.Double(220.0D, 330.0D, 135.0D, 55.0D);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.BOLD, 30));
        g2.drawString("Velocimetro", 85, 40);

        g2.setPaint(Color.cyan);
        //g2.fill(marcoVelocidad);
        g2.fill(marcoRpm);
        g2.fill(marcoDistancia);

        g2.setPaint(Color.black);
        g2.setFont(new Font("Cambril", Font.PLAIN, 20));
        //g2.drawString("Velocidad(km/h)", 20, 105);
        g2.drawString("RPM", 65, 285);
        g2.drawString("Distancia(km)", 17, 365);

        g2.setPaint(Color.black);
        //g2.draw(cuadroVelocidad);
        g2.draw(cuadroRpm);
        g2.draw(cuadroDistancia);

        //g2.setPaint(Color.black);
        //g2.setFont(new Font("Cambril", Font.PLAIN, 20));
        //g2.drawString(String.valueOf(SCACV.getVelocidadCalculada()), 218, 105);
        this.radial2Lcd1.setValue(SCACV.getVelocidadCalculada());
        //this.radial2Lcd1.setValueAnimated(SCACV.getVelocidadCalculada());
        
        g2.drawString(String.valueOf(SCACV.getRpm()), 275, 285);
        g2.drawString(String.valueOf(SCACV.getDistancia()), 268, 365);

    }

    public void actualizar(){
        repaint();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radial2Lcd1 = new eu.hansolo.steelseries.gauges.Radial2Lcd();

        setLayout(null);

        radial2Lcd1.setMaxValue(300.0);
        radial2Lcd1.setTitle("Velocimetro");
        radial2Lcd1.setTrackVisible(true);
        radial2Lcd1.setUnitString("Km/h");
        radial2Lcd1.setValueTickPeriod(30);
        add(radial2Lcd1);
        radial2Lcd1.setBounds(120, 50, 190, 190);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private eu.hansolo.steelseries.gauges.Radial2Lcd radial2Lcd1;
    // End of variables declaration//GEN-END:variables
}
