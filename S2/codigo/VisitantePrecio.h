#ifndef VISITANTEPRECIO_H
#define VISITANTEPRECIO_H

//#include "VisitanteEquipo.h"
#include "Equipo.h"

class VisitantePrecio : public VisitanteEquipo {

private:
	int coste;


public:
	VisitantePrecio();
	void calcularCoste(Equipo equipo);

	void visitarDisco(Disco *d);
	void visitarTarjeta(Tarjeta *t);
	void visitarBus(Bus *b);
};

#endif
