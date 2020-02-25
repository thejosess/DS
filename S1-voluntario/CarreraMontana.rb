require_relative "Carrera.rb"

module S1
	public
	class CarreraMontana < Carrera

		# def clone()
		# 	CarreraMontana.new
		# 	#new(valor)
		# end

		def initialize()
			super
			@percent = 0.2
		end

		def setBici(bici)
			if bici.getTipo == "Carretera"
				puts "No se puede inscribir una bicicleta de Carretera a una carrera de Montaña"
			else
				@bicis << bici
			end
		end

		def getTipo
			"Montaña"
		end

		public :clone
	end
end
