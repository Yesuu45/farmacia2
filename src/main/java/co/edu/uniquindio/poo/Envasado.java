package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Envasado extends Producto {
    private LocalDate fechaEnvasado;
    private double peso;
    private Pais pais;

 

    public Envasado(String codigo, String nombre, double precio, Proveedor proveedor, LocalDate fechaEnvasado,
            double peso, Pais pais) {
        super(codigo, nombre, precio, proveedor);
        this.fechaEnvasado = fechaEnvasado;
        this.peso = peso;
        this.pais = pais;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }


    @Override
    public double calcularImpuestoVenta() {
        double tasaImpuesto = 0.1; // 5% de impuesto para productos refrigerados
        return this.getPrecio() * tasaImpuesto;
    }

    @Override
    public double calcularPreciOVenta() {
        double utilidad = 300 * peso; // $500 de utilidad por grado de refrigeración
        double precioBase = this.getPrecio() + utilidad;
        double impuesto = calcularImpuestoVenta(); // Calcular el impuesto con el método

        double precioVenta = precioBase + impuesto; // Precio de venta con utilidad e impuesto
        return precioVenta;
    }

    @Override
    public String toString() {
        return " Envasado  " + super.toString() + ", Fecha de Envasado: " + fechaEnvasado + ", Peso: " + peso + " kg, País: " + pais +" Precio de venta "+ calcularPreciOVenta() + "impuestp" +calcularImpuestoVenta()+ "\n";
    }


    
}
