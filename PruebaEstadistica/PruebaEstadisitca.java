package ar.edu.unlam.pb1.tp06.prueba;
import java.util.Scanner;

import ar.edu.unlam.pb1.tp06.dominio.Estadistica;

/* 4. Desarrolla la clase PruebaEstadisticasDePersonas, cuyo objetivo es ingresar una muestra
de 50 personas y se calcule el:
a. El peso promedio
b. Cantidad de personas con bajo peso
c. Cantidad de personas con peso normal
d. Cantidad de personas con sobre peso
e. Promedio de edad de las personas con bajo peso
f. Promedio de edad de las personas con sobre peso
Tené en cuenta que este programa de prueba, luego deberá reutilizarse para ingresar
valores reales. Desarrollá los métodos de forma tal que te permita reutilizarlo.
 */

public class PruebaEstadisitca {

	public static void main(String[] args) {
		
		 int cantidadPersonasEstadistica = 1;
		 double peso = 0.0;
		 int edad = 0;
		 double pesoPromedio = 0.0;
	     int edadPersonasBajoPeso = 0;
	     int edadPersonasSobrePeso = 0;
	     final double bajoPeso = 50.0;
	     final double sobrePeso = 65.0;
	     int cantidadPersonasPesoNormal = 0;
	     int cantidadPersonasBajoPeso = 0;
	     int cantidadPersonasSobrePeso = 0;
	     Scanner input = new Scanner(System.in);
	     
	     while (cantidadPersonasEstadistica <= 50) {
	    	 System.out.println("Ingrese el peso de la persona: ");
	    	 peso = input.nextDouble();
	    	 System.out.println("Ingrese la edad de la persona: ");
	    	 edad = input.nextInt();
	    	 
	    	 if (peso <= bajoPeso) {
	    		 edadPersonasBajoPeso += edad;
	    		 pesoPromedio += peso;
	    		 cantidadPersonasBajoPeso++;
	    	 } else if (peso >= sobrePeso){
	    	 edadPersonasSobrePeso += edad;
	    	 pesoPromedio += peso;
	    	 cantidadPersonasSobrePeso++;
	    	 } // conditional
	    	 
	    	 if (peso >= bajoPeso && peso <= sobrePeso) {
	    		 pesoPromedio += peso;
	    		 cantidadPersonasPesoNormal++;
	    	 } // end conditional
	    	 
	    	 
	    	 cantidadPersonasEstadistica++;
	     } // end while

	     Estadistica estadisticaDePersonas = new Estadistica(cantidadPersonasEstadistica);
	     
	   
	   
	   double pesoPromedioResultado = estadisticaDePersonas.calcularPesoPromedio(pesoPromedio);
	    
	     System.out.printf("El peso promedio de las personas es: %.2f \n", pesoPromedioResultado);
	   
	     System.out.println("La cantidad de personas con bajo peso es: " +  cantidadPersonasBajoPeso);
	     
	     System.out.println("La cantidad de personas con peso normal es: " + cantidadPersonasPesoNormal);
	     
	     System.out.println("La cantidad de personas con sobre peso es: " + cantidadPersonasSobrePeso);
	     
	     System.out.println("El promedio de la edad de las personas con bajo peso es: " + estadisticaDePersonas.calcularPromedioPersonasEdadBajoPeso(edadPersonasBajoPeso, cantidadPersonasBajoPeso));
	     
	     System.out.println("El promedio de las personas con sobre peso es: " + estadisticaDePersonas.calcularPromedioPersonasEdadSobrePeso(edadPersonasSobrePeso, cantidadPersonasSobrePeso));
	     
	     
	} // end main

} // end PruebaEstadistica
