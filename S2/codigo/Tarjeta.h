#ifndef TARJETA_H
#define TARJETA_H

#include "ComponenteEquipo.h"

class Tarjeta : public ComponenteEquipo {


public:
	Tarjeta();
	Tarjeta(int precio, string tipo);
	void aceptar(VisitanteEquipo visitante);
	int getPrecio();
	string getTipo();
	void setPrecio(int precio);
	void setTipo(string tipo);
};

#endif
