package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Proveedor {
        private String nombre;
    private String id;
    private LinkedList<Producto> productos;

    public Proveedor(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        productos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    @Override
    public String toString() {
        return "Proveedor nombre " + nombre + ", id " + id + ", productos " + productos +" \n ";
    }

    

    
}
