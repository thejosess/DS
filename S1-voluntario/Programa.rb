require_relative "Cliente.rb"

module S1
	public
	class Programa

		def self.main
			
			cliente = Cliente.new

			
			puts "¿Cuantas bicicletas conforman la carrera?: "
			n = gets.to_i
			puts "\n"
			
			carreraCarretera = cliente.crearCarreraCarretera(n)
			carreraMontana = cliente.crearCarreraMontana(n)

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
