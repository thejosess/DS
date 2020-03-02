#include "ComponenteEquipo.h"

string ComponenteEquipo::getTipo()
{
    return this->tipo;
}

float ComponenteEquipo::getPrecio()
{
    return this->precio;
}

void ComponenteEquipo::setPrecio(float precio)
{
    this->precio = precio;
}