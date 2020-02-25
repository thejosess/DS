require_relative "Bicicleta.rb"

module S1
	public
	class BiciMontana < Bicicleta

		# def clone(valor)
		# 	BiciMontana.new(valor)
		# 	#new(valor)
		# end

		def initialize(valor)
			super(valor)
		end

		public
		def getTipo
			"Montaña"
		end


		#private_class_method :new
		#public :clone :getTipo
	end
end
