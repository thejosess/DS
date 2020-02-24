require('./S1/Programa.rb');

module S1
	public
	class Bicicleta

		@@TIEMPO_CARRERA = 6

		def self.clone(valor)
			new(valor)
		end

		def initialize(id)
			@retirada = 6
			@dorsal = id
		end
		#creo que estaria bien pasandole por argumento el id

		def setRetirada(valor)
			@retirada = valor
		end

		def getDorsal
			@dorsal
		end

		def to_s
			"Bicicleta de " + getTipo
		end
		
		def getTipo
			#metodo abstracto
		end

		def run()

			continuar=true
			
			for i in 1..@retirada && continuar

				if i == @@TIEMPO_CARRERA
					puts "Bici nº " + dorsal + " ha terminado la carrera de " + getTipo()
					#cotinuar = false
					exit
				elsif i != retirada
					puts "Bici nº " + dorsal + " está corriendo en la carrera de " + getTipo()
				else
					puts "La bici " + dorsal + " ha sido descalificada de la carrera de " + getTipo()
					#cotinuar = false
					exit
				end
				sleep(1)
			end

		end

		public :clone
	end
	#bici = Bicicleta.clone(2)
end
