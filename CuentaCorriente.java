public class CuentaCorriente{
	private int nroCuenta;
	private double saldo;
	private double limiteDescubierto;
	private Persona titular;
	
	public CuentaCorriente(int p_nroCuenta, Persona p_titular){
	this.setNroCuenta(p_nroCuenta);
	this.setTitular(p_titular);
	this.setSaldo(0.0);
	this.setLimiteDescubierto(500);
	}
	
	public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
	this.setNroCuenta(p_nroCuenta);
	this.setTitular(p_titular);
	this.setSaldo(p_saldo);
	this.setLimiteDescubierto(500);
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
	
	public double getLimiteDescubierto(){
	return this.limiteDescubierto;
	}
	
	private void setLimiteDescubierto(int p_limite){
	this.limiteDescubierto = p_limite;
	}
	
	private boolean puedeExtraer(double p_importe){
	if(this.getLimiteDescubierto() + p_importe < this.getSaldo()){
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
	}else{
	System.out.println("El importe de extraccion sobrepasa el limite Descubierto!");
	}
	}
	
	public void depositar(double p_importe){
	this.setSaldo(this.getSaldo() + p_importe);
	}
	
	public void mostrar(){
	System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
	System.out.println("Titular: " + this.getTitular().nomYApe());
	System.out.println("Descubierto: " + this.getLimiteDescubierto());
	}	
}