package ar.edu.unlam.pb1.tp08.dominio;

/* 4. Desarrolla una clase llamada Password que siga las siguientes condiciones:
- Que tenga los atributos longitud y contrase�a. Por defecto, la longitud ser� de 8.
- Los constructores ser�n los siguiente:
* Un constructor por defecto.
* Un constructor con la longitud que nosotros le pasemos. Generar� una contrase�a
aleatoria con esa longitud.
- Los m�todos que implementa ser�n:
* esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte
debe tener m�s de 2 may�sculas, m�s de 1 min�scula y m�s de 5
n�meros.
* generarPassword(): genera la contrase�a del objeto con la longitud que
tenga.
* M�todo get para contrase�a y longitud.
* M�todo set para longitud. */

public class Password {

	/* Atributos */
	private int longitud = 8;
	private String contrasenia;
	private int[] contraseniaAleatoria; // declaraci�n del array
	
	/* Constructores */ 
	public Password() {
		this.contrasenia = "";
	} // end constructor1
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseniaAleatoria = new int[this.longitud]; // dimensi�n de la variable
		// Asignaci�n de valores a cada una de las posiciones del array
		int max = 9;
		int min = 0;
		int range = max - min + 1;
		for (int i = 0; i < this.longitud; i++) {
			contraseniaAleatoria[i] = (int)(Math.random()*range) + min;
		} // end for
		
	} // end constructor 2
	
	/* M�todos */
	public String getContraseniaGenerada() {
		
		for (int i = 0; i < contraseniaAleatoria.length; i++) {
				this.contrasenia += this.contraseniaAleatoria[i] + "";
			} // end for 
		return this.contrasenia;
	} // end  getContraseniaGenerada
		
} // end Password
