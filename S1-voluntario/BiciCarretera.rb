require('./S1/Bicicleta.rb');

module S1
	public
	class BiciCarretera < Bicicleta

		def self.clone(valor)
			super(valor)
			#new(valor), no sé si esta está bien
		end

		def initialize(valor)
			super(valor)
			#funcionaria al ser privado??
		end

		def getTipo
			puts "Carretera"
		end


		public :clone
	end
end
