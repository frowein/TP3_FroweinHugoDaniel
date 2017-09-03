import java.util.Random;
public class CrearFigura{
	public static void main(String [] args){
		Random aleatorio = new Random();
		double radio = aleatorio.nextDouble() * 100.0;
		Punto point = new Punto();
		Circulo circle = new Circulo(radio, point);
		circle.desplazar( -240.0, -230.0);
		circle.caracteristicas();
		Punto otroPoint = new Point(5.2, 0.5);
		double otroRadio = aleatorio.nextDouble() * 100.0;
		Circulo otroCircle = new Circulo(otroRadio, otroPoint);
		circle.elMayor(otroCircle).caracteristicas();
		System.out.println(circle.distanciaA(otroCircle));
	}
}