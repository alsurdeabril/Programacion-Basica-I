package ar.edu.unlam.pb01.tp09.dominio;

public class Jugador {
	
	/* Atributos */
	private String nombre;
	private final int VIDAS_TOTAL = 6;
	private String palabraDesignada;
	private int vidasJugador;
	private char pistaPalabraAadivinar[];
	
	private String palabraElegidaJugador1;
	private String palabraElegidaJugador2;

	private char palabraAadivinar[];
	private char palabraAdivinada[];
	private int dimensionPalabra;
	/* Constructor */
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.vidasJugador = VIDAS_TOTAL;
		this.dimensionPalabra = 0;
	} // end constructor
	
	// Tiene sentido hacer un método que se llame setNombre cuando al nombre ya lo ingresé por el constructor
	
	public String getNombre() {
		return this.nombre;
	} // end getNombre
	
	public void setPalabraAadivinar(String palabraAadivinar) {
		this.palabraDesignada = palabraAadivinar;
		dimensionPalabra = palabraAadivinar.length();
		
	} // end  setPalabraAadivinar
	
	public String getPalabraAadivinar() {
		return this.palabraDesignada;
	} // end getPalabraAadivinar
	
	public void inicializarPalabraAadivinar() {
		
		this.palabraAadivinar = new char[dimensionPalabra];
		
	} // end inicializarPalabraAadivinar
	
	
	public String mostrarPistaPalabra(String palabraAadivinar) {
		
		pistaPalabraAadivinar = new char[dimensionPalabra];
		
		String pistaAmostrar = "";
		
		for (int i = 0; i < palabraAadivinar.length(); i++) {
		
			pistaAmostrar += "_" + " ";
	
		} // end for
		
		return pistaAmostrar;
	} // end mostrarPistaPalabra
	
//	public String mostrarLetrasAcertadas() {
		
//	} // end mostrarLetrasAcertadas
	
	public void ingresarLetraCorrecta(char letraAcertada, int posicion) {
		
		palabraAadivinar[posicion] = letraAcertada; 
		
	} // end ingresarLetraCorrecta
	
	public void restarVidas() {
		this.vidasJugador--;
	} // end restarVidas
	
	public void perderTotalVidas() {
		this.vidasJugador = 0;
	} // end perderTotalVidas
	
	public int getVidas() {
		return this.vidasJugador;
	} // end getVidas

} // end Jugador
