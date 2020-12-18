package ar.edu.unlam.pb1.tp08.prueba;

import ar.edu.unlam.pb1.tp08.dominio.Password;

public class PruebaPassword {

	public static void main(String[] args) {
		
		Password nuevaContrasenia = new Password(4
				);
		
		System.out.println(nuevaContrasenia.getContraseniaGenerada());
		
	} // end main

} // end PruebaPassword
