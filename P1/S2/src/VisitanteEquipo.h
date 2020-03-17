#ifndef VISITANTEEQUIPO_H
#define VISITANTEEQUIPO_H

#include "Equipo.h"
#include "Disco.h"
#include "Tarjeta.h"
#include "Bus.h"
#include "Persona.h"
//dependencia circular

class VisitanteEquipo {

public:
	// tiene que implementarlos los hijos
	virtual void visitarDisco(Disco *d, Persona *p);

	virtual void visitarTarjeta(Tarjeta *t, Persona *p);

	virtual void visitarBus(Bus *b, Persona *p);
	// segun he leido por el grupo hay que quitarle lo de virtual y dejarlos vacios
};

#endif
