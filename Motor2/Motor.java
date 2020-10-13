package ar.edu.unlam.pb1.tp04.dominio;

/* 5. Definí una clase Motor considerando los siguientes atributos de clase: tipoBomba (int),
tipoFluido (String), combustible (String). Definí un constructor asignando unos valores de
defecto a los atributos y los métodos para poder establecer y obtener los valores de los
atributos. Crea un método tipo procedimiento denominado dimeTipoMotor() donde a
través de un condicional switch hagas lo siguiente:
a. Si el tipo de motor es 0, mostrar un mensaje por consola indicando “No hay
establecido un valor definido para el tipo de bomba”.
b. Si el tipo de motor es 1, mostrar un mensaje por consola indicando “La bomba es
una bomba de agua”.
c. Si el tipo de motor es 2, mostrar un mensaje por consola indicando “La bomba es
una bomba de gasolina”.
d. Si el tipo de motor es 3, mostrar un mensaje por consola indicando “La bomba es
una bomba de hormigón”.
e. Si el tipo de motor es 4, mostrar un mensaje por consola indicando “La bomba es
una bomba de pasta alimenticia”.
f. Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe
un valor válido para tipo de bomba”. */

public class Motor {
	
	/* Atributos propios de la clase que reflejan el estado de la clase Motor */
	
	private int tipoBomba;
	private String tipoFluido;
	private String combustible;
	public static int tipoMotor = 0; // static -> la información contenida en estos atributos va a ser común a todos los objetos, pertenece a esta clase
	
	/* Constructor: Le asignamos valores a los atributos de ese objeto y los inicializamos */
	public Motor() {
		this.tipoBomba = 0;
		this.tipoFluido = "";
		this.combustible = "";
	} // end Constructor
	
	public void setTipoBomba(int tipoBomba) {
		this.tipoBomba = tipoBomba;
	} // end setTipoBomba
	
	public int getTipoBomba() {
		return this.tipoBomba;
	} // end getTipoBomba
	
	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	} // end setTipoFluido
	
	public String getTipoFluido() {
		return this.tipoFluido;
	} // end getTipoFluiod
	
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	} // end setCombustible
	
	public String getCombustible() {
		return this.combustible;
	} // end getCombustible
	
	/* Método a utilizar en caso que no se haya establecido un tipo de bomba: 
	 
	public int dimeTipoMotor(int tipoMotor) {
		return this.tipoMotor = tipoMotor;
	} // end dimeTipoMotor    */
	
	public int dimeTipoMotor() {
        return this.tipoBomba; 
	} // end dimeTipoMotor
	
} // end Motor
