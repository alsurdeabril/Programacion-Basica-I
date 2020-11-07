package ar.edu.unlam.pb1.eva02.dominio;
import java.util.Scanner;


public class PruebaEva02 {
		
		static	final Membresia FREE = new Membresia("FREE", 0);
		static	final Membresia GOLD = new Membresia("GOLD", 20);
		static final Membresia PLATINIUM = new Membresia("PLATINIUM", 30);
		static Artista aquiver = Artista.AQUIVER;
		static Artista hiraeth = Artista.HIRAETH;
		static Artista iridescent = Artista.IRIDESCENDT;
		static Compra compraFreeAquiver = new Compra(FREE, aquiver);
		static Compra compraGoldAquiver = new Compra(GOLD, aquiver);
		static Compra compraPlatiniumAquiver = new Compra(PLATINIUM, aquiver);
		static Compra compraFreeHiraeth = new Compra(FREE, hiraeth);
		static Compra compraGoldHiraeth = new Compra(GOLD, hiraeth);
		static Compra compraPlatiniumHiraeth = new Compra(PLATINIUM, hiraeth);
		static Compra compraFreeIridescent = new Compra(FREE, iridescent);
		static Compra compraGoldIridescent = new Compra(GOLD, iridescent);
		static Compra compraPlatiniumIridescent = new Compra(PLATINIUM, iridescent);
		
		
		
		public static void main(String[] args) {
			
			
			Scanner input = new Scanner(System.in);
			int opcion = 0;
			int opcionCompra = 0;
			int opcionMembresia = 0;
			

			
			/* Comienzo del programa */
			System.out.println("Bienvenido a Attach!");
		
			do {
			opcion = mostrarMenuArtistas(input); // este es el men� principal
				
				switch (opcion) { // ingresa la opci�n elegida por el usuario para el artista
			
				
				case 1: // eligi� al primer artista
				/* Ac� va a elegir el tipo de membres�a */	
					
					do { // ac� empieza el do-while del men� de membres�as
				
					opcionMembresia = mostrarMenuMembresia(input);
	
					opcion = mostrarPrecioBeneficio(input, opcion, opcionMembresia);
					
					System.out.println("Deseas realizar la compra? \n1 - Si \n2- No");
					opcionCompra = input.nextInt();
					
							do { // ac� empieza el do de la confirmaci�n de la compra
					
					
					switch (opcionCompra) {
					
					case 1:
						// realiza las acciones de la compra
						
						if (opcionMembresia == 1) {
							compraFreeAquiver.realizarCompra(FREE);
							System.out.println("El precio total es: USD" + compraFreeAquiver.getImporteTotal());
						}
						
						break;
						
					case 2:
					 // no realiza la compra vuelve al men�  de las membres�as
						break;
						
					default: 
						System.out.println("Ingres� una opci�n v�lida: ");
					} // end switch de confirmaci�n de compra
					
					
					
							} while (opcionCompra != 2); // termina el while de la confirmaci�n de la compra   
					
							// no realiza la compra vuelve al men�  principal
						
					} while (opcionMembresia != 5); // ac� termina el do-while del men� de membres�as
				
					
					
					break; // break case 1 del switch principal
					
				case 2: // eligi� al segundo artista
					break;
					
				case 3: // eligi� al tercer artista
					break;
					
				case 6:
					// salir
					break;
					
				default: // eligi� una opci�n no v�lida
					System.out.println("Ingres� una opci�n valida: ");
				
				} // end switch del men� principal 
				
				
				
				
			} while (opcion != 6); // termina el while del men� principal
			
			System.out.println("Esperamos que regreses pronto!");
			
			
		} // end main



		private static int mostrarPrecioBeneficio(Scanner input, int opcion, int opcionMembresia) {
			switch (opcionMembresia) { // ingresa la opci�n elegida por el usuario para la membres�a
			case 1: // ac� el usuario va a visualizar el detalle de la membres�a 1
				
				System.out.println("\nPrecio: USD " + FREE.getPrecioMembresia());
				System.out.println("Beneficios: \n" + "Acceso a previews de �lbumes, transmisiones en vivo sin posibilidad de realizar comentarios,\nsubt�tulos solo disponibles para contenido que no sea en vivo.\n *Solo para uso en dispositivos m�viles.*");
				
				break;
				
			case 2:  // ac� el usuario va a visualizar el detalle de la membres�a 2
				System.out.println("\nPrecio: USD " + GOLD.getPrecioMembresia());
				System.out.println("Beneficios: \n" + "Acceso a todos los �lbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subt�tulos disponibles para contenido en vivo. \n*Para uso en dispositivos m�viles y web.*");
				break;
			
			case 3:  // ac� el usuario va a visualizar el detalle de la membres�a 3
				System.out.println("\nPrecio: USD " + PLATINIUM.getPrecioMembresia());
				System.out.println("Beneficios: \n" + "Acceso a todos los �lbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subt�tulos disponibles para contenido en vivo.\n*Para uso en dispositivos m�viles, web y SmartTv.*" );
				break;
				
			case 5: // Para que el usuario vaya hacia atr�s y pueda salir con el men� principal
			opcion = mostrarMenuArtistas(input);
				break;
				
			default: 
				System.out.println("Ingres� una opci�n v�lida");
			} // end switch opcionMembresia
			return opcion;
		}



		private static int mostrarMenuMembresia(Scanner input) {
			int opcionMembresia;
			System.out.println("Te ofrecemos: ");
			System.out.println("1 - Membres�a Free* \n2 - Membres�a Gold* \n3 - Membres�a Platinium* \n5- Ir hacia atr�s");
			System.out.println("* Ten� en cuenta que una vez que compres tu membres�a solo la vas a poder utilizar \n para el artista que seleccionaste. ");
			opcionMembresia = input.nextInt();
			return opcionMembresia;
		}
		
		
	
		private static int mostrarMenuArtistas(Scanner input) {
			int opcion;
			System.out.println("Ingres� la opci�n del artista al cual quer�s acceder: ");
		System.out.println("1 - " + Artista.AQUIVER + "\n2 - " + Artista.HIRAETH + "\n3- " + Artista.IRIDESCENDT + "\n6 - Ninguno, quiero salir!");
		opcion = input.nextInt();
		return opcion;
		} // end mostrarMenuArtistas
		

		private static int mostrarMenuMembresias(Scanner input) {
			int opcion;
			System.out.println("Te ofrecemos: ");
			System.out.println("1 - Membres�a Free* \n2 - Membres�a Gold* \n3 - Membres�a Platinium*");
			System.out.println("* Ten� en cuenta que una vez que compres tu membres�a solo la vas a poder utilizar \n para el artista que seleccionaste. ");
			opcion = input.nextInt();
			return opcion;
		} // end mostrarMenuMembresias
	
	
	
	
} // end Prueba02
