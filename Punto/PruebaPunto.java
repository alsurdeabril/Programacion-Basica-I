package ar.edu.unlam.pb1.tp03.prueba;
import  ar.edu.unlam.pb1.tp03.dominio.Punto;

public class PruebaPunto {

	public static void main(String[] args) {

		Punto punto1 = new Punto();
		
		punto1.setCoordenadaX(10.0);
		punto1.setCoordenadaY(5);
		
		System.out.println("La coordenada x es: " + punto1.getCoordenadaX());
		System.out.println("La coordenada y es: " + punto1.getCoordenadaY());
		
		/* Comprobación coordenadas */
		if (punto1.verificarOrigenCoordenadas() == false) {
				System.out.println("El punto no se encuentra en el origen de coordenadas.");
		} else {
			System.out.println("El punto se encuentra en el origen de coordenadas.");
		} // condicional  Comprobación coordenadas
		
		/* Comprobación punto sobre el eje de las X */
		if (punto1.verificarPuntoEjeX() == false) {
			System.out.println("El punto no se encuentra sobre el eje de las X");
		} else {
			System.out.println("El punto se encuentra sobre el eje de las X");
		} // condicional Comprobación punto sobre el eje de las X
	
		/* Comprobación punto sobre el eje de las Y */
		
		if (punto1.verificarPuntoEjeY() == false) {
			System.out.println("El punto no se encuentra sobre el eje de las Y");
		} else {
			System.out.println("El punto se encuentra sobre el eje de las Y");
		} // condicional Comprobación punto sobre el eje de las Y
	

	} // end main

}// end PruebaPunto
