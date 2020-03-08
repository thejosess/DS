package S3;

import java.util.Observable;

public class Simulador extends Observable {
    private float temperatura;

    /**
     * @return the temperatura
     */
    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temp) {
        temperatura = temp;
    }
}