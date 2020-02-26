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
			random = r.nextInt(Bicicleta.TIEMPO_CARRERA - 1) + 1;			
			bicis.get(i).setRetirada(random);			
			quitar--;
		}
		//para retirar en el mismo momento para todas es cuestión de dejar el random fijo

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
