package ar.edu.umlam.pb01.tp09.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb01.tp09.dominio.Jugador;
import ar.edu.unlam.pb01.tp09.dominio.Partida;

/*6. Desarrolla el juego “El Ahorcado”. El mismo debe contar con las siguientes características:
a. Inicio del juego:
i. Se debe poder ingresar el nombre del jugador 1 y el nombre del jugador 2.
ii. Se solicita que el jugador 1 ingrese la palabra que se debe adivinar (el
jugador 2 no debe mirar la pantalla).
iii. Se solicita que el jugador 2 ingrese la palabra que se debe adivinar (el
jugador 1 no debe mirar la pantalla).
iv. Se elige aleatoriamente quien inicia la partida.
b. Por cada turno:
i. Se muestra a modo de ayuda la dimensión de la palabra ingresada por el
adversario de la forma “_ _ _ _ _ _ _ _”.
ii. Se ofrece las siguientes opciones:
1. Ingresar letra
2. Arriesgar
3. Al elegir ingresar una letra:
- Si la letra existe se muestra por pantalla las posiciones
donde la letra aparece (para las posiciones donde aún no
se adivinó la letra se debe mostrar ‘_’.
- Si la letra no existe, el jugador pierde una vida (tiene 6
chances).
4. Al elegir arriesgar:
- El jugador que eligió dicha opción ingresa la palabra que
cree conocer.
- Si acierta, el adversario tiene una oportunidad mas para
arriesgar. Si también acierta el resultado es un empate.
Caso contrario gana el primero.
- Si no acierta, el ganador es el adversario.*/

public class PruebaAhorcado {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String jugador1= "";
		String jugador2 = "";
		String palabraElegidaJugador1 = "";
		String palabraElegidaJugador2 = "";
		String pistaPalabra = "";
		int opcionElegida = 0;
		char letraIngresada = '\u0000';
		String palabraArriesgada = "";
		
	
		
		System.out.println("Bienvenido al Ahorcado.");
	/*	i. Se debe poder ingresar el nombre del jugador 1 y el nombre del jugador 2. */
		System.out.println("Ingrese el nombre del jugador 1: ");
		jugador1 = input.next();
		System.out.println("Nombre del jugador 2: ");
		jugador2 = input.next();
		
	/*	ii. Se solicita que el jugador 1 ingrese la palabra que se debe adivinar (el jugador 2 no debe mirar la pantalla). */
		System.out.println(jugador1 + " ingresá la palabra que querés que adivine " + jugador2 + ": ");
		palabraElegidaJugador1 = input.next();
		limpiarPantalla();
		
	/*	iii. Se solicita que el jugador 2 ingrese la palabra que se debe adivinar (el	jugador 1 no debe mirar la pantalla). */
		System.out.println(jugador2 + " ingresá la palabra que querés que adivine " + jugador1 + ": ");
		palabraElegidaJugador2 = input.next();
		limpiarPantalla();
		
		/* iv. Se elige aleatoriamente quien inicia la partida. */ 
		Partida nuevoJuego = new Partida(jugador1, jugador2);
		
		nuevoJuego.elegirQuienComienza();
		String jugadorQueEmpieza = nuevoJuego.getJugadorQueComienza().getNombre();
		System.out.println("El jugador que comienza es: " + jugadorQueEmpieza);
		
		/*b. Por cada turno:
i. Se muestra a modo de ayuda la dimensión de la palabra ingresada por el
adversario de la forma “_ _ _ _ _ _ _ _”.*/
		
		if (jugadorQueEmpieza == jugador1) {
			pistaPalabra = nuevoJuego.getJugadorActual().mostrarPistaPalabra(palabraElegidaJugador2);
		} else {
			pistaPalabra = nuevoJuego.getJugadorActual().mostrarPistaPalabra(palabraElegidaJugador1);
		} // end conditional
		
		System.out.println("La palabra que tenés que adivinar es: " + pistaPalabra);
		
		/* ii. Se ofrece las siguientes opciones:
1. Ingresar letra
2. Arriesgar */
		
		System.out.println("Ingresá alguna de las siguientes opciones: \n1- Ingresar letra \n2- Arriesgar");
		opcionElegida = input.nextInt();
		
		/* Acciones de acuerdo a la opción elegida */
		
		switch (opcionElegida) {
		/*3. Al elegir ingresar una letra:
- Si la letra existe se muestra por pantalla las posiciones
donde la letra aparece (para las posiciones donde aún no
se adivinó la letra se debe mostrar ‘_’.
- Si la letra no existe, el jugador pierde una vida (tiene 6
chances).*/
		case 1:
			System.out.println("Cuál es la letra que pensas que puede estar en la palabra?");
			letraIngresada = input.next().charAt(0);
			break;
		/*4. Al elegir arriesgar:
- El jugador que eligió dicha opción ingresa la palabra que
cree conocer.
- Si acierta, el adversario tiene una oportunidad mas para
arriesgar. Si también acierta el resultado es un empate.
Caso contrario gana el primero.
- Si no acierta, el ganador es el adversario.*/
		case 2:
			
			break;
		} // end switch
		
		
		
		
	} // end main

	
	public static void limpiarPantalla() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		} // end for
	} // end limpiarPantalla
	
} // end PruebaAhorcado
