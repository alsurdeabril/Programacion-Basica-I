package ar.edu.unlam.pb1.tp03.dominio;

/* 5. Implementa la clase Punto, que permita ejemplificar distintos puntos en las coordenadas X
e Y. Incorpora los m�todos necesarios para:
a. Consultar y cambiar las coordenadas
b. Saber si el punto est� sobre el eje de las X
c. Saber si el punto est� sobre el eje de las Y
d. Saber si el punto est� en el origen de las coordenadas */

public class Punto {

	/* Atributos propios de la clase que reflejan el estado de la clase Punto */
	
	private double coordenadaX;
	private double coordenadaY;
	
	/* Constructor: Le asignamos valores a los atributos de ese objeto y los inicializamos */
	public Punto() { // sin par�metros->  objeto que vamos a utilizar p/ operaciones con != datos
		this.coordenadaX = coordenadaX; // trabajo con los atributos de la clase
		this.coordenadaY = coordenadaY;
	} // end Constructor
	
	/* M�todos: van a describir el comportamiento de la clase de tipo Televisor
	 * Estos m�todos SI van a recibir par�metros ya que el constructor no los posee */
	
	/* a. M�todos para cambiar las coordenadas */
	public void setCoordenadaX (double x) { // recibe p�metro-> coordenada a trabajar
		this.coordenadaX = x; // se actualiza el valor del atributo
	} // end setCoordenadaX
	
	public void setCoordenadaY (double y) {  // recibe p�metro-> coordenada a trabajar
		this.coordenadaY = y; // se actualiza el valor del atributo
	}  // end setCoordenadaY
	
	/* a. M�todos para consultar las coordenadas */
	public double getCoordenadaX () { // no recibe par�metros, m�todo de consulta
		return this.coordenadaX; // devuelve el contenenido de x
	} // end getCoordenadaX
	
	public double getCoordenadaY () { // no recibe par�metros, m�todo de consulta
		return this.coordenadaY; // devuelve el contenenido de x
	} // getCoordenadaY
	
	/* b. Saber si el punto est� sobre el eje de las X */
	public boolean verificarPuntoEjeX() {
		boolean vericacionPuntoX;
		if (this.coordenadaX == 0 || this.coordenadaX >= 0 || this.coordenadaX <=0) {
			vericacionPuntoX = true;
		} else {
			vericacionPuntoX = false;
		}
		return  vericacionPuntoX;
	} // end  verificarPuntoEjeX
	
/*	c. Saber si el punto est� sobre el eje de las Y */
	public boolean verificarPuntoEjeY() {
		boolean vericacionPuntoY;
		if (this.coordenadaY == 0 || this.coordenadaY >= 0 || this.coordenadaY <=0) {
			vericacionPuntoY = true;
		} else {
			vericacionPuntoY = false;
		}
		return  vericacionPuntoY;
	} // end  verificarPuntoEjeX

	public boolean verificarOrigenCoordenadas() {
		boolean verificacionOrigen;
		if (this.coordenadaX == 0 && this.coordenadaY == 0) {
			verificacionOrigen = true;
		} else {
			verificacionOrigen = false;
		}
		return verificacionOrigen;
	} // end  verificarOrigenCoordenadas
	
	
} // end Punto class
