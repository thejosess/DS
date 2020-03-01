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
	Disco(int valor, string tipo);
	void aceptar(VisitanteEquipo visitante);
	int getPrecio();
	string getTipo();
	void setPrecio(int precio);
	void setTipo(string tipo);
};

#endif
