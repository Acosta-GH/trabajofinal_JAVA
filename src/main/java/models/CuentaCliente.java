package models;

public class CuentaCliente {
	
    private String nroCtaCliente;
    private double saldoCtaCliente;
    
    
	public CuentaCliente() {
		super();
	}


	public CuentaCliente(String nroCuenta, double saldoCuenta) {
		this.nroCtaCliente = nroCuenta;
		this.saldoCtaCliente = saldoCuenta;
	}
    
    
	public String getNroCuenta() {
		return nroCtaCliente;
	}
	public void setNroCuenta(String nroCuenta) {
		this.nroCtaCliente = nroCuenta;
	}
	public double getSaldoCuenta() {
		return saldoCtaCliente;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCtaCliente = saldoCuenta;
	}
	
	
}	

   
    
    




