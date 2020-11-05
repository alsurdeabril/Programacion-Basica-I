package ar.edu.unlam.pb1.eva02.dominio;

/* luego una vez ingresado el elegido mostrar los tipos de membresías, los beneficios de
la mismas, su precio y , asimismo, la posibilidad de efectivizar la compra. Se debe
tener en cuenta que una vez efectivizada la compra se debe ofrecerle al usuario la
opción de comprar nuevamente otra. En caso que el usuario decida finalizar su
compra se debe informarle que su compra fue realizada, y si decide comprar más
membresías el total de su compra y las cantidades de membresías adquiridas.
Además se debe informarle al usuario que dichas membresías solo habilitarán los
beneficios de el/los artista elegido/s. */

public class Compra {

	/* Atributos */
	private Artista nombre;
	private Membresia tipoMembresia;
	private String nombreMembresia;
	private boolean deseaRealizarCompra;
	private boolean efectivizoCompra;
	private int importeTotal;
	private int cantidadMembresiasAdquiridas;
	
	/* Constructor */
	public Compra(Membresia tipoMembresia, Artista nombre) {
		
		this.tipoMembresia = tipoMembresia;
		this.nombre = nombre;
		this.nombreMembresia = "";
		
		this.deseaRealizarCompra = false;
		this.efectivizoCompra = false;
		this.importeTotal = 0;
		this.cantidadMembresiasAdquiridas = 0;
		
	} // end Constructor
	
	/* Métodos */
	public String conocerTipoMembresia(){
	this.nombreMembresia = tipoMembresia.toString();
	return nombreMembresia;
	}
	
	
	public void realizarCompra() {
		
		switch (nombreMembresia) {
		
		case "FREE":
		//	this.importeTotal += this.PRECIO_MEMBRESIA_FREE;
			this.importeTotal += tipoMembresia.getPrecioMembresia();
			break;
			
		case "GOLD":
			this.importeTotal += tipoMembresia.getPrecioMembresia();
			break;
			
		case "PLATINIUM": 
			this.importeTotal += tipoMembresia.getPrecioMembresia();
			break;
		
		} // end switch
		
		cantidadMembresiasAdquiridas++;
		
	} // end realizarCompra
		
	public int getCantidadMembresiasCompradas() {
		return this.cantidadMembresiasAdquiridas;
	} // end getCantidadMembresiasCompradas
	
} // end Compra class
