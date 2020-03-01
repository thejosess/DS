#ifndef TARJETA_H
#define TARJETA_H

#include "ComponenteEquipo.h"
#include "VisitanteEquipo.h"

class Tarjeta : ComponenteEquipo {


public:
	Tarjeta();
	void aceptar(VisitanteEquipo visitante);
};

#endif
