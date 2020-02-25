require('./S1/FactoriaCarreraYBicicleta.rb');

module S1
	public
	class FactoriaCarretera < FactoriaCarreraYBicicleta

		public
		def crearBicicleta(valor)			
			BiciCarretera.clone(valor)
		end

		public
		def crearCarrera
			CarreraCarretera.clone
		end
	end
end
