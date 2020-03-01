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
	Equipo(int pTar, string tTar, int pDis, string tDisc, int pBus, string tBus);
	int getNumero();
	int getPrecioTarjeta();
	int getPrecioDisco();
	int getPrecioBus();
};

#endif
