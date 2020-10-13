package ar.edu.unlam.pb1.tp04.prueba;
import ar.edu.unlam.pb1.tp04.dominio.Motor;

public class PruebaMotor {

	public static void main(String[] args) {
		
		Motor sX555 = new Motor(); // Instanciaci�n del objeto
		
		/* Establecemos el tipo de bomba */
		
		sX555.setTipoBomba(1);
		
		/* Informamos tipo de bomba */
		
		System.out.println("El motor SX555 tiene un tipo de bomba n�mero: " + sX555.getTipoBomba());
		
		/* Establecemos el tipo de combustible */
		
		sX555.setCombustible("Bio-di�sel");
		
		/* Informamos tipo de combustible */
		
		System.out.println("El motor tiene un combustible de tipo: " + sX555.getCombustible());
		
		/* Establecemos el tipo de fluido */
		
		sX555.setTipoFluido("Aceite para caja de cambios.");
		
		/* Informamos el tipo de fluido */
		
		System.out.println("El tipo de fluido que tiene el motor es: " 
				+ sX555.getTipoFluido());
		
		/* A trav�s del condicional m�ltiple indicamos el tipo de motor en base al n�mero de bomba previamente ingresado */
		
		
		
		switch (sX555.dimeTipoMotor()) {
		
		case 0: 
			System.out.println("No ha establecido un valor definido para el tipo de bomba.");
			break;
			
		case 1: 
			System.out.println("La bomba es una bomba de agua.");
			break;
			
		case 2: 
			System.out.println("La bomba es una bomba de gasolina.");
			break;
			
		case 3: 
			System.out.println("La bomba es una bomba de hormig�n.");
			break;
		
		case 4:
			System.out.println("La bomba es una bomba de pasta alimenticia.");
			break;
			
		default:
			System.out.println("No existe un valor v�lido para tipo bomba");
		} // end Switch

	} // end main

} // end PruebaMotor
