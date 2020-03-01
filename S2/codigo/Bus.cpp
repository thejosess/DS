#include "Bus.h"
#include "VisitanteEquipo.h"

Bus::Bus() {
	setPrecio(0);
	setTipo("");
}

Bus::Bus(int valor, string tipo ){
	setPrecio(valor);
	setTipo(tipo);
}

int Bus::getPrecio() {
	return this->precio;
}

void Bus::setPrecio(int precio)
{
	this->precio = precio;
}

string Bus::getTipo() {
	return this->tipo;
}

void Bus::setTipo(string tipo) {
	this->tipo = tipo;
}

void Bus::aceptar(VisitanteEquipo visitante) {
	visitante.visitarBus(this);
}
