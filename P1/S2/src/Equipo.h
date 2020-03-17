#ifndef EQUIPO_H
#define EQUIPO_H

#include "VisitanteEquipo.h"
#include "Disco.h"
#include "Bus.h"
#include "Tarjeta.h"

class Equipo {

private:
	Disco disco;
	Bus bus;
	Tarjeta tarjeta;
	const int NUM = 3;

public:
	//Equipo();
	Equipo(float pTar, float pDisc, float pBus);
	int getNumero();
	Tarjeta* getTarjeta();
	Disco* getDisco();
	Bus* getBus();
};

#endif
