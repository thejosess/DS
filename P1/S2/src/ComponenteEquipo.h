using namespace std;
#ifndef COMPONENTEEQUIPO_H
#define COMPONENTEEQUIPO_H

#include <string>
#include "Persona.h"

class VisitanteEquipo;
class VisitantePrecio;
class VisitantePrecioDetalle;
//arregla problema dependencia circular

class ComponenteEquipo {

protected:
	float precio;
	string tipo;

public:

	virtual void aceptar(VisitanteEquipo *visitante, Persona *persona) = 0;
	string getTipo();
	float getPrecio();
	void setPrecio(float precio);
};
// hacer como con VisitanteEquipo?

#endif

