#ifndef BUS_H
#define BUS_H

#include "ComponenteEquipo.h"

class Bus : public ComponenteEquipo {

public:
	Bus();
	Bus(int valor, string tipo);
	void aceptar(VisitanteEquipo visitante);
	int getPrecio();
	string getTipo();
	void setTipo(string tipo);
	void setPrecio(int precio);
};

#endif
