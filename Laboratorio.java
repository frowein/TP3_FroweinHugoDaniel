/**
 * Ejercicio 2
 * 
 * @author Frowein Hugo Daniel
 */
public class Laboratorio{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
    * El constructor recibe 5 datos por parametro para despues utilizar los mutadores
    * para asignar a los atributos.
    * 
    * @param p_nombre nombre del laboratorio de tipo String
    * @param p_domicilio direccion del laboratorio de tipo String
    * @param p_telefono telefono de tipo String
    * @param p_compraMin numero de compra minima de tipo int
    * @param p_diaEnt numero de dia de entrega de tipo int
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(p_compraMin);
        this.setDiaEnt(p_diaEnt);
    }


    /**
    * El constructor sobrecargado recibe 3 datos por parametro para despues utilizar los mutadores
    * para asignar a los atributos y a los demas atributos asigana un valor para que no de error.
    * 
    * @param p_nombre nombre del laboratorio de tipo String
    * @param p_domicilio direccion del laboratorio de tipo String
    * @param p_telefono telefono de tipo String
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(0);
        this.setDiaEnt(0);
    }

    //Inicio de los mutadores
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }

    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }

    private void setCompraMin(int p_compraMin){
        this.compraMinima = p_compraMin;
    }

    private void setDiaEnt(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    //Fin de los mutadores
    
    //Inicio de los observadores
    public String getNombre(){
        return this.nombre;
    }

    public String getDomicilio(){
        return this.domicilio;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public int getCompraMin(){
        return this.compraMinima;
    }

    public int getDiaEnt(){
        return this.diaEntrega;
    }
    //Fin de los observadores
    
    /**
     * El metodo ajuste compra minima se utilisa para asignar los valores
     * de los atributos que no se pudieron asiganar en el contructor sobrecargado.
     * 
     * @param p_compraMin numero de compra minima de tipo int
     */
    public void ajusteCompraMinima(int p_compraMin){
        this.setCompraMin(p_compraMin);
    }

    /**
     * El metodo ajuste dia entrega se utilisa para asignar los valores
     * de los atributos que no se pudieron asiganar en el contructor sobrecargado.
     * 
     * @param p_diaEnt numero de dia de entrega de tipo int
     */
    public void ajusteDiaEntrega(int p_diaEnt){
        this.setDiaEnt(p_diaEnt);
    }
    
    /**
     * El metodo mostrar imprime los valores de nomrbre, domicilio y telefono.
     */
    public void mostrar(){
        System.out.println("Laboratorio: " + this.getNombre());
        System.out.println("Domicilio: " + this.getDomicilio() + " - Telefono: " + this.getTelefono());
    }
}