package ar.edu.unlam.pb1.tp02.dominio;

public class Calculadora {

	/* Atributos propios de la clase que reflejan el estado de la clase Calculadora2 */
	private double operador1;
	private double operador2;
	
	
	/* Constructor: formato similar al de un método pero NO va a tener valor de retorno
	 * En el constructor le asignamos valores a los atributos de ese objeto y los inicializamos */
	public Calculadora() {
		this.operador1 = 0.0;
		this.operador2 = 0.0;
		
		
	} // end Calculadora constructor 1
	
	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
		
	
	} //  end Calculadora constructor 2
	
	/* Métodos: van a describir el comportamiento de la clase de tipo Televisor */
	public double sumar() { // double tipo de dato que devuelve la variable de retorno
		double suma = 0.0;
		suma =  this.operador1 + this.operador2; // operación que va a devolver el método
		return suma;
	} // end sumar 1
	
	public double sumar(double operador1, double operador2) { //double tipo de dato variable de retorno
		double suma = 0.0;
		suma = this.operador1 + this.operador2;  // operación que va a devolver el método
		return suma;
	} // end suma 2
	
	public double restar() { //double tipo de dato variable de retorno
		double resta = 0.0;
		resta = this.operador1 - this.operador2;  // operación que va a devolver el método
		return resta;
	} // end resta 1
	
	public double restar(double operador1, double operador2) { // double tipo dato variable retorno
		double resta = 0.0;
		resta = this.operador1 - this.operador2; // operación que va a devolver el método
		return resta;
	} // end resta2
	
	public double multiplicar() {  //double tipo de dato variable de retorno
		double multiplicacion = 0.0;
		multiplicacion = this.operador1 * this.operador2; // operación que va a devolver el método
		return multiplicacion;
	} // end multiplicar1
	
	public double multiplicar(double operador1, double operador2) {  //double tipo de dato variable de retorno
		double multiplicacion = 0.0;
		multiplicacion = this.operador1 * this.operador2; // operación que va a devolver el método
		return multiplicacion;
	} // end multiplicar2
	
	public double dividir() {  //double tipo de dato variable de retorno
		double division = 0.0;
		division = this.operador1 / this.operador2;  //double tipo de dato variable de retorno
		return division;
	} // end division1
	
	public double dividir(double numerador, double divisor) {  //double tipo de dato variable de retorno
		double division = 0.0;
		division = this.operador1 / this.operador2;  //double tipo de dato variable de retorno
		return division;
	} // end division2
	
	public void setOperadores(double operador1, double operador2) { //no devuelve el resultado de ninguna acción
		this.operador1 = operador1; // establecemos los operadores para que el objeto que no recibe
		this.operador2 = operador2; // parámetros pueda operar
	} // end setOperadores -> Método que actualiza el valor de un atributo
	
	/* Crear un metodo de la calculadora que informe si el número ingresado es múltiplo . */
	public boolean decirMuLtiplo () {
		
		boolean multiplo;
		
		if  ( this.operador1 % this.operador2 == 0 ) {
			multiplo = true;
		} else {
			multiplo = false;
		}
		return multiplo;
	} // end decirMultiplo
	
/* TP3: 1. Incorpora el método esPositivo()  */	
	
	public boolean esPositivo () {
		
		boolean positivo;
		
		if ( this.operador1 >= 0 && this.operador2 >=0 ) {
			positivo = true;
		} else {
			positivo = false ;
		}// end conditional
		return positivo;
	} // end esPositivo
	
} // end Calculadora class
