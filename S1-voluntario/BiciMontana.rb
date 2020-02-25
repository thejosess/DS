require('./S1/Bicicleta.rb');

module S1
	public
	class BiciMontana < Bicicleta



		def initialize(valor)
			super(valor)
		end

		public
		def getTipo
			puts "Montaña"
		end
		
		def self.clone(valor)
			new(valor)
			#new(valor)
		end


		#private_class_method :new
		#public :clone :getTipo
	end
end
