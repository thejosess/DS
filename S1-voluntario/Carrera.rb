#require_relative "Bicicleta.rb"
require_relative "BiciMontana.rb"
require_relative "BiciCarretera.rb"

module S1
	public
	class Carrera

		def self.clone()
			#new
		end

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
				random = rand 1..5 
				@bicis[i].setRetirada(random)
				@quitar -= 1
				i += 1
			end

			@bicis.each do |bicicleta|
				bicicleta.run
			end

			puts "\n La carrera de " + getTipo()+  " ha terminado "

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
