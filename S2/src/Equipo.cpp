#include "Equipo.h"

Equipo::Equipo(float pTar, float pDis, float pBus) {
	this->tarjeta = Tarjeta(pTar);
	this->disco = Disco(pDis);
	this->bus = Bus(pBus);
}

int Equipo::getNumero() {
	return this->NUM;
}

Tarjeta* Equipo::getTarjeta() {
	return &tarjeta;
}
Disco* Equipo::getDisco() {
	return &disco;
}

Bus* Equipo::getBus() {
	return &bus;
}

//hacer un equipo que pueda tener ilimitados componentes o solo 1 de cada??