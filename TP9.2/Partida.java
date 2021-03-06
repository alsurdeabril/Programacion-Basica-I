package ar.edu.unlam.pb01.tp09.dominio;
import java.util.Random;

public class Partida {

	/* Atributos */
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador jugadorQueComienza;
	Random random = new Random();
	int jugadorElegido;
	private Jugador jugadorActual;
	
	/* Constructor */
	public Partida(String jugador1, String jugador2) {
		this.jugador1 = new Jugador(jugador1);
		this.jugador2 = new Jugador(jugador2);
		this.jugadorElegido = 0;
	} // end constructor
	
	public void elegirQuienComienza() {
		jugadorElegido = random.nextInt(2) + 1;
	} //  end  elegirQuienComienza
	
	public Jugador getJugadorQueComienza() {
		
		if (jugadorElegido == 1) {
			jugadorQueComienza =  this.jugador1; // est� bien hacer esto? porque en ning�n momento lo inicializ� como lo pide el constructor -> new Jugador(String nombre)
		} else if (jugadorElegido == 2) {
			jugadorQueComienza =  this.jugador2;
		} // end conditional
		this.jugadorActual = jugadorQueComienza;
		return jugadorQueComienza;
	} // end getJugadorQueComienza
	
	public void cambiarTurnoJugador(Jugador jugadorActual) {
		
		if (jugadorActual == jugador1) {
			this.jugadorActual = jugador2;
		} else {
			this.jugadorActual = jugador1;
		} // end conditional
	} // end cambiarTurnoJugador
	
	
	public Jugador getJugadorActual() {
			return this.jugadorActual;
		} // end getJugadorActual
	
	public boolean letraEsCorrecta(char letraIngresada) {
		
		boolean esCorrecta = false;
		Jugador jugadorQueAdivina;
		
		if (jugadorActual == jugador1) {
			jugadorQueAdivina = jugador2;
		} else {
			jugadorQueAdivina = jugador1;
		} // end conditional
		
		String palabraAadivinar = jugadorQueAdivina.getPalabraAadivinar();
		
		for (int i = 0; i < palabraAadivinar.length(); i++) {
			char letraActual = palabraAadivinar.charAt(i);
			
			if (letraActual == letraIngresada) {
				jugadorQueAdivina.ingresarLetraCorrecta(letraIngresada, i);
				esCorrecta = true;
			} else {
				esCorrecta = false;
				jugadorQueAdivina.restarVidas();
			} // end conditional
			
		} // end for
		
		return esCorrecta;
	} // end letraEsCorrecta
	
	public boolean palabraEsCorrecta(String palabraIngresada) {
		
		boolean esCorrecta = false;
		Jugador jugadorQueAdivina;
		
		if( jugadorActual == jugador1) {
			jugadorQueAdivina = jugador2;
		} else {
			jugadorQueAdivina = jugador1;
		} // end conditional
		
		String palabraAadivinar = jugadorQueAdivina.getPalabraAadivinar();
		
		for (int i = 0; i < palabraAadivinar.length(); i++) {
		
			if (palabraIngresada.equals(palabraAadivinar)) {
				esCorrecta = true;
			} else {
				jugadorQueAdivina.perderTotalVidas();
				esCorrecta = false;
			} // end conditional
			
		} // end for
		
		return esCorrecta;
	} // end palabraEsCorrecta
	
} // end Partida
