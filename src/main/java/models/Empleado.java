package models;

public class Empleado extends Usuario {
	
	 private String legajoEmpleado;

	public Empleado() {
		super();
		
	}

	public Empleado(int idUsuario, String claveUsuario, String nombreUsuario, String apellidoUsuario,
			String rolUsuario) {
		super(idUsuario, claveUsuario, nombreUsuario, apellidoUsuario, rolUsuario);
		
		this.legajoEmpleado= legajoEmpleado;
		
	}

	public String getLegajoEmpleado() {
		return legajoEmpleado;
	}

	public void setLegajoEmpleado(String legajoEmpleado) {
		this.legajoEmpleado = legajoEmpleado;
	}	

}
