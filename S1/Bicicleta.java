package S1;

public abstract class Bicicleta extends Thread {

	private final long dorsal;
	static final int TIEMPO_CARRERA = 60;
	private int retirada;
	
	Bicicleta()
	{
		super();
		dorsal = this.getId();
		retirada = TIEMPO_CARRERA;
	}

	void setRetirada(int valor){
		this.retirada = valor;
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
		for(int i = 1; i <= TIEMPO_CARRERA; i++)
		{
			if(i == TIEMPO_CARRERA)
				System.out.println("Bici nº " + dorsal + " ha terminado la carrera de " + getTipo());
			else if(i != retirada)
				System.out.println("Bici nº " + dorsal + " está corriendo en la carrera de " + getTipo());
			else
			{
				System.out.println("La bici " + dorsal + " ha sido descalificada de la carrera de " + getTipo());
				//habria que poner aqui stop ya que no lo hacemos en Carrera??
				this.stop();
				//aunque no la estariamos quitando del Array, es la unica pega que le veo a esto, pero realmente hace falta quitarlo del array?
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				System.out.println("No se ha podido completar la espera");
			}
		}
	}
}