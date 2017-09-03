public class Circulo{
	private double radio;
	private Punto centro;
	
	public Circulo(double p_radio, Punto p_centro){
		this.setRadio(p_radio);
		this.setCentro(p_centro);
	}
	
	public Circulo(){
		this.setRadio(0.0);
		this.getCentro().Punto(0,0);
	}
	
	private void setCentro(Punto p_centro){
		this.centro = p_centro;
	}
	
	private void setRadio(double p_radio){
		this.radio = p_radio;
	}
	
	public Punto getCentro(){
		return this.centro;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public void desplazar(double p_dx, double p_dy){
		this.getCentro().desplazar(p_dx,p_dy);
	}
	
	public void caracteristicas(){
		System.out.println("****** Circulo ******");
		System.out.println("Centro: " + this.getCentro.coordenadas() + " - Radio: " + this.getRadio());
		System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
	}
	
	public double perimetro(){
		return 2 * Math.PI() * this.getRadio();
	}
	
	public double superficie(){
		return Mathi.PI * Math.pow(this.getRadio(), 2);
	}
	
	public double distanciaA(Circulo otroCirculo){
		double x1 = otroCirculo.getCentro().getX();
		double y1 = otroCirculo.getCentro().getY();
		double x2 = this.getCentro().getX();
		double y2 = this.getCentro().getY();
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	
	public Circulo elMayor(Circulo otroCirculo){
		if(this.superficie() > otroCirculo.superficie()){
			return this;
		}else{
			return otroCirculo;
		}
	}
}