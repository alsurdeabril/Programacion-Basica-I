package ar.edu.unlam.pb1.tp02.prueba;

import ar.edu.unlam.pb1.tp02.dominio.Calculadora;

public class CalculadoraDelCelular {

	public static void main(String[] args) {
		
		Calculadora calCelular = new Calculadora(10.0,5.0); // recibe par�metros
		
		System.out.println("El resultado de la suma es: " + calCelular.sumar());
		
		System.out.println("El resultado de la resta es: " + calCelular.restar());
		
		System.out.println("El resultado de la multiplicaci�n es: " + calCelular.multiplicar());
		
		System.out.println("El resultado de la divisi�n es: " + calCelular.dividir());
		
		System.out.println("�Ambos n�meros son multiplos?: " + calCelular.decirMuLtiplo());
		
		System.out.println("El resultado de las operaciones va a ser positivo? " 
		+ calCelular.esPositivo());

	} // end main

} // end CalculadoraDelCelular class
