#ifndef TARJETA_H
#define TARJETA_H

#include "ComponenteEquipo.h"

class Tarjeta : public ComponenteEquipo {


public:
	Tarjeta();
	Tarjeta(float precio, string tipo);
	void aceptar(VisitanteEquipo visitante);
	float getPrecio();
	string getTipo();
	void setPrecio(float precio);
	void setTipo(string tipo);
};

#endif
