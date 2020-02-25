require_relative "FactoriaCarreraYBicicleta.rb"
require_relative "CarreraMontana.rb"
require_relative "BiciMontana.rb"

module S1
	public
	class FactoriaMontana < FactoriaCarreraYBicicleta

		public
		def crearBicicleta(valor)
			BiciMontana.clone(valor)
		end

		public
		def crearCarrera
			CarreraMontana.clone
		end

		def initialize
		end
	end
end
