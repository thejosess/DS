#ifndef VISITANTEPRECIO_H
#define VISITANTEPRECIO_H

#include "VisitanteEquipo.h"

class VisitantePrecio : public VisitanteEquipo {

private:
	float coste;

	void visitarDisco(Disco *d);
	void visitarTarjeta(Tarjeta *t);
	void visitarBus(Bus *b);

public:
	VisitantePrecio();
	float getCoste(Equipo eqipo);
};

#endif
