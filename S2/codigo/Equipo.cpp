#include "Equipo.h"

Equipo::Equipo(float pTar, string tTar, float pDis, string tDis, float pBus, string tBus) {
	this->tarjeta = Tarjeta(pTar, tTar);
	this->disco = Disco(pDis, tDis);
	this->bus = Bus(pBus, tBus);
}

int Equipo::getNumero() {
	return this->NUM;
}

float Equipo::getPrecioTarjeta() {
	return tarjeta.getPrecio();
}
float Equipo::getPrecioDisco() {
	return disco.getPrecio();
}

float Equipo::getPrecioBus() {
	return bus.getPrecio();
}

//hacer un equipo que pueda tener ilimitados componentes o solo 1 de cada??