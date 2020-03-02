#include "VisitantePrecioDetalle.h"

using namespace std;

void VisitantePrecioDetalle::getCoste(Equipo equipo)
{
	equipo.getTarjeta()->aceptar(*this);
	equipo.getDisco()->aceptar(*this);
	equipo.getBus()->aceptar(*this);
}

void VisitantePrecioDetalle::visitarDisco(Disco *d)
{
	cout << "Disco: " << d->getPrecio() << endl;
}

void VisitantePrecioDetalle::visitarTarjeta(Tarjeta *t)
{
	cout << "Tarjeta: " << t->getPrecio() << endl;
}

void VisitantePrecioDetalle::visitarBus(Bus *b)
{
	cout << "Bus: " << b->getPrecio() << endl;
}