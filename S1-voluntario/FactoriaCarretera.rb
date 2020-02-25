require_relative "FactoriaCarreraYBicicleta.rb"
require_relative "CarreraCarretera.rb"
require_relative "BiciCarretera.rb"


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

		def initialize
		end
	end
end
