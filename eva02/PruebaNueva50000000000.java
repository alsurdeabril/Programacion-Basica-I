package ar.edu.unlam.pb1.eva02.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.eva02.dominio.Artista;
import ar.edu.unlam.pb1.eva02.dominio.Membresia;


public class PruebaNueva50000000000 {

public static void main(String[] args) {
		
		
		/* Atributos, objetos, instanciaci�n */
		
		Scanner input = new Scanner(System.in);
		int opcionArtistas = 0;
		int opcionMembresias = 0;
		int opcionSigueComprando = 0;
		int montoCompra = 0;
		int montoCompraTotal = 0;
		String membresiaElegida = "";
		int cantidadMembresiasCompradas = 0;
		
	
		/* Artistas*/
		Artista aquiver = Artista.AQUIVER;
		Artista hiraeth = Artista.HIRAETH;
		Artista iridescent = Artista.IRIDESCENDT;
		Artista artistaElegido = null;
		
		/* Membresias */
		Membresia free = new Membresia("Free", 0, "\nAcceso a previews de �lbumes, transmisiones en vivo sin posibilidad de realizar comentarios,\nsubt�tulos solo disponibles para contenido que no sea en vivo.\n *Solo para uso en dispositivos m�viles.*\n");
		
		Membresia gold = new Membresia("Gold", 20, "\nAcceso a todos los �lbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subt�tulos disponibles para contenido en vivo. \n*Para uso en dispositivos m�viles y web.*\n");
		
		Membresia platinium = new Membresia("Platinium", 30, "\nAcceso a todos los �lbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subt�tulos disponibles para contenido en vivo.\n*Para uso en dispositivos m�viles, web y SmartTv.*\n");

		
		System.out.println("Bienvenido a Attach!");
		 
		do {
		
		
		do {
			
		System.out.println("Ingres� la opci�n del artista al cual quer�s acceder: ");
		System.out.println("1 - " + aquiver + "\n2 - " + hiraeth + "\n3- " + iridescent + "\n0 - Ninguno, quiero salir!");
			opcionArtistas = input.nextInt();
					
			if (opcionArtistas != 1 && opcionArtistas != 2 && opcionArtistas != 3 && opcionArtistas != 0) {
				System.out.println("Ingres� una opci�n v�lida: ");
			} // end conditional mensaje de validaci�n
			
	
			
		} while (opcionArtistas < 0 || opcionArtistas > 3);
		
		// ---------------- AC� SE TERMIN� EL CICLO DO- WHILE DEL MEN� PRINCIPAL--------------------
	
	
		
		if (opcionArtistas == 0) { // mensaje de despedida
			
			System.out.println("Esperamos que regreses pronto!");
		} // end conditional 
		
	
		
// ------- SI EL USUARIO DECIDE SEGUIR SE GUARDA LA INFORMACI�N DEL ARTISTA QUE SELECCION�---------
		
		switch (opcionArtistas) {
		
		case 1:
			artistaElegido = aquiver;
			break;
			
		case 2:
			artistaElegido = hiraeth;
			break;
			
		case 3:
			artistaElegido = iridescent;
			break;
		
		
		} // end switch de los artistas elegidos por el usuario
		
		
		
		
// -------- AC� EMPIEZA LA PARTE DEL MEN� DE MEMBRES�AS -----------
		if (opcionArtistas == 1 || opcionArtistas == 2 || opcionArtistas == 3) {
			do {
				System.out.println("Artista seleccionado: " + artistaElegido + "\n");
				
				System.out.println("1 - Membresia: " + free.toString() +  "\nPrecio: USD" + free.getPrecioMembresia() + "\nBeneficios: " + free.getDescripcion());
				
				System.out.println("2 - Membres�a: " + gold.toString() + "\nPrecio: USD" + gold.getPrecioMembresia() + "\nBeneficios: " + gold.getDescripcion());
				
				System.out.println("3 - Membres�a: " + platinium.toString() + "\nPrecio: USD" + platinium.getPrecioMembresia() + "\nBeneficios: " + platinium.getDescripcion());
				
				System.out.println("* Ten� en cuenta que una vez que compres tu membres�a solo la vas a poder utilizar \n para el artista que seleccionaste. ");
				
				System.out.println("\nA continuaci�n, para realizar la compra seleccion� el n�mero de la membres�a: \n(Si deseas volver al men� principal, ingres� 0.)");
				opcionMembresias = input.nextInt();
				
				if (opcionMembresias != 1 && opcionMembresias != 2 && opcionMembresias != 3 && opcionMembresias != 0) {
					System.out.println("Ingres� una opci�n v�lida: ");
				} // end conditional mensaje de validaci�n
				
			} while (opcionMembresias < 0 || opcionMembresias > 3);
			
		
	// ---------- AC� SE CIERRA EL CICLO DO WHILE DE MEMBRESIAS----------------	
			
			if (opcionMembresias == 0) {
				System.out.println("REDIRIGIR");// LLAMAR AL M�TODO DEL MEN� PRINCIPAL
			} // end conditional para redirigir al men� principal
			
			
		} // end if opci�n artistas es seleccionado
// ----------- SE CIERRA EL CONDICIONAL DEL ARTISTA SELECCIONADO----------
	

		// ------- SI EL USUARIO DECIDE SEGUIR SE GUARDA LA INFORMACI�N DE LA MEMBRESIA QUE SELECCION�---------
		switch (opcionMembresias) {
		
		case 1:
			montoCompra += free.getPrecioMembresia();
			membresiaElegida += free.getTipoMembresia();
			cantidadMembresiasCompradas++;
			montoCompraTotal += montoCompra;
			break;
			
		case 2:
			montoCompra += gold.getPrecioMembresia();
			membresiaElegida += gold.getTipoMembresia();
			cantidadMembresiasCompradas++;
			montoCompraTotal += montoCompra;
			break;
			
		case 3:
			montoCompra += platinium.getPrecioMembresia();
			membresiaElegida+= platinium.getTipoMembresia();
			cantidadMembresiasCompradas++;
			montoCompraTotal += montoCompra;
			break;
		
		} // end switch de la opci�n de membres�as
		
		// --------- AC� SE LE NOTIFICA DE LA COMPRA -----------
		if (opcionMembresias == 1 || opcionMembresias == 2 || opcionMembresias == 3) {
			System.out.println("Tu compra fue realizada con �xito! \nCompraste: " + artistaElegido + " " + membresiaElegida + "\nTotal: USD" + montoCompra );
			// ------- SE LE PREGUNTA AL USUARIO SI QUIERE SEGUIR COMPRANDO ---------
		do {
			System.out.println("Deseas agregar alguna membres�a m�s? \n1- Si \n2- No");
		opcionSigueComprando = input.nextInt();
			//------- Mensaje de opci�n inv�lida -------------
		if (opcionSigueComprando != 1 && opcionSigueComprando != 2) {
		System.out.println("Por favor, ingres� una opci�n valida: ");
/******************************************************/		
		} else if (opcionSigueComprando == 1) {
			opcionMembresias = 0;
			montoCompra = 0;
		}
		
		} while (opcionSigueComprando < 1 || opcionSigueComprando > 2);
			//------ Se termina el ciclo do-while del sigue comprando ------------
		} // end conditional de la notificaci�n de la compra
		
	//---------------------SE LE INFOMA EL IMPORTE PRECIO TOTAL Y LA CANTIDAD DE LO COMPRADO-----------------
		 if (opcionSigueComprando == 2) {
		
			System.out.println("El total de tu compra es: USD" + montoCompraTotal + "\nLa cantidad de membres�as que adquiriste fueron: " + cantidadMembresiasCompradas + "\nGracias por confiar en nosotros!" );
		
		 } // end conditional

		} while (opcionSigueComprando == 1 && opcionArtistas != 0);
//---------------- Ac� se termina el do - while del ciclo en el que el usuario decide volver a comprar---------
		
		
	} // end main

	
	
	
	
	
} // end PruebaNueva50000000000
