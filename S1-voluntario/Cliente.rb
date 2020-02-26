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
    class Cliente
        
        def initialize
            @proto_BiciCarretera = BiciCarretera.new(-1);
			@proto_BiciMontana = BiciMontana.new(-1);
			@proto_CarreraCarretera = CarreraCarretera.new
            @proto_CarreraMontana = CarreraMontana.new
            
            @factoria = Factoria.new
        end

        def crearCarreraCarretera(n)
            carrera = @factoria.crear(@proto_CarreraCarretera)
            carrera.inicializar(n, @proto_BiciCarretera, @factoria)
            return carrera
        end

        def crearCarreraMontana(n)
            carrera = @factoria.crear(@proto_CarreraMontana)
            carrera.inicializar(n, @proto_BiciMontana, @factoria)
            return carrera
        end
    end
end
