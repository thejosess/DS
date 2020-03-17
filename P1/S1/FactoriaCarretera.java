package S1;

public class FactoriaCarretera extends FactoriaCarreraYBicicleta {

	@Override
	public Bicicleta crearBicicleta() {
		return new BiciCarretera();
	}

	@Override
	public Carrera crearCarrera() {
		return new CarreraCarretera();
	}

}