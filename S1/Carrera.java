package S1;

import java.util.ArrayList;
import java.util.Random;

public abstract class Carrera {

	ArrayList<Bicicleta> bicis;
	double percent;
	int quitar;

	Carrera()
	{
		bicis = new ArrayList<>();
		quitar = 0;
	}

	private void calcularQuitar()
	{
		quitar = (int)(bicis.size() * percent);
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

		bicis.clear();
	}

	void comenzar()
	{
		this.calcularQuitar();

		Random r = new Random();
		int random;
		int descalificar = quitar;


		for(int i = 0; descalificar!= 0; i++)
		{
			random = 0 + r.nextInt((Bicicleta.TIEMPO_CARRERA - 1) + 1) + 1;		//minimo valor el 0 o el 1??,como maximo el 5 ya que quieres quitarlas antes de que acabe la carrera
			bicis.get(i).setRetirada(random);			//creo que el casteo es necesario, abarcariamos los valores de forma correcta?
			descalificar--;
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