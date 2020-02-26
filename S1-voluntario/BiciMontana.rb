require_relative "Bicicleta.rb"

module S1
	public
	class BiciMontana < Bicicleta

		def initialize(valor)
			super(valor)
		end

		public
		def getTipo
			"Montaña"
		end
	end
end
