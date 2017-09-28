public class Circulo{
	private double radio;
	private Punto centro;
	
	public Circulo(double p_radio, Punto p_centro){
		this.setRadio(p_radio);
		this.setCentro(p_centro);
	}
	
	public Circulo(){
		this.setRadio(0.0);
		this.setCentro(new Punto());
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
		System.out.println("Centro: " + this.getCentro().coordenadas() + " - Radio: " + this.getRadio());
		System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
	}
	
	public double perimetro(){
		return 2 * Math.PI * this.getRadio();
	}
	
	public double superficie(){
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
	
	public double distanciaA(Circulo otroCirculo){
		return this.getCentro().distanciaA(otroCirculo.getCentro());
	}
	
	public Circulo elMayor(Circulo otroCirculo){
		if(this.superficie() > otroCirculo.superficie()){
			return this;
		}else{
			return otroCirculo;
		}
	}
}