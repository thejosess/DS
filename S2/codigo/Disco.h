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
	Disco(float valor, string tipo);
	void aceptar(VisitanteEquipo visitante);
	float getPrecio();
	string getTipo();
	void setPrecio(float precio);
	void setTipo(string tipo);
};

#endif
