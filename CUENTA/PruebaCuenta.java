package ar.edu.unlam.pb1.tp03.prueba;
import  ar.edu.unlam.pb1.tp03.dominio.Cuenta;

public class PruebaCuenta {

	public static void main(String[] args) {

		Cuenta cuentaBancaria1 = new Cuenta("Dmitri Aliev"); // instanciación del objeto con inicialización 
		
		/* Consultamos estado de la cuenta */
		String estadoDeCuenta = cuentaBancaria1.toString();
	//	double saldoCuentaInicial = cuentaBancaria1.getSaldo();
		
		
		System.out.println("****Bienvenido/a****\n" + estadoDeCuenta);
		System.out.println("El saldo de la cuenta es: " + cuentaBancaria1.getSaldo());
		
		/* Deposito de dinero y consultado del estado del saldo  */
		cuentaBancaria1.depositar(150000.00);
		
		System.out.println("El saldo de la cuenta es: " + cuentaBancaria1.getSaldo());
	//	System.out.println(saldoCuentaInicial);
		
		/* Extracción de la cuenta */
		 cuentaBancaria1.retirar(1000);
		
		/* Estado de la aprobación de la extracción */
		if (cuentaBancaria1.verificarExtraccion() == true) {
			System.out.println("Operación exitosa. Su nuevo saldo es: "+ cuentaBancaria1.ExtraerDinero());
		} else {
			System.out.println("La operación no puede ser realizada. Insuficiente saldo.");
		}
		
		/* Consultamos el estado del saldo */
		System.out.println("El saldo de la cuenta es: " + cuentaBancaria1.getSaldo());
		
	} // end main

} // end  PruebaCuenta class
