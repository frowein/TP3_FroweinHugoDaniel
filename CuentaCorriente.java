public class CuentaCorriente{
	private int nroCuenta;
	private double saldo;
	private double limiteDescubierto;
	private Persona titular;
	
	public CuentaCorriente(int p_nroCuenta, Persona p_titular){
	this.setNroCuenta(p_nroCuenta);
	this.setTitular(p_titular);
	this.setSaldo(0.0);
	this.setLimiteDescubierto(500.0);
	}
	
	public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
	this.setNroCuenta(p_nroCuenta);
	this.setTitular(p_titular);
	this.setSaldo(p_saldo);
	this.setLimiteDescubierto(500.0);
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
	
	public int getLimiteDescubierto(){
	return this.limiteDescubierto;
	}
	
	private void setLimiteDescubierto(int p_limite){
	this.limiteDescubierto = p_limite;
	}
	
	private boolean puedeExtraer(double p_importe){
	if(this.getLimiteDescubierto() > 0){
	if(p_importe < this.getSaldo()){
	return true;
	}else{
	return false;
	}
	else{
	return false;
	}
	}
	
	public void extraccion(double p_importe){
	this.setSaldo(this.getSaldo() - p_importe);
	}
	
	public void extraer(double p_importe){
	if(puedeExtraer){
	this.extraccion(p_importe);
	this.setLimiteDescubierto(this.getLimiteDescubierto() - 1);
	}else{
		if(this.getLimiteDescubierto > 0){
		System.out.println("No puede extraer mas que el saldo!");
		}else{
		System.out.println("No tiene habilitado mas extracciones!");
		}
	}
	}
	
	public void depositar(double p_importe){
	this.setSaldo(this.getSaldo() + p_importe);
	}
	
	public void moostrar(){
	System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
	System.out.println("Titular: " + this.getTitular().nomYApe());
	System.out.println("Extracciones posibles: " + this.getLimiteDescubierto());
	}
	
}