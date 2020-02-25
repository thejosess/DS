require_relative "BiciMontana.rb"
require_relative "CarreraCarretera.rb"
require_relative "BiciCarretera.rb"
require_relative "CarreraMontana.rb"
#require_relative "FactoriaCarreraYBicicleta.rb"
# require_relative "FactoriaMontana.rb"
require_relative "Factoria.rb"
#require de las distintas carreras y bicicletas?



module S1
	public
	class Programa

		def self.main

			proto_BiciCarretera = BiciCarretera.new(-1);
			proto_BiciMontana = BiciMontana.new(-1);
			proto_CarreraCarretera = CarreraCarretera.new
			proto_CarreraMontana = CarreraMontana.new
			
			factoria = Factoria.new

			carreraCarretera = factoria.crear(proto_CarreraCarretera)
			carreraMontana = factoria.crear(proto_CarreraMontana)

			puts "¿Cuantas bicicletas conforman la carrera?: "
			n = gets.to_i
			puts "\n"

			for i in 0..n-1
				biciCarretera = factoria.crear(proto_BiciCarretera, i)
				carreraCarretera.setBici(biciCarretera)

				biciMontana = factoria.crear(proto_BiciMontana, i)
				carreraMontana.setBici(biciMontana)
			end

			puts "Comienza la carrera de " + carreraCarretera.getTipo
			carreraCarretera.comenzar()
			puts
			puts "La carrera de " + carreraCarretera.getTipo + " ha finalizado"
			puts

			puts "Comienza la carrera de " + carreraMontana.getTipo
			carreraMontana.comenzar()
			puts
			puts "La carrera de " + carreraMontana.getTipo + " ha finalizado"
		end
	end
	Programa.main
end
