#include "VisitantePrecio.h"

VisitantePrecio::VisitantePrecio() {
	coste = 0;
}

void VisitantePrecio::visitarDisco(Disco* d) {
	this->coste += d->getPrecio;
}
void VisitantePrecio::visitarTarjeta(Tarjeta* t) {
	this->coste += t->getPrecio;
}
void VisitantePrecio::visitarBus(Bus* b) {
	this->coste += b->getPrecio;
}

float VisitantePrecio::getCoste() {
	return this->coste;
}

