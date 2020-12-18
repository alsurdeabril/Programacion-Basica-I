package ar.edu.unlam.pb1.tp08.dominio;

/* 4. Desarrolla una clase llamada Password que siga las siguientes condiciones:
- Que tenga los atributos longitud y contraseña. Por defecto, la longitud será de 8.
- Los constructores serán los siguiente:
* Un constructor por defecto.
* Un constructor con la longitud que nosotros le pasemos. Generará una contraseña
aleatoria con esa longitud.
- Los métodos que implementa serán:
* esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte
debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5
números.
* generarPassword(): genera la contraseña del objeto con la longitud que
tenga.
* Método get para contraseña y longitud.
* Método set para longitud. */

public class Password {

	/* Atributos */
	private int longitud = 8;
	private String contrasenia;
	private int[] contraseniaAleatoria; // declaración del array
	
	/* Constructores */ 
	public Password() {
		this.contrasenia = "";
	} // end constructor1
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseniaAleatoria = new int[this.longitud]; // dimensión de la variable
		// Asignación de valores a cada una de las posiciones del array
		int max = 9;
		int min = 0;
		int range = max - min + 1;
		for (int i = 0; i < this.longitud; i++) {
			contraseniaAleatoria[i] = (int)(Math.random()*range) + min;
		} // end for
		
	} // end constructor 2
	
	/* Métodos */
	public String getContraseniaGenerada() {
		
		for (int i = 0; i < contraseniaAleatoria.length; i++) {
				this.contrasenia += this.contraseniaAleatoria[i] + "";
			} // end for 
		return this.contrasenia;
	} // end  getContraseniaGenerada
		
} // end Password
