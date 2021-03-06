public class Escuela{
	private String nombre;
	private String domicilio;
	private String director;
	
	/**
	*Constructor de la clase Escuela
	*@param p_nombre dato de tipo String
	*@param p_domicilio dato de tipo String
	*@param p_director dato de tipo String
	*/
	public Escuela(String p_nombre, String p_domicilio, String p_director){
	this.setNombre(p_nombre);
	this.setDomicilio(p_domicilio);
	this.setDirector(p_director);
	}
	
	//Inicio de los mutadores y observadores
	private void setNombre(String p_nombre){
	this.nombre = p_nombre;
	}
	
	private void setDomicilio(String p_domicilio){
	this.domicilio = p_domicilio;
	}
	
	private void setDirector(String p_director){
	this.director = p_director;
	}
	
	public String getNombre(){
	return this.nombre;
	}
	
	public String getDomicilio(){
	return this.domicilio;
	}
	
	public String getDirector(){
	return this.director;
	}
	//Fin de los mutadores y observadores
	
	/**
	*El dato imprimirRecibo recibe como parametro un objeto de clase Docente e imprime por pantalla un recibo
	*@param p_docente objeto de tipo Docente
	*/
	public void imprimirRecibo(Docente p_docente){
	System.out.println("Escuela: " + this.getNombre() + "\tDomicilio: " + this.getDomicilio() + "\tDirector: " + this.getDirector());
	System.out.println("----------------------------------------------------------------------------------------------------------");
	System.out.println("Docente: " + p_docente.getNombre());
	System.out.println("Sueldo: ...................... $" + p_docente.calcularSueldo());
	System.out.println("Sueldo Basico................. $" + p_docente.getSueldo());
	System.out.println("Asignacion Familiar........... $" + p_docente.getAsignacion());
	}
}