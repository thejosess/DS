package S1;

public class CarreraMontana extends Carrera {
    CarreraMontana()
    {
        super();
        percent = 0.2;
    }

    @Override
    void setBici(Bicicleta bici) {
        if(bici.getTipo() == "Carretera")
        {
            System.out.println("No se puede inscribir una bicicleta de Carretera a una carrera de Montaña");
            System.exit(1);
        }
        else
            bicis.add(bici);
    }

    @Override
    String getTipo() {
        return "Montaña";
    }
}