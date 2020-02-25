require_relative "CarreraCarretera.rb"
require_relative "BiciCarretera.rb"


module S1
	public
	class Factoria

		public
		def crear(prototipo, dorsal = -1)
			obj = prototipo.clone
			if obj.is_a?(Bicicleta)
				obj.setId(dorsal)
			end
			return obj
		end
	end
end
