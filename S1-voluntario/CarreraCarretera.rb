require('./S1/Carrera.rb');

module S1
	public
	class CarreraCarretera < Carrera

		def self.clone(valor)
			super(valor)
			#new(valor)
		end

		def initialize(valor)
			super(valor)
			@percent = 0.1
		end

		def getTipo
			puts "Carretera"
		end


		def setBici(bici)
			if bici.getTipo == "Carretera"
				puts "No se puede inscribir una bicicleta de Carretera a una carrera de Montaña"
			else
				@bicis << bici
		end

		public :clone
	end
end
