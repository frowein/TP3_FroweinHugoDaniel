
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLab(p_lab);
    }
    
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(0.0);
        this.setExistMinima(0);
        this.setLab(p_lab);
    }
    
    //Inicio de los mutadores
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    
    private void setLab(Laboratorio p_lab){
        this.laboratorio = p_lab;
    }
    
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    //Fin de los mutadores
    
    //Inicio de los observadores
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getRubro(){
        return this.rubro;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public double getCosto(){
        return this.costo;
    }
    
    public double getporcPtoRepo(){
        return this.porcPtoRepo;
    }
    
    public int getExistMinima(){
        return this.existMinima;
    }
    
    public Laboratorio getLab(){
        return this.laboratorio;
    }
    
    public int getStock(){
        return this.stock;
    }
    //Fin de los observadores
    
	/**
	*El metodo mostrar imprime por pantalla los datos de rubro, descripcion, precio y costo.
	*/
    public void mostrar(){
        this.getLab().mostrar();
        System.out.println("\nRubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDescripcion());
        System.out.println("Precio Costo: " + this.precioContado());
        System.out.println("Stock: " + this.getStock() + " - Stock Valorizado: " + this.stockValorizado());
    }
    
	/**
	*el metodo ajuste permite cambiar el valor del atributo stock
	*@param p_cantidad dato de tipo int
	*/
    public void ajuste(int p_cantidad){
        this.setStock(p_cantidad);
    }
    
	/**
	*El metodo stockValorizado retorna el valor de todo el stock mas un 12%
	*@return el valor de todo el stock
	*/
    public double stockValorizado(){
        return (this.getCosto() + ((12 * this.getCosto())/100)) * this.getStock();
    }
    
	/**
	*El metodo precio de lista retorna el costo mas un 12%
	*@return el costo mas un 12%
	*/
    public double precioLista(){
        return this.getCosto() + ((12 * this.getCosto())/100);
    }
    
	/**
	*El metodo precio contado retorna el costo mas un 5%
	*@return el costo mas un 5%
	*/
    public double precioContado(){
        return this.precioLista() - ((5 * this.precioLista()) /100);
    }
    
	/**
	*El metodo mostrarlinea retorna un dato de tipo String con la descripcion, precioLista y precioContado.
	*@return un dato de tipo String
	*/
    public String mostrarLinea(){
        return this.getDescripcion() + "\t" + this.precioLista() + " " + this.precioContado();
    }
    
	/**
	*El metodo ajustarPtoRepo permite ajustar el atributo porcPtoRepo
	*@param p_porce dato de tipo double
	*/
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    
	/**
	*El metodo ajustarExistMin permite ajustar el atibuto existMinima
	*@param p_cantidad dato de tipo int
	*/
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
}