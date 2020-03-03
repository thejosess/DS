#include "VisitantePrecio.h"
#include "iostream"

VisitantePrecio::VisitantePrecio() {
	coste = 0;
}

void VisitantePrecio::visitarDisco(Disco* d, Persona *persona) {
	this->coste += d->getPrecio()*persona->getDescuento();
}
void VisitantePrecio::visitarTarjeta(Tarjeta* t, Persona *persona) {
	this->coste += t->getPrecio()*persona->getDescuento();
}
void VisitantePrecio::visitarBus(Bus* b, Persona *persona) {
	this->coste += b->getPrecio()*persona->getDescuento();
}

void VisitantePrecio::getCoste(Equipo equipo, Persona *persona) {
	equipo.getBus()->aceptar(this, persona);
	equipo.getTarjeta()->aceptar(this, persona);
	equipo.getDisco()->aceptar(this, persona);

	cout << "Precio equipo: " << coste << endl;
	coste = 0;
}