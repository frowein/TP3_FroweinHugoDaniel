public class RegistroCivil{
	public static void main(String [] args){
	Hombre el = new Hombre("Juan", "Perez", 29);
	Mujer ella = new Mujer("Maria", "Gomez", 28);
	el.mostrarEstadoCivil();
	ella.mostrarEstadoCivil();
	el.casarseCon(ella);
	el.casadoCon();
	ella.casadaCon();
	ella.divorcio();
	el.mostrarEstadoCivil();
	ella.mostrarEstadoCivil();
	ella.casarseCon(el);
	el.casadoCon();
	ella.casadaCon();
	el.mostrarEstadoCivil();
	ella.mostrarEstadoCivil();
	el.divorcio();
	el.mostrarEstadoCivil();
	ella.mostrarEstadoCivil();
	}
}