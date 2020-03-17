package S1;

public class FactoriaMontana extends FactoriaCarreraYBicicleta {

	@Override
	public Bicicleta crearBicicleta() {
		return new BiciMontana();
	}

	@Override
	public Carrera crearCarrera() {
		return new CarreraMontana();
	}

}