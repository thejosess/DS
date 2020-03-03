#ifndef VISITANTEPRECIO_H
#define VISITANTEPRECIO_H

#include "VisitanteEquipo.h"

class VisitantePrecio : public VisitanteEquipo {

private:
	float coste;

	void visitarDisco(Disco *d, Persona *persona);
	void visitarTarjeta(Tarjeta *t, Persona *persona);
	void visitarBus(Bus *b, Persona *persona);

public:
	VisitantePrecio();
	void getCoste(Equipo eqipo, Persona *persona);
};

#endif
