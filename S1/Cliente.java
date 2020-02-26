package S1;

public class Cliente {

    FactoriaCarreraYBicicleta factoriaCarretera;
    FactoriaCarreraYBicicleta factoriaMontana;

    Cliente()
    {
        factoriaCarretera = new FactoriaCarretera();
        factoriaMontana = new FactoriaMontana();
    }

    Carrera crearCarreraCarretera(int n)
    {
        Carrera carrera = factoriaCarretera.crearCarrera();
        carrera.inicializar(n, factoriaCarretera);

        return carrera;
    }

    Carrera crearCarreraMontana(int n)
    {
        Carrera carrera = factoriaMontana.crearCarrera();
        carrera.inicializar(n, factoriaMontana);
        
        return carrera;
    }
}