#ifndef DISCO_H
#define DISCO_H

#include "ComponenteEquipo.h"

class Disco : public ComponenteEquipo {
	
	/*
private:
	int precio;
	string tipo;*/

public:
	Disco();
	Disco(float valor);
	void aceptar(VisitanteEquipo visitante);
};

#endif
