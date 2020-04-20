/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EstadoMotor;
import Controlador.EstadoPalanca;
import Controlador.Motor;
import Controlador.Palanca;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author José Santos y Raúl Soria
 */
public class MousePalanca extends MouseAdapter{
  private Palanca palanca;
  private Motor motor;
          
  public MousePalanca(Motor motor, Palanca palanca){
    this.palanca = palanca;
    this.motor = motor;
  }
  
  @Override
  public void mouseClicked(MouseEvent event) {
    int x = event.getX();
    int y = event.getY();
   
    if(motor.getEstadoMotor()==EstadoMotor.ENCENDIDO){
        if ((x > 15) && (x < 151) && (y > 136) && (y < 199)) {
          palanca.cambiarPalanca(EstadoPalanca.APAGAR);
        } 

        if ((x > 106) && (x < 207) && (y > 63) && (y < 126)) {
          palanca.cambiarPalanca(EstadoPalanca.ACELERAR);
        }

        if ((x > 198) && (x < 303) && (y > 136) && (y < 199)) {
          palanca.cambiarPalanca(EstadoPalanca.MANTENER);
        }

        if ((x > 106) && (x < 207) && (y > 209) && (y < 272)) {
          palanca.cambiarPalanca(EstadoPalanca.REINICIAR);
        }
    }
  }
}