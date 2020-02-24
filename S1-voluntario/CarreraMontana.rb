require('./S1/Carrera.rb');

module S1
	public
	class CarreraMontana < Carrera

		def self.clone(valor)
			super(valor)
			#new(valor)
		end

		def initialize(valor)
			super(valor)
			@percent = 0.2
		end

		def setBici(bici)
			if bici.getTipo == "Montaña"
				puts "No se puede inscribir una bicicleta de Carretera a una carrera de Montaña"
			else
				@bicis << bici
		end


		def getTipo
			puts "Montaña"
		end

		public :clone
	end
end
