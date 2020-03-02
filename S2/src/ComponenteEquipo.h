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
	string getTipo();
	float getPrecio();
	void setPrecio(float precio);
};
// hacer como con VisitanteEquipo?

#endif

