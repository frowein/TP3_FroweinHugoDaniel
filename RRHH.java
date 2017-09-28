import java.util.*;
public class RRHH{
    public static void main(String [] args){
Calendar fecha = new GregorianCalendar(2007,1,1);
EmpleadoConJefe gerente = new EmpleadoConJefe(2738316293L,"Frowein", "Hugo Daniel", 9856.5, fecha);
gerente.mostrar();
}
}