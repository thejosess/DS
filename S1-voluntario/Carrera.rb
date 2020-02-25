#require_relative "Bicicleta.rb"
require_relative "BiciMontana.rb"
require_relative "BiciCarretera.rb"

module S1
	public
	class Carrera

		# def clone()
		# 	#new
		# end

		def initialize()
			@bicis = Array.new
			@quitar = 0
			@percent
		end

		def calcularQuitar
			@quitar = @bicis.length * @percent
			#hacer casting
			@quitar = @quitar.round
		end

		def finalizar
			#@bicis.each do |bicicleta|				end
			#hacer algo con las bicis o simplemente esperar??
		end

		def comenzar
			calcularQuitar

			i = 0

			while @quitar != 0
				random = rand 1..Bicicleta.TIEMPO_CARRERA-1 #FIXME: No me acaba de convencer que quitemos siempre las primeras bicis
															# Habría que hacer random de las bicis
				@bicis[i].setRetirada(random)
				@quitar -= 1
				i += 1
			end

			@bicis.each do |bicicleta|
				bicicleta.run
			end
		end

		def setBici(bici)
		end

		def to_s
			puts "Carrera de " + getTipo()
		end

		def getTipo
		end

		public :clone
		private :calcularQuitar
	end
end
