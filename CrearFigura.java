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
		System.out.println("Distancia entre ambos circulos: " + circle.distanciaA(otroCircle));
		double alto = aleatorio.nextDouble() * 100.0;
		double ancho = aleatorio.nextDouble() * 100.0;
		Rectangulo rectangle = new Rectangulo(ancho, alto);
		rectangle.desplazar(40.0, -20.0);
		rectangle.caracteristicas();
		Punto puntoOrigen = new Punto(7.4, 4.5);
		double otroAlto = aleatorio.nextDouble() * 100.0;
		double otroAncho = aleatorio.nextDouble() * 100.0;
		Rectangulo otroRectangulo = new Rectangulo(puntoOrigen, otroAncho, otroAlto);
		rectangle.elMayor(otroRectangulo).caracteristicas();
		System.out.println("Distancia entre ambos rectangulos: " + rectangle.distanciaA(otroRectangulo));
		}
}