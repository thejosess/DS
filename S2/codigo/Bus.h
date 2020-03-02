#ifndef BUS_H
#define BUS_H

#include "ComponenteEquipo.h"

class Bus : public ComponenteEquipo {

public:
	Bus();
	Bus(float valor, string tipo);
	void aceptar(VisitanteEquipo visitante);
	float getPrecio();
	string getTipo();
	void setTipo(string tipo);
	void setPrecio(float precio);
};

#endif
