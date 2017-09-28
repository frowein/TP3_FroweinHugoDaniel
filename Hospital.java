public class Hospital{
	private String nombreHospital;
	private String nombreDirector;
	
	/**
	*Constructor de la clase Hospital
	*@param p_hospital dato de tipo String
	*@param p_director dato de tipo String
	*/
	public Hospital(String p_hospital, String p_director){
		this.setHospital(p_hospital);
		this.setDirector(p_director);
	}
	
	//Inicio de los mutadores y observadores
	private void setHospital(String p_hospital){
		this.nombreHospital = p_hospital;
	}
	
	private void setDirector(String p_director){
		this.nombreDirector = p_director;
	}
	
	public String getHospital(){
		return this.nombreHospital;
	}
	
	public String getDirector(){
		return this.nombreDirector;
	}
	//Fin de los mutadores y observadores
	
	/**
	*El metodo consultaDatosFiliatorios imprime por pantalla los datos del hospital y el director
	*/
	public void consultaDatosFiliatorios(Paciente p_paciente){
		System.out.println("Hospital: " + this.getHospital() + "\tDirector: " + this.getDirector());
		System.out.println("--------------------------------------------------------------------------------------");
		p_paciente.mostrarDatosPantalla();
	}
}