require('./S1/FactoriaCarreraYBicicleta.rb');

module S1
	public
	class FactoriaCarretera < FactoriaCarreraYBicicleta

		public
		def crearBicicleta(valor)			
			BiciCarretera.clone(valor)
		end

		public
		def crearCarrera(valor)
			CarreraCarretera.clone(valor)
		end
	end
end
