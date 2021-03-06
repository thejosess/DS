package S3;

import java.util.Observable;

import javax.swing.Timer;
import java.awt.event.*;
import java.util.Random;

public class Simulador extends Observable {
    private float temperatura;
    final static float MAX_TEMP = 30;
    final static float MIN_TEMP = 0;
    
    
    final Timer timer = new Timer(1000, new ActionListener()
    {   
        public void actionPerformed(final ActionEvent e)
        {
            actualizarTemperatura();
        }
    }); 
    
    Simulador(GraficaTemperatura grafica, BotonCambio boton)
    {
        this.addObserver(grafica);
        this.addObserver(boton);
        this.temperatura = MIN_TEMP;
    }
    
    Simulador()
    {
        this.temperatura = MIN_TEMP;
    }
    
    void empezar()
    {
        timer.start();
        //this.actualizarTemperatura();
    }
    
    private void actualizarTemperatura()
    {
        Random r = new Random();
        temperatura = MIN_TEMP + r.nextFloat() * (MAX_TEMP - MIN_TEMP);
        
        this.setChanged();
        this.notifyObservers(temperatura);
    }
    
    private void actualizarTemperatura(float temp)
    {
        temperatura = temp;
        
        this.setChanged();
        this.notifyObservers();
    }

    /**
     * @return the temperatura
     */
    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temp) {
        temperatura = temp;
        this.setChanged();
        this.notifyObservers(temperatura);
    }
}