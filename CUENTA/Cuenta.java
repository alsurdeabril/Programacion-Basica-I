package ar.edu.unlam.pb1.tp03.dominio;

/* 6. Implementa la clase Cuenta, sabiendo que:
a. Cuando se crea una cuenta, su saldo es cero.
b. Solo es posible extraer un importe menor o igual al saldo que se tenga en la cuenta. */

public class Cuenta {

	/* Atributos propios de la clase que reflejan el estado de la clase Punto */
	private String titular;
	private double saldo;
	private double cantidadAextraer = 0;
	
	/* Constructor: Le asignamos valores a los atributos de ese objeto y los inicializamos */
	public Cuenta(String titular) {
		this.titular = titular;
		this.saldo = 0.0;
	} // end Constructor1
	
	/* Constructor: Le asignamos valores a los atributos de ese objeto y los inicializamos */
	public Cuenta(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	} // end Constructor2
	
	/* Métodos: van a describir el comportamiento de la clase de tipo Cuenta */
	
	public String getTitular() { // tiene que devolver el contenido del atributo
		return this.titular;
	} // end getTitular
	
	public void setTitular(String titular) { // void-> no va a devolver nada, va a actualizar el valor del atributo
		this.titular = titular;
	} // end setTitular
	
	public double getSaldo() { // tiene que devolver el contenido del atributo
		return this.saldo;
	}  // end getSaldo
	
	public String toString() { // Método que vamos a utilizar para hacer referencia al atributo del objeto, el estado de éste
		String estadoTitular= null ;
		estadoTitular = "Titular de la cuenta: " + this.titular;
		return estadoTitular;
	} // end toString
	
	public void depositar(double cantidad) { // void-> no va a devolver nada, va a actualizar el valor del atributo
		this.saldo =+ cantidad;
	} // end depositar
	

	public void retirar(double cantidad) { // void-> no va a devolver nada, va a actualizar el valor del atributo
		this.cantidadAextraer = cantidad;
	} // end retirar
	
	
	/* Estado de la aprobación de la extracción */
	public boolean verificarExtraccion() {
		boolean estadoExtraccion;
		if (this.cantidadAextraer <= this.saldo) {
			estadoExtraccion = true; 
		} else	{
			estadoExtraccion = false;
		} return estadoExtraccion; 
	} // end  verificarExtraccion
	
	/* Movimiento de la extracción */
	public double ExtraerDinero() {
		double saldoActualizado =0;
		if (verificarExtraccion() == true) {
		this.saldo =  getSaldo() - cantidadAextraer;
		} 
             return this.saldo; 
		
	} // end ExtraerDinero
	
} // end Cuenta class
