using namespace std;
#ifndef COMPONENTEEQUIPO_H
#define COMPONENTEEQUIPO_H

#include <string>

class VisitanteEquipo;
class VisitantePrecio;
class VisitantePrecioDetalle;
//arregla problema dependencia circular

class ComponenteEquipo {

protected:
	float precio;
	string tipo;

public:

	virtual void aceptar(VisitanteEquipo visitante) = 0;
	virtual string getTipo() = 0;
	virtual float getPrecio() = 0;
	virtual void setTipo(string tipo) = 0;
	virtual void setPrecio(float precio) = 0;
};
// hacer como con VisitanteEquipo?

#endif

