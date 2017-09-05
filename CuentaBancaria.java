public class CuentaBancaria{
	private int nroCuenta;
	private double saldo;
	private Persona titular;
	
	public CuentaBancaria(int p_nroCuenta, Persona p_titular){
	this.setNroCuenta(p_nroCuenta);
	this.setTitular(p_titular);
	this.setSaldo(0.0);
	}
	
	public CuentaBancaria(int p_nroCuenta, Persona p_titular,double p_saldo){
	this.setNroCuenta(p_nroCuenta);
	this.setTitular(p_titular);
	this.setSaldo(p_saldo);
	}
	
	public double depositar(double p_importe){
	this.setSaldo(this.getSaldo() + p_importe);
	return this.getSaldo();
	}
	
	public double extraer(double p_importe){
	this.setSaldo(this.getSaldo() - p_importe);
	return this.getSaldo();
	}
	
	public void mostrar(" - Cuenta Bancaria - "){
	System.out.println("Titular: " + this.getTitular().getNombre() + "(" + this.getTitular().edad() + " años)");
	System.out.println("Saldo: " + this.getSaldo());
	}
	
	public String toStrinf(){
	return this.getNumero() + "\t" + this.getTitular().getNombre() + "\t" + this.getSaldo();
	}
}