package ar.edu.unlam.pb1.tp06.prueba;

import ar.edu.unlam.pb1.tp06.dominio.Tornillo;

public class PruebaTornillo {

	public static void main(String[] args) {
		
		Tornillo fix55 = new Tornillo('P', 5, 3);
		boolean gira = false;
		
		gira = fix55.girar('A');
		
		if (gira == true) {
			System.out.println("Se va a a girar una vuelta.");
		} else {
			System.out.println("No se puede girar en el sentido indicado");
		} // else conditional

	} // end main

} // end PruebaTornillo
