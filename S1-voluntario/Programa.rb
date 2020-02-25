require_relative "Bicicleta.rb"
require_relative "Carrera.rb"
#require_relative "FactoriaCarreraYBicicleta.rb"
require_relative "FactoriaMontana.rb"
require_relative "FactoriaCarretera.rb"
#require de las distintas carreras y bicicletas?



module S1
	public
	class Programa

		def self.main
			
			factoriaCarretera = FactoriaCarretera.new
			factoriaMontana = FactoriaMontana.new

			carreraCarretera = factoriaCarretera.crearCarrera
			carreraMontana = factoriaMontana.crearCarrera




			puts "¿Cuantas bicicletas conforman la carrera?: "
			n = gets.to_i
			puts "\n"

			for i in 0..n
				carreraCarretera.setBici(factoriaCarretera.crearBicicleta(i))
				carreraMontana.setBici(factoriaMontana.crearBicicleta(i))
			end

			puts "Comienza la carrera " + carreraCarretera.getTipo
			puts carreraCarretera.inspect
			carreraCarretera.comenzar()
			puts "La carrera " + carreraCarretera.getTipo + " ha finalizado"

			puts "Comienza la carrera " + carreraMontana.getTipo
			carreraMontana.comenzar()
			puts "La carrera " + carreraMontana.getTipo + " ha finalizado"

		end
	end
	Programa.main
end
