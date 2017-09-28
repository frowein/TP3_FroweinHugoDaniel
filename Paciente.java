/**
*Clase Paciente
*@author Frowein Hugo Daniel
*/
public class Paciente{
	private int historiaClinica;
	private String nombre;
	private String domicilio;
	private Localidad localidadNacido;
	private Localidad localidadVive;
	
	/**
	*Constructor de la clase Paciente
	*@param p_historia dato de tipo int
	*@param p_nombre dato de tipo String
	*@param p_domicilio dato de tipo String
	*@param p_localidadNacido objeto de tipo Localidad
	*@param p_localidadVive objeto de tipo Localidad
	*/
	public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
		this.setHistoria(p_historia);
		this.setNombre(p_nombre);
		this.setDomicilio(p_domicilio);
		this.setNacido(p_localidadNacido);
		this.setVive(p_localidadVive);
	}
	
	//Inicio de los mutadores
	private void setHistoria(int p_historia){
		this.historiaClinica = p_historia;
	}
	
	private void setNombre(String p_nombre){
		this.nombre = p_nombre;
	}
	
	private void setDomicilio(String p_domicilio){
		this.domicilio = p_domicilio;
	}
	
	private void setNacido(Localidad p_localidadNacido){
		this.localidadNacido = p_localidadNacido;
	}
	
	private void setVive(Localidad p_localidadVive){
		this.localidadVive = p_localidadVive;
	}
	//Fin de los mutadores
	
	//Inicio de los observadores
	public int getHistoria(){
		return this.historiaClinica;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getDomicilio(){
		return this.domicilio;
	}
	
	public Localidad getNacido(){
		return this.localidadNacido;
	}
	
	public Localidad getVive(){
		return this.localidadVive;
	}
	//Fin de los observadores
	
	/**
	*El metodo mostrarDatosPantalla imprime en la pantalla datos como el nombre,historiaClinica,domicilio y datos de localidadVive
	*/
	public void mostrarDatosPantalla(){
		System.out.println("Paciente: " + this.getNombre() + "\tHistoria clinica: " + this.getHistoria() + "\tDomicilio: " + this.getDomicilio());
		System.out.println(this.getVive().mostrar());
	}
	
	/**
	*El metodo cadenaDeDatos retorna un dato de tipo String con los datos nombre, historiaClinica, domicilio, localidad donde vive y provincia.
	*@return dato de tipo String
	*/
	public String cadenaDeDatos(){
		return this.getNombre() + " ...... " + this.getHistoria() + " .... " + this.getDomicilio() + " - " + this.getVive().getNombre() + " - " + this.getVive().getProvincia();
	}
}