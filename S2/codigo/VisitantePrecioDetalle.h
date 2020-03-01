#ifndef VISITANTEPRECIODETALLE_H
#define VISITANTEPRECIODETALLE_H

#include "VisitanteEquipo.h"
#include "Equipo.h"

class VisitantePrecioDetalle : VisitanteEquipo {


public:
	void equipoDetalle(Equipo equipo);

	void visitarDisco(Disco d);
	void visitarTarjeta(Tarjeta t);
	void visitarBus(Bus b);
};

#endif
