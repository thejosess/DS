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
	Equipo(float pTar, string tTar, float pDis, string tDisc, float pBus, string tBus);
	int getNumero();
	float getPrecioTarjeta();
	float getPrecioDisco();
	float getPrecioBus();
};

#endif
