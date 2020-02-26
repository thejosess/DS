require_relative "Bicicleta.rb"

module S1
	public
	class BiciCarretera < Bicicleta

		def initialize(valor)
			super(valor)
		end

		def getTipo
			"Carretera"
		end
	end
end
