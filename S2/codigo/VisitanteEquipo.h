#ifndef VISITANTEEQUIPO_H
#define VISITANTEEQUIPO_H

#include "Bus.h"
#include "Tarjeta.h"
#include "Disco.h"


class VisitanteEquipo {


public:
	// tiene que implementarlos los hijos
	inline void visitarDisco(Disco d){};

	inline void visitarTarjeta(Tarjeta t){};

	inline void visitarBus(Bus b){};
	// segun he leido por el grupo hay que quitarle lo de virtual y dejarlos vacios
};

#endif
