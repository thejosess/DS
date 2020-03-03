#include "VisitantePrecioDetalle.h"

using namespace std;

void VisitantePrecioDetalle::getCoste(Equipo equipo, Persona *persona)
{
	equipo.getTarjeta()->aceptar(this, persona);
	equipo.getDisco()->aceptar(this, persona);
	equipo.getBus()->aceptar(this, persona);
}

void VisitantePrecioDetalle::visitarDisco(Disco *d, Persona *persona)
{
	cout << "Disco: " << d->getPrecio()*persona->getDescuento() << endl;
}

void VisitantePrecioDetalle::visitarTarjeta(Tarjeta *t, Persona *persona)
{
	cout << "Tarjeta: " << t->getPrecio()*persona->getDescuento() << endl;
}

void VisitantePrecioDetalle::visitarBus(Bus *b, Persona *persona)
{
	cout << "Bus: " << b->getPrecio()*persona->getDescuento() << endl;
}