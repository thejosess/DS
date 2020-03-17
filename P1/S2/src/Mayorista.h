#ifndef MAYORISTA_H
#define MAYORISTA_H

#include "Persona.h"

class Mayorista :public Persona{
public:
    Mayorista() {descuento = 0.85;}
private:
    float getDescuento();
};



#endif