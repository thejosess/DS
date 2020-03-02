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

	void getCoste(Equipo equipo);

	void visitarDisco(Disco *d);
	void visitarTarjeta(Tarjeta *t);
	void visitarBus(Bus *b);

	//si las quito de ser inline da error
};

#endif
