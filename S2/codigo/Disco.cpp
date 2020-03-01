#include "Disco.h"
#include "VisitanteEquipo.h"

Disco::Disco() {
	setPrecio(0);
	setTipo("");
}


Disco::Disco(int valor, string tipo) {
	setPrecio(valor);
	setTipo(tipo);
}

int Disco::getPrecio() {
	return this->precio;
}

void Disco::setPrecio(int precio) {
	this->precio = precio;
}

string Disco::getTipo() {
	return this->tipo;
}

void Disco::setTipo(string tipo) {
	this->tipo = tipo;
}

void Disco::aceptar(VisitanteEquipo visitante) {
	visitante.visitarDisco(this);
}
