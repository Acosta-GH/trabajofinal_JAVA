package gestores;

import java.util.ArrayList;
import java.util.List;

import models.CuentaCliente;

public class GestorCuestaCliente {

	private List<CuentaCliente> cuentas;

	public GestorCuestaCliente() {

		this.cuentas = new ArrayList<CuentaCliente>();
	}

	public void agregaCuenta(CuentaCliente nCuenta) {

		boolean existeCta = cuentas.stream().anyMatch(p -> p.getNroCuenta().equals(nCuenta.getNroCuenta()));
		if (existeCta)
			return;
		cuentas.add(nCuenta);
	}

	public List<CuentaCliente> obtenerCuentas() {
		return new ArrayList<>(cuentas);
	}
	
	public CuentaCliente buscarCuenta (String nroCuenta) {
		return cuentas.stream()
				.filter(ct -> ct.getNroCuenta().equals(nroCuenta))
				.findFirst()
				.orElse(null);
	}
	
	/**
	 * 
	 * @param nroCuenta que pertenece al cliente
	 * @param monto total del dinero a depositar
	 */
	
	public void sumaDineroEnCuenta(String nroCuenta, double monto) {
		
		CuentaCliente cuenta = buscarCuenta(nroCuenta);
		if (cuenta != null) 
		cuenta.setSaldoCuenta(cuenta.getSaldoCuenta() + monto);
	}
	/**
	 * 
	 * @param nroCuenta que pertenece al cliente
	 * @param monto monto en el cual se reducira el saldo de la cuenta
	 */
	
	public void restaDineroEnCuenta(String nroCuenta, double monto) {
		CuentaCliente cuenta = buscarCuenta(nroCuenta);
		
		if (cuenta !=null && cuenta.getSaldoCuenta()>= monto) {
			cuenta.setSaldoCuenta(cuenta.getSaldoCuenta() - monto);
		} else {
			System.out.println("Dinero insuficiente para realizar la operacion.");
		}
	}
		/**
		 * @param nroCuentaDestino nro de cuenta del destinatario.
		 * @param nroCuenta nro de cuenta origen
		 * @param monto monto a transferir
		 */
	public void  trasferirDinero (String nroCuentaDestino, String nroCuenta, double monto) {
		CuentaCliente cuentaDestino = buscarCuenta(nroCuentaDestino);
		CuentaCliente cuentaOrigen = buscarCuenta(nroCuenta);
		
		if (cuentaDestino != null && cuentaOrigen.getSaldoCuenta()>=monto ) {
			restaDineroEnCuenta(nroCuenta, monto);
			sumaDineroEnCuenta(nroCuentaDestino, monto);
			
		} else {
			
			System.out.println("No se pudo realizar la transaccion.");
			
		}
	}

}
