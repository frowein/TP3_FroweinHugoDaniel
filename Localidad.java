public class Localidad{
	private String nombre;
	private String provincia;
	
	/**
	*Cosntructor de la clase Localidad
	*@param p_nombre dato de tipo String
	*@param p_provincia dato de tipo String 
	*/
	public Localidad(String p_nombre, String p_provincia){
		this.setNombre(p_nombre);
		this.setProvincia(p_provincia);
	}
	//Inicio de los mutadores y observadores
	private void setNombre(String p_nombre){
		this.nombre = p_nombre;
	}
	
	private void setProvincia(String p_provincia){
		this.provincia = p_provincia;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getProvincia(){
		return this.provincia;
	}
	//Fin de los mutadores y observadores
	
	/**
	*El metodo mostrar retorna un dato de tipo String con nombre de la localidad y la provincia
	*@return dato de tipo String
	*/
	public String mostrar(){
		return "Localidad: " + this.getNombre() + "\tProvincia: " + this.getProvincia();
	}
}