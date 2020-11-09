package ar.edu.unlam.pb1.eva02.dominio;
import java.util.Scanner;


public class PruebaMembresia {

	public static void main(String[] args) {
		
		/* Atributos, objetos, instanciaci�n */
		
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
		Membresia free = new Membresia("Free", 0, "\nAcceso a previews de �lbumes, transmisiones en vivo sin posibilidad de realizar comentarios,\nsubt�tulos solo disponibles para contenido que no sea en vivo.\n *Solo para uso en dispositivos m�viles.*\n");
		
		Membresia gold = new Membresia("Gold", 20, "\nAcceso a todos los �lbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subt�tulos disponibles para contenido en vivo. \n*Para uso en dispositivos m�viles y web.*\n");
		
		Membresia platinium = new Membresia("Platinium", 30, "\nAcceso a todos los �lbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subt�tulos disponibles para contenido en vivo.\n*Para uso en dispositivos m�viles, web y SmartTv.*\n");

		
		
	
		System.out.println("Bienvenido a Attach!");
// ------------- AC� EMPIEZA EL MEN� PRINCIPAL DEL PROGRAMA ----------------------------		
		/* Men� Principal Artistas */
		
		
		do {
		
		opcionArtistas = mostrarMenuPrincipal(input, aquiver, hiraeth, iridescent);
		
		
		// En primer lugar guardamos la informaci�n elegida por el usuario
		
				artistaElegido = guardarArtistaSeleccionado(opcionArtistas, aquiver, hiraeth, iridescent,
						artistaElegido);
		
				/* ------------------------ SI EL USUARIO OPT� POR ACCEDER A LAS MEMBRESIAS, 
				 AC� EMPIEZA EL MEN� DE MEMBRES�AS ---------------------------------------------*/
				
			while (opcionArtistas == 1 || opcionArtistas == 2 || opcionArtistas == 3 )	 {
			
				
				System.out.println("Artista seleccionado: " + artistaElegido + "\n");
					
				System.out.println("1 - Membresia: " + free.toString() +  "\nPrecio: USD" + free.getPrecioMembresia() + "\nBeneficios: " + free.getDescripcion());
				
				System.out.println("2 - Membres�a: " + gold.toString() + "\nPrecio: USD" + gold.getPrecioMembresia() + "\nBeneficios: " + gold.getDescripcion());
				
				System.out.println("3 - Membres�a: " + platinium.toString() + "\nPrecio: USD" + platinium.getPrecioMembresia() + "\nBeneficios: " + platinium.getDescripcion());
				
				System.out.println("* Ten� en cuenta que una vez que compres tu membres�a solo la vas a poder utilizar \n para el artista que seleccionaste. ");
				
				System.out.println("\nA continuaci�n, para realizar la compra seleccion� el n�mero de la membres�a: \n(Si deseas volver al men� principal, ingres� 0.)");
				opcionMembresias = input.nextInt();
				
				if (opcionMembresias != 1 && opcionMembresias != 2 && opcionMembresias != 3 && opcionMembresias != 0) {
					System.out.println("Ingres� una opci�n v�lida: \n");
				} // end conditional de validaci�n de opci�n incorrecta
				
				
				
	//----------- SI EL USUARIO ELIGE 0 VUELVE AL MEN� PRINCIPAL --------------			
				if (opcionMembresias == 0) {
					
					opcionArtistas = mostrarMenuPrincipal(input, aquiver, hiraeth, iridescent);
					artistaElegido = guardarArtistaSeleccionado(opcionArtistas, aquiver, hiraeth, iridescent,
							artistaElegido);
		
				} // end validaci�n opci�n de membres�as == 0
				
//	------------ SI EL USUARIO OPTA POR COMPRAR ENTRA POR AC� -------------------
			
			
				
				switch (opcionMembresias) { // En primer lugar guardamos la informaci�n elegida por el usuario
				
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
				
				
				System.out.println("Tu compra fue realizada con �xito! \n Compraste: " + artistaElegido + " " + membresiaElegida + " Total: USD" + montoCompra );
				
			
				
				} // end while del men� de membres�as
				
				
				
		
		
		
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
		System.out.println("Ingres� la opci�n del artista al cual quer�s acceder: ");
		System.out.println("1 - " + aquiver + "\n2 - " + hiraeth + "\n3- " + iridescent + "\n0 - Ninguno, quiero salir!");
		opcionArtistas = input.nextInt();
	
		if (opcionArtistas != 1 && opcionArtistas != 2 && opcionArtistas != 3 && opcionArtistas != 0) {
			System.out.println("Ingres� una opci�n v�lida: \n");
		} // end conditional de validaci�n de opci�n incorrecta
		return opcionArtistas;
	}

} // end PruebaMembresia
