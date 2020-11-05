package ar.edu.unlam.pb1.eva02.dominio;

public class Membresia {

	/* Atributos */
	private String tipoMembresia;
	private String detalleBeneficioMembresia;
	private final int PRECIO_MEMBRESIA_FREE;
	private final int PRECIO_MEMBRESIA_GOLD;
	private final int PRECIO_MEMBRESIA_PLATINIUM;

	
	/* Constructor */
	public Membresia(String tipoMembresia) {
		
		this.tipoMembresia = tipoMembresia;
		this.detalleBeneficioMembresia = "";
		this.PRECIO_MEMBRESIA_FREE = 0;
		this.PRECIO_MEMBRESIA_GOLD = 20;
		this.PRECIO_MEMBRESIA_PLATINIUM = 30;
	} // end constructor
	
	/* Métodos */
	
	public String getTipoMembresia() {
		return this.tipoMembresia;
	} // end getTipoMembresia
	
	public void setDetalleMembresia(String tipoMembresia) {
		
		switch (tipoMembresia) {
		
		case "FREE":
			this.detalleBeneficioMembresia = "Acceso a previews de álbumes, transmisiones en vivo sin posibilidad de\r\n" + 
					"realizar comentarios, subtítulos solo disponibles para contenido que no sea en\r\n" + 
					"vivo. Solo para uso en dispositivos móviles.";
			break;
			
		case "GOLD": 
			this.detalleBeneficioMembresia = "Acceso a todos los álbumes en formato standard, transmisiones en vivo\r\n" + 
					"con posibilidad de realizar comentarios, subtítulos disponibles para contenido\r\n" + 
					"en vivo.";
			break;
			
		case "PLATINIUM":
			this.detalleBeneficioMembresia = "Acceso a todos los álbumes en formato standard, transmisiones en\r\n" + 
					"vivo con posibilidad de realizar comentarios, subtítulos disponibles para\r\n" + 
					"contenido en vivo.\r\n" + 
					"Para uso en dispositivos móviles, web y SmartTv.";
			break;
		
		} // end switch
		
	} // end setDetalleMembresia
	
	public String getDetalleMembresia() {
		return this.detalleBeneficioMembresia;
	} // end getDetalleMembresia
	
	public int getPrecioMembresia() {
		
		int precio = 0;
		
		switch (tipoMembresia) {
		
			case "FREE":
			precio = this.PRECIO_MEMBRESIA_FREE;
			break;
			
			case "GOLD": 
			precio = this.PRECIO_MEMBRESIA_GOLD;
			break;
			
			case "PLATINIUM":
			precio = this.PRECIO_MEMBRESIA_PLATINIUM;
			break;
		
		} // end switch
		
		return precio;
	} // end getPrecioMembresia
	
} // end Membresia class
