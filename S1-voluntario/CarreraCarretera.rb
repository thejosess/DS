require_relative "Carrera.rb"


module S1
	public
	class CarreraCarretera < Carrera

		# def clone
		# 	CarreraCarretera.new
		# 	#new(valor)
		# end

		def initialize
			super
			@percent = 0.1
		end

		def getTipo
			"Carretera"
		end

		def setBici(bici)
			if bici.getTipo == "Montaña"
				puts "No se puede inscribir una bicicleta de Carretera a una carrera de Montaña"
			else
				@bicis << bici
			end
		end

		public :clone
	end
end
