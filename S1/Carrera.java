package S1;

import java.util.ArrayList;
import java.util.Random;

public abstract class Carrera {

	ArrayList<Bicicleta> bicis;
	double percent;

	Carrera()
	{
		bicis = new ArrayList<>();
	}

	void inicializar(int n, FactoriaCarreraYBicicleta factoria)
	{
		for(int i = 0; i < n; i++)
			setBici(factoria.crearBicicleta());
	}

	int calcularQuitar()
	{
		return (int)(bicis.size() * percent);
	}

	void finalizar()
	{
		for (Bicicleta bicicleta : bicis) {
			try {
				bicicleta.join();
			} catch (Exception e) {
				System.out.println("La bicicleta " + bicicleta.getDorsal() + " no ha podido finalizar");
			}
		}

		// System.out.println("\n" + quitar + " bicis han sido descalificadas de la carrera de " + getTipo());

		bicis.clear();
		System.out.println("La carrera de " + getTipo() + " ha finalizado");
	}

	void comenzar()
	{
		int quitar = calcularQuitar();

		Random r = new Random();
		int random;

		for(int i = 0; quitar != 0; i++)
		{
			random = r.nextInt(Bicicleta.TIEMPO_CARRERA - 1) + 1;			//minimo valor el 0 o el 1??,como maximo el 5 ya que quieres quitarlas antes de que acabe la carrera
			bicis.get(i).setRetirada(random);			//creo que el casteo es necesario, abarcariamos los valores de forma correcta?
			quitar--;
		}

		//para hacer lo de arriba en el mismo momento para todas es cuestión de dejar el random fijo y ya
		//no sé como lo preferirá la profe

		for (final Bicicleta bicicleta : bicis) {
			bicicleta.start();
		}
	}

	abstract void setBici(Bicicleta bici);

	@Override
	public String toString() {
		return "Carrera de " + getTipo();
	}

	abstract String getTipo();
}
