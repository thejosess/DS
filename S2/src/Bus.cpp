#include "Bus.h"
#include "VisitanteEquipo.h"

Bus::Bus() {
	setPrecio(0);
	this->tipo;
}

Bus::Bus(float valor){
	setPrecio(valor);
	this->tipo;
}

void Bus::aceptar(VisitanteEquipo *visitante, Persona *persona) {
	visitante->visitarBus(this, persona);
}
