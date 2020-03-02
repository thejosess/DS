#include "Tarjeta.h"
#include "VisitanteEquipo.h"

Tarjeta::Tarjeta() {
	setPrecio(0);
	setTipo("");
}

Tarjeta::Tarjeta(float precio, string tipo) {
	setPrecio(precio);
	setTipo(tipo);
}

float Tarjeta::getPrecio() {
	return this->precio;
}

void Tarjeta::setPrecio(float precio) {
	this->precio = precio;
}

string Tarjeta::getTipo() {
	return this->tipo;
}

void Tarjeta::setTipo(string tipo) {
	this->tipo = tipo;
}

void Tarjeta::aceptar(VisitanteEquipo visitante) {
	visitante.visitarTarjeta(this);
}
