/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EstadoMotor;
import Controlador.Palanca;
import Controlador.EstadoPalanca;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author José Santos y Raúl Soria
 */
public class MousePedales extends MouseAdapter{
  private PanelPedales panel;
  private Palanca palanca;
  
  public MousePedales(PanelPedales panel, Palanca palanca)
  {
    this.panel = panel;
    this.palanca = palanca;
  }
  
  @Override
  public void mouseClicked(MouseEvent event) {
    int x = event.getX();
    int y = event.getY();
    
    if ((x > 20) && (x < 196) && (y > 10) && (y < 60)) {
      if (panel.getEstadoMotor() == EstadoMotor.APAGADO){
        panel.arrancarMotor();
      }
      else if(panel.getEstadoMotor() == EstadoMotor.ENCENDIDO && palanca.getEstadoPalanca() == EstadoPalanca.APAGAR){
        panel.apagarMotor();
      }
    }
  }
  
  @Override
  public void mousePressed(MouseEvent event){
    int x = event.getX();
    int y = event.getY();
    
    if ((x > 226) && (x < 402) && (y > 10) && (y < 60)) {
      if ((panel.getEstadoMotor() == EstadoMotor.ENCENDIDO)) {
        panel.pisarAcelerador();
      }
    }
    
    else if ((x > 442) && (x < 618) && (y > 10) && (y < 60)) {
        panel.pisarFreno();
    }
  }
  
  @Override
  public void mouseReleased(MouseEvent event) {
    int x = event.getX();
    int y = event.getY();
    
    if ((x > 226) && (x < 402) && (y > 10) && (y < 60)) {
      if ((panel.getEstadoMotor() == EstadoMotor.ENCENDIDO)) {
        panel.soltarAcelerador();
      }
    }
    
    else if ((x > 442) && (x < 618) && (y > 10) && (y < 60)) {
        panel.soltarFreno();
    }
  }
}