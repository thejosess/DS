#include "Tarjeta.h"
#include "VisitanteEquipo.h"

Tarjeta::Tarjeta() {
	setPrecio(0);
	this->tipo = "Tarjeta";
}

Tarjeta::Tarjeta(float precio) {
	setPrecio(precio);
	this->tipo = "Tarjeta";
}

void Tarjeta::aceptar(VisitanteEquipo visitante) {
	visitante.visitarTarjeta(this);
}
