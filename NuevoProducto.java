
/**
 * Ejecutable
 * 
 * @author Frowein Hugo Daniel 
 */
public class NuevoProducto{
    public static void main(String[] args){
    Laboratorio lab = new Laboratorio("colgate sa", "peru 7000", "8096543456789", 1, 1);
    Producto prod = new Producto(5, "odontologia", "limpieza bucal", 15.7, 20.5, 6, lab);
    prod.mostrar();
}
}