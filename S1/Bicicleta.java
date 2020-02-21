package S1;

public abstract class Bicicleta extends Thread {

	private final long dorsal;
	
	Bicicleta()
	{
		super();
		dorsal = this.getId();
	}

	long getDorsal()
	{
		return dorsal;
	}

	@Override
	public String toString() {
		return "Bicicleta de " + getTipo();
	}

	abstract String getTipo();

	@Override
	public void run()
	{
		for(int i = 1; i <= Carrera.TIEMPO_CARRERA; i++)
		{
			if(i == Carrera.TIEMPO_CARRERA)
				System.out.println("Bici nº " + dorsal + " ha terminado la carrera de " + getTipo());
			else
				System.out.println("Bici nº " + dorsal + " está corriendo en la carrera de " + getTipo());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				System.out.println("No se ha podido completar la espera");
			}
		}
	}
}