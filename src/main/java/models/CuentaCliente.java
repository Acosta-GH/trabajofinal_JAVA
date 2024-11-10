package models;

public class CuentaCliente {
	
    private String nroCtaCliente;
    private double saldoCtaCliente;
    
    
	public CuentaCliente() {
		super();
	}


	public CuentaCliente(Cliente cliente, double saldoCuenta) {
		this.nroCtaCliente = cliente.getDniCliente();
		this.saldoCtaCliente = saldoCuenta;
	}
    
    
	public String getNroCuenta() {
		return nroCtaCliente;
	}

	public double getSaldoCuenta() {
		return saldoCtaCliente;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCtaCliente = saldoCuenta;
	}

}	

   
    
    




