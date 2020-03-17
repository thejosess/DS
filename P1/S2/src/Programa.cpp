#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"
#include "Mayorista.h"
#include "Estudiante.h"

int main() {
	Equipo equipo(10, 5, 3);

	Persona *otraPersona;
	Persona *estudiante;
	Persona *mayorista;

	Estudiante est;
	Mayorista mayor;
	Persona pers;

	estudiante = &est;
	mayorista = &mayor;
	otraPersona = &pers;

	VisitanteEquipo *visitanteP;
	VisitanteEquipo *visitanteD;

	VisitantePrecio visitantePrecicio;
	VisitantePrecioDetalle visitanteDetalle;

	visitanteP = &visitantePrecicio;
	visitanteD = &visitanteDetalle;

	cout << endl << "Persona sin descuento: " << endl;
	visitanteDetalle.getCoste(equipo, otraPersona);
	visitantePrecicio.getCoste(equipo, otraPersona);

	cout << endl << "Estudiante: " << endl;
	visitanteDetalle.getCoste(equipo, estudiante);
	visitantePrecicio.getCoste(equipo, estudiante);

	cout << endl << "Mayorista: " << endl;
	visitanteDetalle.getCoste(equipo, mayorista);
	visitantePrecicio.getCoste(equipo, mayorista);
}
