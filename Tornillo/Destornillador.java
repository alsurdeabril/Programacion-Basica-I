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

public class Destornillador {

	/* Atributos propios de la clase que reflejan el estado de la clase Destornillador */
	private char TIPO_DE_CABEZA;
	
	/* Constructor: Le asignamos valores a los atributos de ese objeto y los inicializamos */
	
	public Destornillador(char tipoDeCabeza) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
	} // end constructor
	
	/* Métodos */
	public void desatornillar(Tornillo tornillo) {	
		
	} // end desatornillar
	
	public void atornillar(Tornillo tornillo) {
		
	} // end atornillar
	
	public void desatornillar(Tornillo tornillo, Tarugo tarugo) {
		
	} // end desatornillar
	
	public void atornillar(Tornillo tornillo, Tarugo tarugo) {
		
	} // end atornillar
	
} // end Destornillador
