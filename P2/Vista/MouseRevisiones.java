/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.SCACV;
import Controlador.EstadoMotor;
import Controlador.Motor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author José Santos y Raúl Soria
 */
public class MouseRevisiones extends MouseAdapter{
  private SCACV SCACV;
  private Motor motor;
          
  public MouseRevisiones(Motor motor, SCACV SCACV){
    this.SCACV = SCACV;
    this.motor = motor;
  }
  
  @Override
  public void mouseClicked(MouseEvent event) {
    int x = event.getX();
    int y = event.getY();
   
    if(motor.getEstadoMotor()==EstadoMotor.APAGADO && SCACV.getVelocidadCalculada()==0){
        if ((x > 10) && (x < 310) && (y > 60) && (y < 135)) {
          SCACV.reiniciarRevolucionesRevisionMotor();
        } 

        if ((x > 10) && (x < 310) && (y > 140) && (y < 215)) {
          SCACV.reiniciarRevolucionesRevisionPastillas();
        }

        if ((x > 10) && (x < 310) && (y > 220) && (y < 295)) {
          SCACV.reiniciarRevolucionesRevisionGeneral();
        }
    }
  }
}