package ar.edu.unlam.pb1.tp03.dominio;

/* 10. Crea la clase PartidoDeTenis que contenga el resultado de los 5 set de cada jugador. Crear
los métodos que devuelva el jugador que gano el partido. Considera los resultados en base
a las reglas del citado juego. */

public class PartidoDeTenis {
	
	/* Atributos propios de la clase que reflejan el estado de la clase PartidoDeTenis */
	private int resultadoSet1;
	private int resultadoSet2;
	private int resultadoSet3;
	private int resultadoSet4;
	private int resultadoSet5;
	private int point0;
	private int point1;
	private int point2;
	private int point3;
	private int extraPoint;
	private int cantidadPuntosGanados; //la cantidad de puntos que se tienen que ganar para llevarse el juego ganado es común para todos los objetos 
	private int CANTIDAD_PUNTOS_JUEGO_GANADO = 4;
	private int cantidadPuntosSet;
	private int cantidadSetsGanadosJugador1;
	private int cantidadSetsGanadosJugador2;
	private int CANTIDAD_SETS_GANA_PARTIDO = 3;
	
	
	/* Constructor: Le asignamos valores a los atributos de ese objeto y los inicializamos */
	public PartidoDeTenis() {
		this.resultadoSet1 = 0;
		this.resultadoSet2 = 0;
		this.resultadoSet3 = 0;
		this.resultadoSet4 = 0;
		this.resultadoSet5 = 0;
		this.point0 = 0;
		this.point1 = 15;
		this.point2 = 30;
		this.point3 = 40;
		this.extraPoint = 60;
		this.cantidadPuntosGanados = 0;
		this.cantidadPuntosSet = 0;
		this.cantidadSetsGanadosJugador1 = 0;
		this.cantidadSetsGanadosJugador2 = 0;
	} // end Constructor
	
	/* Métodos: van a describir el comportamiento de la clase de tipo PartidoDeTenis */
	public boolean win1point (int point) {
		boolean pointWon;
		if (this.point1 == point || this.point2 == point || this.point3 == point || this.extraPoint == point) {
			pointWon = true;
			this.cantidadPuntosGanados++;
		} else {
			pointWon = false;
		}
		return pointWon;
	} // end win1point 
	
	public boolean seLlevaJuego () {
		boolean gameWon;
		if (this.CANTIDAD_PUNTOS_JUEGO_GANADO == cantidadPuntosGanados) {
			gameWon = true;
			cantidadPuntosSet++;
		} else {
			gameWon = false;
		} 
		return gameWon;
	} // end  seLlevaJuego 
	
/*	public boolean seLlevaElSet() {
		boolean setWon;
		if (cantidadPuntosSet >)
	} */
	
	/* Métodos para anotar los resultados de cada set */
	public void anotarPuntoSet1 () {
		this.resultadoSet1++;
	} // anotarPuntoSet1
	
	public void anotarPuntoSet2 () {
		this.resultadoSet2++;
	} // anotarPuntoSet2
	
	public void anotarPuntoSet3 () {
		this.resultadoSet3++;
	} // anotarPuntoSet3
	
	public void anotarPuntoSet4 () {
		this.resultadoSet4++;
	} // anotarPuntoSet4
	
	public void anotarPuntoSet5 () {
		this.resultadoSet5++;
	} // anotarPuntoSet5
	
	/* Métodos para obtener los resultados de cada set */
	public int getResultadoSet1() {
		return this.resultadoSet1;
	} // getResultadoSet1
	
	
	public int getResultadoSet2() {
		return this.resultadoSet2;
	} // getResultadoSet2
	
	public int getResultadoSet3() {
		return this.resultadoSet3;
	} // getResultadoSet3
	
	public int getResultadoSet4() {
		return this.resultadoSet4;
	} // getResultadoSet4
	
	public int getResultadoSet5() {
		return this.resultadoSet5;
	} // getResultadoSet5
	
	/* Actualización de sets ganados de cada jugador */
	public void setGanadoJugador1(int setGanado) {
		cantidadSetsGanadosJugador1++;
	} // end  setGanadoJugador1
	
	public void setGanadoJugador2(int setGanado) {
		cantidadSetsGanadosJugador2++;
	} // end  setGanadoJugador1
	
	/* Informe de sets ganados de cada jugador */
	public int getSetsGanadosJugador1() {
		return this.cantidadSetsGanadosJugador1;
	} // end getSetsGanadosJugador1
	
	public int getSetsGanadosJugador2() {
		return this.cantidadSetsGanadosJugador2;
	} // end getSetsGanadosJugador2
	
	/* Método para informar quién ganó el partido (tomando el caso en que se necesiten ganar 3 de los 5 sets  */
	public boolean ganaJugador1() {
		boolean gano;
		if (CANTIDAD_SETS_GANA_PARTIDO == this.cantidadSetsGanadosJugador1) {
			gano = true;
		} else {
			gano = false;
		}
		return gano;
	} // end ganaJugador1
	
	public boolean ganaJugador2() {
		boolean gano;
		if (CANTIDAD_SETS_GANA_PARTIDO == this.cantidadSetsGanadosJugador2) {
			gano = true;
		} else {
			gano = false;
		}
		return gano;
	} // end ganaJugador2
	
} // end PartidoDeTenis
