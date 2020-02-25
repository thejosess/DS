require('./S1/Bicicleta.rb');
require('./S1/Carrera.rb');
require('./S1/FactoriaCarreraYBicicleta.rb');

module S1
	public
	class Programa

		def main
			
			factoriaCarretera = factoriaCarretera.new
			factoriaMontana = factoriaMontana.new

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
			carreraCarretera.comenzar()
			puts "La carrera " + carreraCarretera.getTipo + " ha finalizado"

			puts "Comienza la carrera " + carreraMontana.getTipo
			carreraMontana.comenzar()
			puts "La carrera " + carreraMontana.getTipo + " ha finalizado"


	end
end
