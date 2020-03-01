#ifndef DISCO_H
#define DISCO_H

#include "ComponenteEquipo.h"
#include "VisitanteEquipo.h"

class Disco : ComponenteEquipo {


public:
	Disco();
	void aceptar(VisitanteEquipo visitante);
};

#endif
