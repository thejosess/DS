#ifndef VISITANTEPRECIODETALLE_H
#define VISITANTEPRECIODETALLE_H

#include "VisitanteEquipo.h"
#include "Equipo.h"
#include "iostream"

using namespace std;

class VisitantePrecioDetalle : public VisitanteEquipo {

protected:
	Disco disco;
	Tarjeta tarjeta;
	Bus bus;


public:
	VisitantePrecioDetalle(){};

	void getCoste(Equipo equipo, Persona *persona);

	void visitarDisco(Disco *d, Persona *persona);
	void visitarTarjeta(Tarjeta *t, Persona *persona);
	void visitarBus(Bus *b, Persona *persona);

	//si las quito de ser inline da error
};

#endif
