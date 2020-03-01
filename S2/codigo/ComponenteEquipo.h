using namespace std;
#ifndef COMPONENTEEQUIPO_H
#define COMPONENTEEQUIPO_H

#include <string>

class VisitanteEquipo;
class VisitantePrecio;
class VisitantePrecioDetalle;
//arregla problema dependencia circular

class ComponenteEquipo {

/*private: */
	//si pongo private no me deja acceder en las clases hijas

public:
	int precio;
	string tipo;

	virtual void aceptar(VisitanteEquipo visitante) = 0;
	virtual string getTipo() = 0;
	virtual int getPrecio() = 0;
	virtual void setTipo(string tipo) = 0;
	virtual void setPrecio(int precio) = 0;
};
// hacer como con VisitanteEquipo?

#endif

