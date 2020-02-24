package S1;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;
import java.awt.event.*;

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
		
		/*final Timer timer = new Timer(1000, new ActionListener()
		{
			Random r = new Random();
			double random;

			public void actionPerformed(final ActionEvent e)
			{
				if(quitar > 0)
				{
					random = 0 + r.nextDouble() * (1 - 0);
					if(random < percent && bicis.get(0).isAlive())
					{
						bicis.get(0).stop();
						System.out.println("La bici " + bicis.get(0).getDorsal() + " ha sido descalificada de la carrera de " + getTipo());
						bicis.remove(0);
						quitar -= 1;
					}
				}
			}
		});
			*/



		Random r = new Random();
		int random;


		for(int i = 0; quitar!= 0; i++)
		{
			random = 1 + r.nextInt()* (5 - 1);			//minimo valor el 0 o el 1??,como maximo el 5 ya que quieres quitarlas antes de que acabe la carrera
			bicis.get(i).setRetirada(random);			//creo que el casteo es necesario, abarcariamos los valores de forma correcta?
			quitar--;
			System.out.println("Ha entrado"+this.getTipo()+"el random sale"+random);
		}

		//para hacer lo de arriba en el mismo momento para todas es cuestión de dejar el random fijo y ya
		//no sé como lo preferirá la profe


		for (final Bicicleta bicicleta : bicis) {
			bicicleta.start();
		}
		//timer.start();


	}

	abstract void setBici(Bicicleta bici);

	@Override
	public String toString() {
		return "Carrera de " + getTipo();
	}

	abstract String getTipo();
}