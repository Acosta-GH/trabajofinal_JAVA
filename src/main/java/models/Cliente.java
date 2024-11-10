package models;

public class Cliente extends Usuario {

	private String dniCliente;

	public Cliente() {
		super();
		
	}

	public Cliente(int idUsuario, String claveUsuario, String nombreUsuario, String apellidoUsuario, String rolUsuario) {
			
		super(idUsuario, claveUsuario, nombreUsuario, apellidoUsuario, rolUsuario);
				this.dniCliente = dniCliente;
		
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	
}
