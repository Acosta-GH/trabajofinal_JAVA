package models;

public class Prenda {

	private long id;
	private String codigo;
	private double metrosTela;
	private TipoTela tela;

	public Prenda() {
		super();
	}

	public Prenda(long id, String codigo, double metrosTela, TipoTela tela) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.metrosTela = metrosTela;
		this.tela = tela;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getMetrosTela() {
		return metrosTela;
	}

	public void setMetrosTela(double metrosTela) {
		this.metrosTela = metrosTela;
	}

	public TipoTela getTela() {
		return tela;
	}

	public void setTela(TipoTela tela) {
		this.tela = tela;
	}
	
	public double getPrecio() {
		return this.tela.getPrecioPorMetro() 
				* this.metrosTela * 1.2 ;
	}

	@Override
	public String toString() {
		return "Prenda [id=" + id + ", codigo=" + codigo + ", metrosTela=" + metrosTela + ", tela=" + tela + "]";
	}
	
	

}
