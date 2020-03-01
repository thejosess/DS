#ifndef VISITANTEEQUIPO_H
#define VISITANTEEQUIPO_H

#include "Tarjeta.h"
#include "Disco.h"
#include "Bus.h"
//dependencia circular

class VisitanteEquipo {

public:
	// tiene que implementarlos los hijos
	void visitarDisco(Disco *d);

	void visitarTarjeta(Tarjeta *t);

	void visitarBus(Bus *b);
	// segun he leido por el grupo hay que quitarle lo de virtual y dejarlos vacios
};

#endif
