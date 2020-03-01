#include "VisitantePrecio.h"

VisitantePrecio::VisitantePrecio() {
	coste = 0;
}

void visitarDisco(Disco* d) {
	//ponemos para que devuelva int?? es que en el pdf sale como void pero si no es con int no sabria hacerlo
	//se puede hacer una sobrecarga de los metodos visitar segun el componente que le pasas por la cabecera y asi no tener distintos nombres
	//el aceptar es lo que se llama desde el main
}
void visitarTarjeta(Tarjeta* t) {

}
void visitarBus(Bus* b) {

}

void VisitantePrecio::calcularCoste(Equipo equipo) {
	for (int i = 0; i < equipo.getNumero(); i++) {
		//coste+=  metodo visitar de cada componente
	}
}

