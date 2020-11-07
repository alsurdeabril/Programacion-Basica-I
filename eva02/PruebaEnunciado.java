package ar.edu.unlam.pb1.eva02.dominio;
import java.util.Scanner;



public class PruebaEnunciado {
	
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
		
		
		
		/* Comienzo del programa */
		System.out.println("Bienvenido a Attach!");
		
		do {
	    opcion = mostrarMenuArtistas(input);
	    
	    switch(opcion) {
	    
	    case 1: 
	    	opcion = mostrarMenuMembresias(input);
	    	
	    	mostrarPrecioBeneficios(opcion);
	    	
	    	opcionCompra = preguntarRealizaCompra(input);
	    	
	    	switch (opcionCompra) {
	    	
	    	case 1: 
	    		comprarAquiver(opcion);
	    		
	    		break;
	    	
	    	case 2:
	    		System.out.println("Qué pena!");
	    		break;
	    		
	    	default: 
	    		System.out.println("Ingresá una opción válida: ");
	    	} // end switch de compra
	    	
	    	System.out.println("Deseas realizar otra compra?  \n1 - Si \n2- No");
    		opcionCompra = input.nextInt();
    		
	    	break;
	    	
	    case 2:
	    	opcion = mostrarMenuMembresias(input);

	    	mostrarPrecioBeneficios(opcion);
	    	
	    	opcionCompra = preguntarRealizaCompra(input);
	    	
	    		switch (opcionCompra) {
	    		
	    		case 1: 
	    			comprarHiraeth(opcion);
	    		break;
	    		
	    		case 2:
		    		System.out.println("Qué pena!");
		    		break;
		    		
		    	default: 
		    		System.out.println("Ingresá una opción válida: ");
	    			
	    		break;
	    		
	    		} // end switch de compra
	    	
	    	break;
	    	
	    case 3:
	    	opcion = mostrarMenuMembresias(input);

	    	mostrarPrecioBeneficios(opcion);
	    	
	    	opcionCompra = preguntarRealizaCompra(input);
	    	
	    		switch(opcionCompra) {
	    		
	    		case 1: comprarIrisdecent(opcion);
	    		break;
	    	
	    		case 2:
		    		System.out.println("Qué pena!");
		    		break;
		    		
		    	default: 
		    		System.out.println("Ingresá una opción válida: ");
	    			
	    		break; 
	    		
	    		} // end switch compra
	    	
	    	break;
	    
	    case 6: 
	    	break;
	    
	    default:
	    	System.out.println("Ingresá una opción valida: ");
	    } // end switch
	    
		} while (opcion != 6);  // siempre que el usuario no haya ingresado la opción de salir
		

			System.out.println("Esperamos que regreses pronto!");
		
	} // end main

	/* Menú */
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

	private static void mostrarDetalleMembresias(int opcion) {
		switch(opcion) {
		
		case 1: 
			System.out.println("Precio: USD " + FREE.getPrecioMembresia());
			System.out.println("Beneficios: \n" + "Acceso a previews de álbumes, transmisiones en vivo sin posibilidad de realizar comentarios,\nsubtítulos solo disponibles para contenido que no sea en vivo.\n *Solo para uso en dispositivos móviles.*");
			break;
		
		case 2: 
			System.out.println("Precio: USD " + GOLD.getPrecioMembresia());
			System.out.println("Beneficios: \n" + "Acceso a todos los álbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subtítulos disponibles para contenido en vivo. \n*Para uso en dispositivos móviles y web.*");
			break;
			
		case 3: 
			System.out.println("Precio: USD " + PLATINIUM.getPrecioMembresia());
			System.out.println("Beneficios: \n" + "Acceso a todos los álbumes en formato standard, transmisiones en vivo con posibilidad de \nrealizar comentarios, subtítulos disponibles para contenido en vivo.\n*Para uso en dispositivos móviles, web y SmartTv.*" );
			break;
		} // end switch

	} // end mostrarDetalleMembresias
	
	private static void mostrarPrecioBeneficios(int opcion) {
		if (opcion == 1) {
			mostrarDetalleMembresias(1);
		} else if (opcion == 2) {
			mostrarDetalleMembresias(2);
		} else {
			mostrarDetalleMembresias(3);
		} // end conditional
	} // end mostrarPreciosBeneficios
	
	private static void comprarAquiver(int opcion) {
		if (opcion == 1) {
		compraFreeAquiver.realizarCompra(FREE);
		System.out.println("El precio total es: USD" + compraFreeAquiver.getImporteTotal());
		} else if (opcion == 2) {
		compraGoldAquiver.realizarCompra(GOLD);
			System.out.println("El precio total es: USD" + compraGoldAquiver.getImporteTotal());
		} else {
		compraPlatiniumAquiver.realizarCompra(PLATINIUM);
			System.out.println("El precio total es: USD" + compraPlatiniumAquiver.getImporteTotal());
		} // end conditional
	} // end comprarAquiver


	private static void comprarHiraeth(int opcion) {
		if (opcion == 1) {
			compraFreeHiraeth.realizarCompra(FREE);
			System.out.println("El precio total es: USD" + compraFreeHiraeth.getImporteTotal());
		} else if (opcion == 2) {
			compraGoldHiraeth.realizarCompra(GOLD);
			System.out.println("El precio total es: USD" + compraGoldHiraeth.getImporteTotal());
		} else {
			compraPlatiniumHiraeth.realizarCompra(PLATINIUM);
			System.out.println("El precio total es: USD" + compraPlatiniumHiraeth.getImporteTotal());
		} // end conditional
	} // end comprarHiraeth
	
	private static void comprarIrisdecent(int opcion) {
		if (opcion == 1) {
			compraFreeIridescent.realizarCompra(FREE);
			System.out.println("El precio total es: USD" + compraFreeIridescent.getImporteTotal());
		} else if (opcion == 2) {
			compraGoldIridescent.realizarCompra(GOLD);
			System.out.println("El precio total es: USD" + compraGoldIridescent.getImporteTotal());
		} else {
			compraPlatiniumIridescent.realizarCompra(PLATINIUM);
			System.out.println("El precio total es: USD" + compraPlatiniumIridescent.getImporteTotal());
		} // end conditional
	} // end comprarIrisdecent
	
	private static int preguntarRealizaCompra(Scanner input) {
		int opcionCompra;
		System.out.println("Deseas realizar la compra? \n1 - Si \n2- No");
		opcionCompra = input.nextInt();
		return opcionCompra;
	} // end  preguntarRealizaCompra
	
} // end PruebaEnunciado
