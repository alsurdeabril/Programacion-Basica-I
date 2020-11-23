package ar.edu.unlam.pb01.tp09.dominio;

public class Jugador {
	
	/* Atributos */
	private String nombre;
	private final int VIDAS_TOTAL = 6;
	private String palabraDesginada;
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
		this.palabraAadivinar = palabraAadivinar;
		
	//	palabraAsignada = new char[palabraAadivinar.length()];
		
	//	palabraAdivinada = new char[palabraAadivinar.length()];
	} // end  setPalabraAadivinar
	
	public String getPalabraAadivinar() {
		return this.palabraAadivinar;
	} // end getPalabraAadivinar
	
	
	public String mostrarPistaPalabra(String palabraAadivinar) {
		
		dimensionPalabra = palabraAadivinar.length();
		
		pistaPalabraAadivinar = new char[dimensionPalabra];
		
		String pistaAmostrar = "";
		
		for (int i = 0; i < palabraAadivinar.length(); i++) {
		
			pistaAmostrar += "_" + " ";
	
		} // end for
		
		return pistaAmostrar;
	} // end mostrarPistaPalabra
	
	

} // end Jugador
