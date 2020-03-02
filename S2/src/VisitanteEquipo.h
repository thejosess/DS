#ifndef VISITANTEEQUIPO_H
#define VISITANTEEQUIPO_H

#include "Equipo.h"
#include "Disco.h"
#include "Tarjeta.h"
#include "Bus.h"
//dependencia circular

class VisitanteEquipo {

public:
	// tiene que implementarlos los hijos
	virtual void visitarDisco(Disco *d);

	virtual void visitarTarjeta(Tarjeta *t);

	virtual void visitarBus(Bus *b);
	// segun he leido por el grupo hay que quitarle lo de virtual y dejarlos vacios
};

#endif
