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
			opcion = mostrarMenuArtistas(input); // este es el menú principal
				
				switch (opcion) { // ingresa la opción elegida por el usuario para el artista
			
				
				case 1: // eligió al primer artista
				/* Acá va a elegir el tipo de membresía */	
					
					do { // acá empieza el do-while del menú de membresías
				
					opcionMembresia = mostrarMenuMembresia(input);
	
					opcion = mostrarPrecioBeneficio(input, opcion, opcionMembresia);
					
					System.out.println("Deseas realizar la compra? \n1 - Si \n2- No");
					opcionCompra = input.nextInt();
					
							do { // acá empieza el do de la confirmación de la compra
					
					
					switch (opcionCompra) {
					
					case 1:
						// realiza las acciones de la compra
						
						if (opcionMembresia == 1) {
							compraFreeAquiver.realizarCompra(FREE);
							System.out.println("El precio total es: USD" + compraFreeAquiver.getImporteTotal());
						}
						
						break;
						
					case 2:
					 // no realiza la compra vuelve al menú  de las membresías
						break;
						
					default: 
						System.out.println("Ingresá una opción válida: ");
					} // end switch de confirmación de compra
					
					
					
							} while (opcionCompra != 2); // termina el while de la confirmación de la compra   
					
							// no realiza la compra vuelve al menú  principal
						
					} while (opcionMembresia != 5); // acá termina el do-while del menú de membresías
				
					
					
					break; // break case 1 del switch principal
					
				case 2: // eligió al segundo artista
					break;
					
				case 3: // eligió al tercer artista
					break;
					
				case 6:
					// salir
					break;
					
				default: // eligió una opción no válida
					System.out.println("Ingresá una opción valida: ");
				
				} // end switch del menú principal 
				
				
				
				
			} while (opcion != 6); // termina el while del menú principal
			
			System.out.println("Esperamos que regreses pronto!");
			
			
		} // end main



		private static int mostrarPrecioBeneficio(Scanner input, int opcion, int opcionMembresia) {
			switch (opcionMembresia) { // ingresa la opción elegida por el usuario para la membresía
			case 1: // acá el usuario va a visualizar el detalle de la membresía 1
				
				System.out.println("\nPrecio: USD " + FREE.getPrecioMembresia());
				System.out.println("Beneficios: \n" + "Acceso a previews de álbumes, transmisiones en vivo sin posibilidad de realizar comentarios,\nsubtítulos solo disponibles para contenido que no sea en vivo.\n *Solo para uso en dispositivos móviles.*");
				
				break;
				
			case 2:  // acá el usuario va a visualizar el detalle de la membresía 2
				System.out.println("\nPrecio: USD " + GOLD.getPrecioMembresia());
				System.out.println("Beneficios: \n" + "Acceso a todos los álbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subtítulos disponibles para contenido en vivo. \n*Para uso en dispositivos móviles y web.*");
				break;
			
			case 3:  // acá el usuario va a visualizar el detalle de la membresía 3
				System.out.println("\nPrecio: USD " + PLATINIUM.getPrecioMembresia());
				System.out.println("Beneficios: \n" + "Acceso a todos los álbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subtítulos disponibles para contenido en vivo.\n*Para uso en dispositivos móviles, web y SmartTv.*" );
				break;
				
			case 5: // Para que el usuario vaya hacia atrás y pueda salir con el menú principal
			opcion = mostrarMenuArtistas(input);
				break;
				
			default: 
				System.out.println("Ingresá una opción válida");
			} // end switch opcionMembresia
			return opcion;
		}



		private static int mostrarMenuMembresia(Scanner input) {
			int opcionMembresia;
			System.out.println("Te ofrecemos: ");
			System.out.println("1 - Membresía Free* \n2 - Membresía Gold* \n3 - Membresía Platinium* \n5- Ir hacia atrás");
			System.out.println("* Tené en cuenta que una vez que compres tu membresía solo la vas a poder utilizar \n para el artista que seleccionaste. ");
			opcionMembresia = input.nextInt();
			return opcionMembresia;
		}
		
		
	
		private static int mostrarMenuArtistas(Scanner input) {
			int opcion;
			System.out.println("Ingresá la opción del artista al cual querés acceder: ");
		System.out.println("1 - " + Artista.AQUIVER + "\n2 - " + Artista.HIRAETH + "\n3- " + Artista.IRIDESCENDT + "\n6 - Ninguno, quiero salir!");
		opcion = input.nextInt();
		return opcion;
		} // end mostrarMenuArtistas
		

		private static int mostrarMenuMembresias(Scanner input) {
			int opcion;
			System.out.println("Te ofrecemos: ");
			System.out.println("1 - Membresía Free* \n2 - Membresía Gold* \n3 - Membresía Platinium*");
			System.out.println("* Tené en cuenta que una vez que compres tu membresía solo la vas a poder utilizar \n para el artista que seleccionaste. ");
			opcion = input.nextInt();
			return opcion;
		} // end mostrarMenuMembresias
	
	
	
	
} // end Prueba02
