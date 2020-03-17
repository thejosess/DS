#ifndef BUS_H
#define BUS_H

#include "ComponenteEquipo.h"

class Bus : public ComponenteEquipo {

public:
	Bus();
	Bus(float valor);
	void aceptar(VisitanteEquipo *visitante, Persona *persona);
};

#endif
