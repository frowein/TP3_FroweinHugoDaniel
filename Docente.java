public class Docente{
	private String nombre;
	private String grado;
	private double sueldoBasico;
	private double asignacionFamiliar;
	
	public Docente(String p_nombre, String p_grado, double p_sueldo, double p_asignacion){
	this.setNombre(p_nombre);
	this.setGrado(p_grado);
	this.setSueldoBasico(p_sueldo);
	this.setAsigancionFamiliar(p_asignacion);
	}
	
	private void setNombre(String p_nombre){
	this.nombre = p_nombre;
	}
	
	private void setGrado(String p_grado){
	this.grado = p_grado;
	}
	
	private void setSueldo(double p_sueldo){
	this.sueldoBasico = p_sueldo;
	}
	
	private void setAsigancionFamiliar(double p_asignacion){
	this.asignacionFamiliar = p_asignacion;
	}
	
	public String getNombre(){
	return this.nombre;
	}
	
	public String getGrado(){
	return this.grado;
	}
	
	public double getSueldo(){
	return this.sueldoBasico;
	}
	
	public double getAsignacion(){
	return this.asignacionFamiliar;
	}
	
	public double calcularSueldo(){
	return this.getSueldo() + this.getAsignacion();
	}
}