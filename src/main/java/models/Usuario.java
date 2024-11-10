package models;

public class Usuario {
	
    private int idUsuario;
    private String claveUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String rolUsuario;
	

    
    public Usuario(int idUsuario, String claveUsuario, String nombreUsuario, String apellidoUsuario,
			String rolUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.claveUsuario = claveUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.rolUsuario = rolUsuario;
	}
       
	public Usuario() {
		super();
	}


	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getClaveUsuario() {
		return claveUsuario;
	}
	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}
	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}
	public String getRolUsuario() {
		return rolUsuario;
	}
	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", claveUsuario=" + claveUsuario + ", nombreUsuario=" + nombreUsuario
				+ ", apellidoUsuario=" + apellidoUsuario + ", rolUsuario=" + rolUsuario + "]";
	}
    
    
}
