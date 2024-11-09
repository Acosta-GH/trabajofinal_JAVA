package models;

public class TipoTela {
	private long id;
	private String nombre;
	private double precioPorMetro;

	public TipoTela() {
		super();
	}

	public TipoTela(long id, String nombre, double precioPorMetro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioPorMetro = precioPorMetro;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioPorMetro() {
		return precioPorMetro;
	}

	public void setPrecioPorMetro(double precioPorMetro) {
		this.precioPorMetro = precioPorMetro;
	}

}
