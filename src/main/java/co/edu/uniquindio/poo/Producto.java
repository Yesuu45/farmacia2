package co.edu.uniquindio.poo;

public abstract class Producto {
    public String codigo;
    public String nombre;
    public double precio;
    public Proveedor proveedor;



    public Producto(String codigo, String nombre, double precio, Proveedor proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return " Codigo " + codigo + " , " + nombre + " precio " + precio + "  proveedor " + proveedor + " \n ";
    }

    public abstract double calcularPreciOVenta();

    public abstract double calcularImpuestoVenta();

    



}
