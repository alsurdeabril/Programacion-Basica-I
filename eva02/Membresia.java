package ar.edu.unlam.pb1.eva02.dominio;

public class Membresia {

	
	/* Atributos */
	private String tipoMembresia;
	private int precioMembresia;

	
	/* Constructor */
	public Membresia(String tipoMembresia, int precioMembresia) {
		
		this.tipoMembresia = tipoMembresia;
		this.precioMembresia = precioMembresia;

	} // end constructor
	
	/* Métodos */
	
	public String getTipoMembresia() {
		return this.tipoMembresia;
	} // end getTipoMembresia
	
	public int getPrecioMembresia() {
		
		return this.precioMembresia;
	} // end getPrecioMembresia


	public String toString() {
		return tipoMembresia;
	}
} // end Membresia class
