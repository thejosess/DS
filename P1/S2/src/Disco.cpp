#include "Disco.h"
#include "VisitanteEquipo.h"

Disco::Disco() {
	setPrecio(0);
	this->tipo = "Disco";
}


Disco::Disco(float valor) {
	setPrecio(valor);
	this->tipo = "Disco";
}

void Disco::aceptar(VisitanteEquipo *visitante, Persona *persona) {
	visitante->visitarDisco(this, persona);
}
