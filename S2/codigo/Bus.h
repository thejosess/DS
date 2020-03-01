using namespace std;

#ifndef BUS_H
#define BUS_H

#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

class Bus : ComponenteEquipo {


public:
	Bus();
	void aceptar(VisitanteEquipo visitante);
};

#endif
