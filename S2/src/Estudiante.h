#ifndef ESTUDIANTE_H
#define ESTUDIANTE_H

#include "Persona.h"

class Estudiante : public Persona{

public:
    Estudiante() {descuento = 0.9;}

private:
    float getDescuento();
};



#endif