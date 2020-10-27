package ar.edu.unlam.pb1.tp06.dominio;

/* 2. Desarrolla las clase Tornillo, Destornillador y Tarugo, sabiendo que:
a. Los tipos de cabeza que vamos a usar son los siguientes:
i. P – Plana
ii. H – Phillips
iii. A – Allen
b. Los sentidos de giro son:
i. H – Sentido horario
ii. A – Sentido antihorario
c. Solo se puede trabajar con tornillos y destornilladores del mismo tipo
d. No se puede atornillar mas allá de la longitud del tarugo */

public class Tornillo {

	/* Atributos propios de la clase que reflejan el estado de la clase Tornillo */
	
	private final char TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;
	
	
	/* Constructor: Le asignamos valores a los atributos de ese objeto y los inicializamos */
	public Tornillo (char tipoDeCabeza, int longitud, int cantidadDeRosca) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRosca;
		this.posicionActual = 0;
		// end constructor tornillo
	} // end constrcutor
	/* Métodos */
	
	public int getLongitud() {
		return this.LONGITUD;
	} // end getLongitud

	public char getTipoDeCabeza() {
		return this.TIPO_DE_CABEZA;
	} // end  getTipoDeCabeza
	
	public boolean girar(char sentido) {
		boolean puedeGirar = true;
		
		while (sentido != 'H' || sentido != 'A' ) {
			puedeGirar = false;
		} // end while
		
		return puedeGirar;
	} // end girar
	
} // end Tornillo
