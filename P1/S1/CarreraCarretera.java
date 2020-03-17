package S1;

public class CarreraCarretera extends Carrera {
    CarreraCarretera()
    {
        super();
        percent = 0.1;
    }

    @Override
    void setBici(Bicicleta bici) {
        if(bici.getTipo() == "Montaña")
        {
            System.out.println("No se puede inscribir una bicicleta de Montaña a una carrera de Carretera");
            System.exit(1);
        }
        else
            bicis.add(bici);
    }

    @Override
    String getTipo() {
        return "Carretera";
    }
}