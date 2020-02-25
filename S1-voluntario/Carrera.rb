require('./S1/Programa.rb');

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
		end

		def finalizar
			#@bicis.each do |bicicleta|				end
			#hacer algo con las bicis o simplemente esperar??
		end

		def comenzar
			for i in 0..@quitar
				random = rand 1..5 
				@bicis[i].setRetirada(random)
				quitar -= 1
				puts "Ha entrado"+getTipo()+"el random sale"+random
			end

			for @bicis.each do |bicicleta|
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
