package S1;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);

        Cliente cliente = new Cliente();

        Carrera carreraMontana;
        Carrera carreraCarretera;

        while(n != -1)
        {
            System.out.println("\n¿Cuantas bicicletas conforman la carrera? (-1 para finalizar): ");
            n = in.nextInt(); in.skip("\n");

            carreraCarretera = cliente.crearCarreraCarretera(n);
            carreraMontana = cliente.crearCarreraMontana(n);

            carreraCarretera.comenzar();
            carreraMontana.comenzar();

            carreraCarretera.finalizar();
            carreraMontana.finalizar();
        }
        in.close();
    }
}