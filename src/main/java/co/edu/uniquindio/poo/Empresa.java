package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private LinkedList <Producto> productos;
    private LinkedList <Proveedor>proveedores;
    
 

    public Empresa(String nombre) {
        this.nombre = nombre;
        productos= new LinkedList<>();
        proveedores = new LinkedList<>();
    }


    public LinkedList<Producto> getProductos() {
        return productos;
    }


    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }


    public LinkedList<Proveedor> getProveedores() {
        return proveedores;
    }


    public void setProveedores(LinkedList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void agregarProveedor(Proveedor proveedor){
        proveedores.add(proveedor);
    }	

    
    @Override
    public String toString() {
        return  nombre + "  productos " + productos + " proveedores " + proveedores +"\n";
    }

    

    
}
