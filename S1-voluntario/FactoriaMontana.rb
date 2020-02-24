require('./S1/FactoriaCarreraYBicicleta.rb');

module S1
	public
	class FactoriaMontana < FactoriaCarreraYBicicleta

		public
		def crearBicicleta(valor)
			BiciMontana.clone(valor)
		end

		public
		def crearCarrera(valor)
			CarreraMontana.clone(valor)
		end
	end
end
