#include "Equipo.h"

Equipo::Equipo(int pTar, string tTar, int pDis, string tDis, int pBus, string tBus) {
	this->tarjeta = Tarjeta(pTar, tTar);
	this->disco = Disco(pDis, tDis);
	this->bus = Bus(pBus, tBus);
}

int Equipo::getNumero() {
	return this->NUM;
}

int Equipo::getPrecioTarjeta() {
	return tarjeta.getPrecio();
}
int Equipo::getPrecioDisco() {
	return disco.getPrecio();
}

int Equipo::getPrecioBus() {
	return bus.getPrecio();
}

//hacer un equipo que pueda tener ilimitados componentes o solo 1 de cada??