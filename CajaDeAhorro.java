public class CajaDeAhorro{
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
	/**
	
	*/
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
    this.setNroCuenta(p_nroCuenta);
    this.setTitular(p_titular);
    this.setSaldo(0.0);
    this.setExtraccionesPosibles(10);
    }
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
    this.setNroCuenta(p_nroCuenta);
    this.setTitular(p_titular);
    this.setSaldo(p_saldo);
    this.setExtraccionesPosibles(10);
    }
    
    public int getNroCuenta(){
    return this.nroCuenta;
    }
    
    private void setNroCuenta(int p_nroCuenta){
    this.nroCuenta = p_nroCuenta;
    }
    
    public double getSaldo(){
    return this.saldo;
    }
    
    private void setSaldo(double p_saldo){
    this.saldo = p_saldo;
    }
    
    public Persona getTitular(){
    return this.titular;
    }
    
    private void setTitular(Persona p_titular){
    this.titular = p_titular;
    }
    
    public int getExtraccionesPosibles(){
    return this.extraccionesPosibles;
    }
    
    private void setExtraccionesPosibles(int p_extecciones){
    this.extraccionesPosibles = p_extecciones;
    }
    
    private boolean puedeExtraer(double p_importe){
    if(this.getExtraccionesPosibles() > 0 && p_importe < this.getSaldo()){
    return true;
    }else{
    return false;
    }
    }
    
    public void extraccion(double p_importe){
    this.setSaldo(this.getSaldo() - p_importe);
    }
    
    public void extraer(double p_importe){
    if(puedeExtraer(p_importe)){
        this.extraccion(p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }else{
        if(this.getExtraccionesPosibles() > 0){
        System.out.println("No puede extraer mas que el saldo!");
        }else{
        System.out.println("No tiene habilitado mas extracciones!");
        }
    }
    }
    
    public void depositar(double p_importe){
    this.setSaldo(this.getSaldo() + p_importe);
    }
    
    public void mostrar(){
    System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
    System.out.println("Titular: " + this.getTitular().nomYApe());
    System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
    
}