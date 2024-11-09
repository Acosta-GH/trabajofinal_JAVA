package models;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagen;  

    public Producto(int id, String nombre, String descripcion, double precio, String imagen) { 
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen; 
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() { 
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getImagen() { 
        return imagen;  
    }
}
