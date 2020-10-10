package ar.edu.unlam.pb1.tp03.prueba;
import ar.edu.unlam.pb1.tp03.dominio.PartidoDeTenis;

public class PruebaPartidoDeTenis {

	public static int valor4= 4;
	public static int valor6 = 6;
	
	public static void main(String[] args) {

		PartidoDeTenis jugador1 = new PartidoDeTenis(); //instanciación del objeto jugador1

		PartidoDeTenis jugador2 = new PartidoDeTenis(); //instanciación del objeto jugador2
		
		/* Comienzo del juego */
		/* Puntos ganados por cada jugador */
		
		jugador1.win1point(15);
		jugador2.win1point(15);
		jugador1.win1point(30);
		jugador1.win1point(40);
		jugador1.win1point(60);
		
		/* Informar si alguno de los jugadores se llevó el juego */
		if (jugador1.seLlevaJuego() == true) {
			System.out.println("El jugador 1 se llevó un juego");
		} else {
			System.out.println("El jugador no se llevó un juego");
		} // end conditional informe de juego
		
		/* Actualizamos el resultado del primer set */
		jugador1.anotarPuntoSet1();
		
		/* Informamos actualización de los resultados */
		System.out.println(jugador1.getResultadoSet1() + "-" + jugador2.getResultadoSet1());
		
		/* Actualizamos el resultado del primer set */
		jugador1.anotarPuntoSet1();
		jugador1.anotarPuntoSet1();
		jugador1.anotarPuntoSet1();
		jugador1.anotarPuntoSet1();
		jugador1.anotarPuntoSet1();
		

		/* Informamos actualización de los resultados */
		System.out.println(jugador1.getResultadoSet1() + "-" + jugador2.getResultadoSet1());
		
		/* Informe de set ganado */
		if (jugador1.getResultadoSet1() == valor6 && jugador2.getResultadoSet2() <= valor4 ) {
			System.out.println("El jugador 1 ganó el primer set");
		} else if (jugador2.getResultadoSet1()  == valor6 && jugador1.getResultadoSet2() <= valor4) {
			System.out.println("El jugador 2 ganó el primer set");
		} // end else if
	
		/* Informamos a la clase interna qué jugador lleva ganado 1 set */
		jugador1.setGanadoJugador1(1);
		jugador1.setGanadoJugador1(2);
		jugador1.setGanadoJugador1(3);
		
		
		/* Informamos cuántos sets va ganando cada jugador */
		System.out.println("La cantidad de sets ganados por el jugador 1 es: " + jugador1.getSetsGanadosJugador1());
		
		System.out.println("La cantidad de sets ganados por el jugador 2 es: " + jugador1.getSetsGanadosJugador2());
		
		
		/* Informamos qué jugador ganó el partido */
		if (jugador1.ganaJugador1() == true) {
			System.out.println("El jugador1 es el ganador!");
		} else {
				System.out.println("El jugador2 es el ganador!");
			
		} // end conditional partido ganado
		
	} // end main
	   
} // PruebaPartidoDeTenis
