public class Rectangulo{
	private Punto origen;
	private double ancho;
	private double alto;

	public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
	this.setOrigen(p_origen);
	this.setAncho(p_ancho);
	this.setAlto(p_alto);
	}
	
	public Rectangulo(double p_ancho, double p_alto){
	this.setOrigen(p_origen);
	this.setAncho(p_ancho);
	this.setAlto(p_alto);
	}
	
	private void setOrigen(Punto p_origen){
	this.origen = p_origen;
	}
	
	private void setAncho(double p_ancho){
	this.ancho = p_ancho;
	}
	
	private void setAlto(double p_alto){
	this.alto = p_alto;
	}
	
	public Punto getOrigen(){
	return this.origen;
	}
	
	public double getAncho(){
	return this.ancho;
	}
	
	public double getAlto(){
	return this.alto;
	}
	
	public void desplazar(double p_dx, double p_dy){
	this.getOrigen().desplazar(p_dx,p_dy);
	}
	
	public void caracteristicas(){
	System.out.prinln("****** Rectangulo ******");
	System.out.prinln();
	System.out.prinln();
	}
	
	public double perimetro(){
	return 2 * (this.getAncho() + this.getAlto());
	}
	
	public double superficie(){
	return this.getAlto() * this.getAncho();
	}
	
	public double distanciaA(Rectaculo otroRectangulo){
		double x1 = otroRectangulo.getCentro().getX();
		double y1 = otroRectangulo.getCentro().getY();
		double x2 = this.getCentro().getX();
		double y2 = this.getCentro().getY();
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
}