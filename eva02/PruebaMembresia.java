package ar.edu.unlam.pb1.eva02.dominio;
import java.util.Scanner;


public class PruebaMembresia {

	public static void main(String[] args) {
		
		/* Atributos, objetos, instanciación */
		
		Scanner input = new Scanner(System.in);
		int opcionArtistas = 0;
		int opcionMembresias = 0;
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
		Membresia free = new Membresia("Free", 0, "\nAcceso a previews de álbumes, transmisiones en vivo sin posibilidad de realizar comentarios,\nsubtítulos solo disponibles para contenido que no sea en vivo.\n *Solo para uso en dispositivos móviles.*\n");
		
		Membresia gold = new Membresia("Gold", 20, "\nAcceso a todos los álbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subtítulos disponibles para contenido en vivo. \n*Para uso en dispositivos móviles y web.*\n");
		
		Membresia platinium = new Membresia("Platinium", 30, "\nAcceso a todos los álbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subtítulos disponibles para contenido en vivo.\n*Para uso en dispositivos móviles, web y SmartTv.*\n");

		
		
	
		System.out.println("Bienvenido a Attach!");
// ------------- ACÁ EMPIEZA EL MENÚ PRINCIPAL DEL PROGRAMA ----------------------------		
		/* Menú Principal Artistas */
		
		
		do {
		
		opcionArtistas = mostrarMenuPrincipal(input, aquiver, hiraeth, iridescent);
		
		
		// En primer lugar guardamos la información elegida por el usuario
		
				artistaElegido = guardarArtistaSeleccionado(opcionArtistas, aquiver, hiraeth, iridescent,
						artistaElegido);
		
				/* ------------------------ SI EL USUARIO OPTÓ POR ACCEDER A LAS MEMBRESIAS, 
				 ACÁ EMPIEZA EL MENÚ DE MEMBRESÍAS ---------------------------------------------*/
				
			while (opcionArtistas == 1 || opcionArtistas == 2 || opcionArtistas == 3 )	 {
			
				
				System.out.println("Artista seleccionado: " + artistaElegido + "\n");
					
				System.out.println("1 - Membresia: " + free.toString() +  "\nPrecio: USD" + free.getPrecioMembresia() + "\nBeneficios: " + free.getDescripcion());
				
				System.out.println("2 - Membresía: " + gold.toString() + "\nPrecio: USD" + gold.getPrecioMembresia() + "\nBeneficios: " + gold.getDescripcion());
				
				System.out.println("3 - Membresía: " + platinium.toString() + "\nPrecio: USD" + platinium.getPrecioMembresia() + "\nBeneficios: " + platinium.getDescripcion());
				
				System.out.println("* Tené en cuenta que una vez que compres tu membresía solo la vas a poder utilizar \n para el artista que seleccionaste. ");
				
				System.out.println("\nA continuación, para realizar la compra seleccioná el número de la membresía: \n(Si deseas volver al menú principal, ingresá 0.)");
				opcionMembresias = input.nextInt();
				
				if (opcionMembresias != 1 && opcionMembresias != 2 && opcionMembresias != 3 && opcionMembresias != 0) {
					System.out.println("Ingresá una opción válida: \n");
				} // end conditional de validación de opción incorrecta
				
				
				
	//----------- SI EL USUARIO ELIGE 0 VUELVE AL MENÚ PRINCIPAL --------------			
				if (opcionMembresias == 0) {
					
					opcionArtistas = mostrarMenuPrincipal(input, aquiver, hiraeth, iridescent);
					artistaElegido = guardarArtistaSeleccionado(opcionArtistas, aquiver, hiraeth, iridescent,
							artistaElegido);
		
				} // end validación opción de membresías == 0
				
//	------------ SI EL USUARIO OPTA POR COMPRAR ENTRA POR ACÁ -------------------
			
			
				
				switch (opcionMembresias) { // En primer lugar guardamos la información elegida por el usuario
				
				case 1:
					montoCompra += free.getPrecioMembresia();
					membresiaElegida += free.getTipoMembresia();
					cantidadMembresiasCompradas++;
					break;
					
				case 2:
					montoCompra += gold.getPrecioMembresia();
					membresiaElegida += gold.getTipoMembresia();
					cantidadMembresiasCompradas++;
					break;
					
				case 3: 
					montoCompra += platinium.getPrecioMembresia();
					membresiaElegida += platinium.getTipoMembresia();
					cantidadMembresiasCompradas++;
					break;
				
				} // end switch 
				
				
				System.out.println("Tu compra fue realizada con éxito! \n Compraste: " + artistaElegido + " " + membresiaElegida + " Total: USD" + montoCompra );
				
			
				
				} // end while del menú de membresías
				
				
				
		
		
		
		} while (opcionArtistas < 0 || opcionArtistas > 3 ); 
		
		if (opcionArtistas == 0) {
			
		System.out.println("Esperamos que regreses pronto!");
		
		
		} // mensaje de despedida
		
		
		
		
	} // end main

	private static Artista guardarArtistaSeleccionado(int opcionArtistas, Artista aquiver, Artista hiraeth,
			Artista iridescent, Artista artistaElegido) {
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
		return artistaElegido;
	}

	private static int mostrarMenuPrincipal(Scanner input, Artista aquiver, Artista hiraeth, Artista iridescent) {
		int opcionArtistas;
		System.out.println("Ingresá la opción del artista al cual querés acceder: ");
		System.out.println("1 - " + aquiver + "\n2 - " + hiraeth + "\n3- " + iridescent + "\n0 - Ninguno, quiero salir!");
		opcionArtistas = input.nextInt();
	
		if (opcionArtistas != 1 && opcionArtistas != 2 && opcionArtistas != 3 && opcionArtistas != 0) {
			System.out.println("Ingresá una opción válida: \n");
		} // end conditional de validación de opción incorrecta
		return opcionArtistas;
	}

} // end PruebaMembresia
