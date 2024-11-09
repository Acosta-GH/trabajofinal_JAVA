package repos;

import java.util.ArrayList;
import java.util.List;

import models.Prenda;

public class PrendasRepo {
	
	
	//Atributo estatico llamado singleton
	private static PrendasRepo singleton;
	
	//Metodo getInstance
	public static PrendasRepo getInstance() {
		if(singleton == null) {
			singleton = new PrendasRepo();
		}
		return singleton;
	}
	
	
	
	private List<Prenda> prendas;
	
	private PrendasRepo() {
		this.prendas = new ArrayList<Prenda>();
	}

	public void add(Prenda nPrenda) {
		
		this.prendas.add(nPrenda);
		
	}
	
	public List<Prenda> getAll(){
		return prendas.stream().toList();
	}
	
	

}
