package S1;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);

        FactoriaCarreraYBicicleta factoriaCarretera = new FactoriaCarretera();

        FactoriaCarreraYBicicleta factoriaMontana = new FactoriaMontana();

        Carrera carreraMontana = factoriaMontana.crearCarrera();
        Carrera carreraCarretera = factoriaCarretera.crearCarrera();

        while(n != -1)
        {
            System.out.println("\n" + "¿Cuantas bicicletas conforman la carrera?: ");
            n = in.nextInt(); in.skip("\n");

            carreraCarretera.inicializar(n, factoriaCarretera);
            carreraMontana.inicializar(n, factoriaMontana);

            carreraCarretera.comenzar();
            carreraMontana.comenzar();

            carreraCarretera.finalizar();
            carreraMontana.finalizar();
        }
        in.close();
    }
}