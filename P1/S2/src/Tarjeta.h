#ifndef TARJETA_H
#define TARJETA_H

#include "ComponenteEquipo.h"

class Tarjeta : public ComponenteEquipo {


public:
	Tarjeta();
	Tarjeta(float precio);
	void aceptar(VisitanteEquipo *visitante, Persona *persona);
};

#endif
