package gestores;

import java.util.ArrayList;
import java.util.List;

import models.Producto;

public class GestorProducto {

	// Reglas del singleton
	// 1- Constructor private 
	// 2- Que tenga un atributo estatico que haga referencia a la clase 
	// 3- metodo para obtener la instancia. GetInstance() 
		
	private static GestorProducto singleton; // Atributo singleton
	
	public static GestorProducto getInstance() { //metodo para obtener la instancia. GetInstance() 
		 if (singleton == null) {
			singleton = new GestorProducto();
		}
		return singleton;
	}
	
	
	private List<Producto> productos;  
	
	private GestorProducto () { // constructor private
		
		this.productos = new ArrayList<Producto>();
	}


	public void agregarProducto(Producto nProducto) {
		
		/*if (!nProducto.getCodProducto().matches("[A-Z]+")) {
			System.out.println("El codigo solo debe contener caracters en mayuscula, por ejemplo ABC123");
			return;
		}*/

		boolean existeProd = productos.stream().anyMatch(p -> p.getCodProducto().equals(nProducto.getCodProducto()));

		if (existeProd)
			return;
		
		productos.add(nProducto);
		
		System.out.println("Alta producto exitosa!!!");

	}
	
	public List<Producto> obtenerListaProductos(){
		return new ArrayList<>(productos);
	}
	
	/**
	 * 
	 * @param codigo codigo del producto a buscar
	 * @return 
	 */
	public Producto buscaProductoPorCod(String codigo) {
		
		return productos.stream()
						.filter(p -> p.getCodProducto().equals(codigo))
						.findFirst()
						.orElse(null);
	}
	
public void darIngresoAlStock(String codigo , int cantidad) {
		
		Producto prod = buscaProductoPorCod(codigo);
		if (prod != null) {
			prod.setStockProducto(prod.getStockProducto()+cantidad);
		}
	}
	
	public void darBajaAlStock(String codigo , int cantidad) {
		
		Producto prod = buscaProductoPorCod(codigo);
		if (prod != null && prod.getStockProducto()>= cantidad ) {
			prod.setStockProducto(prod.getStockProducto()-cantidad);
		} else {
			System.out.println("El stock no es suficiente.");
		}
	}
}
