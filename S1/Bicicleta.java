package S1;

public abstract class Bicicleta extends Thread {

	private final int id;

	Bicicleta()
	{
		this.id = this.getId();
	}

	@Override
	public void run()
	{
		for(int i = 0; i < 60; i++)
		{
			System.out.println("Bici nº " + id + "está corriendo");
			sleep(1000);
		}
		System.out.println("Bici nº " + id + "ha terminado");
	}
}