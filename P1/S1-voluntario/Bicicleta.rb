module S1
	public
	class Bicicleta

		@@TIEMPO_CARRERA = 60

		def initialize(id)
			@retirada = @@TIEMPO_CARRERA
			@dorsal = id
		end

		def setRetirada(valor)
			@retirada = valor
		end

		def self.TIEMPO_CARRERA
			@@TIEMPO_CARRERA
		end

		def getDorsal
			@dorsal
		end

		attr_reader :retirada

		def to_s
			"Bicicleta de " + getTipo
		end
		
		def getTipo
			#metodo abstracto
		end

		def setId(id)
			@dorsal = id
		end

		def run()
			
			for i in 1..@@TIEMPO_CARRERA do

				if i == @@TIEMPO_CARRERA
					puts "Bici nº " + @dorsal.to_s + " ha terminado la carrera de " + getTipo()
					#cotinuar = false
					break
				elsif i != @retirada
					puts "Bici nº " + @dorsal.to_s + " está corriendo en la carrera de " + getTipo()
				else
					puts "La bici " + @dorsal.to_s + " ha sido descalificada de la carrera de " + getTipo()
					#cotinuar = false
					break
				end
				sleep(1)
			end

		end

	end
end
