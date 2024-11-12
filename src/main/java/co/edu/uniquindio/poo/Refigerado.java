package co.edu.uniquindio.poo;

public class Refigerado extends Producto implements IRefigerado  {
    private String codigoAprobacion;
    private double temperatura;



    public Refigerado(String codigo, String nombre, double precio, Proveedor proveedor, String codigoAprobacion,
         double temperatura) {
        super(codigo, nombre, precio, proveedor);
        this.codigoAprobacion = codigoAprobacion;
        this.temperatura = temperatura;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Refrigerado" + super.toString() + ", Temperatura: " + temperatura + "°C, Código Aprobación: " + codigoAprobacion + " , " + refrigerar();
    }

    @Override
    public String refrigerar() {
        return "Activando sistema de refrigeración ";
    }

    @Override
    public double calcularImpuestoVenta() {
        double tasaImpuesto = 0.05; // 5% de impuesto para productos refrigerados
        return this.getPrecio() * tasaImpuesto;
    }

    @Override
    public double calcularPreciOVenta() {
        double utilidad = 500 * temperatura; // $500 de utilidad por grado de refrigeración
        double precioBase = this.getPrecio() + utilidad;
        double impuesto = calcularImpuestoVenta(); // Calcular el impuesto con el método

        double precioVenta = precioBase + impuesto; // Precio de venta con utilidad e impuesto
        return precioVenta;
    }

    

}
