#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"

int main() {
	Equipo equipo(10, 5, 3);

	VisitantePrecio visitantePrecicio;
	VisitantePrecioDetalle visitanteDetalle;

	visitanteDetalle.getCoste(equipo);
	visitantePrecicio.getCoste(equipo);
}
