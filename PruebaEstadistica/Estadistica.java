package ar.edu.unlam.pb1.tp06.dominio;

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

public class Estadistica {
	

	/* Atributos propios de la clase que reflejan el estado de la clase Persona */ 
	private int cantidadPersonas = 0;
	private double peso;
	private int edad;
	private double pesoPromedio;
	private double edadPromedioBajoPeso;
	private double edadPromedioSobrePeso;

	
	/*Constructor:  * En el constructor le asignamos valores a los atributos de ese objeto y los inicializamos */
	public Estadistica(int cantidadPersonas) {
		
		this.cantidadPersonas = cantidadPersonas;
		this.peso = 0.0;
		this.edad = 0;
		this.pesoPromedio = 0.0;
		this.edadPromedioBajoPeso = 0.0;
		this.edadPromedioSobrePeso = 0.0;
	
	} // end constructor 
	
	/* Métodos */
	public double calcularPesoPromedio(double pesoPromedio) {
		this.peso = pesoPromedio;
		pesoPromedio = peso / cantidadPersonas;
		return pesoPromedio;
	} // end calcularPesoPromedio

	public double calcularPromedioPersonasEdadBajoPeso(int edadPersonasBajoPeso, int cantidadPersonasBajoPeso) {
		
		edadPromedioBajoPeso = edadPersonasBajoPeso / cantidadPersonasBajoPeso;
		
		return edadPromedioBajoPeso;
	} // end calcularPromedioPersonasEdadBajoPeso
	
	public double calcularPromedioPersonasEdadSobrePeso(int edadPersonasSobrePeso, int cantidadPersonasSobrePeso) {
		
		edadPromedioSobrePeso = edadPersonasSobrePeso / cantidadPersonasSobrePeso;
		
		return edadPromedioSobrePeso;
	} // end calcularPromedioPersonasEdadSobrePeso
	

} // end Estadistica
