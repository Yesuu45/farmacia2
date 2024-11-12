package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Perecedero extends Producto {
        private LocalDate fechaVencimiento;

  


    public Perecedero(String codigo, String nombre, double precio, Proveedor proveedor,
            LocalDate fechaVencimiento) {
            super(codigo, nombre, precio, proveedor);
            this.fechaVencimiento = fechaVencimiento;
        }



    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }



    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }



    @Override
    public double calcularImpuestoVenta() {
        double tasaImpuesto = 0.08; // 8% de impuesto para productos perecederos
        double impuesto = this.getPrecio() * tasaImpuesto;
        
        // Lógica para reducir el impuesto si está cerca de vencer
        if (fechaVencimiento.isBefore(LocalDate.now().plusDays(3))) {
            impuesto *= 0.5; // Reducir el impuesto al 50% si faltan pocos días para vencer
        }
        
        return impuesto;
    }
    
    @Override
    public double calcularPreciOVenta() {
        double utilidad = this.getPrecio() * 0.35; // 35% de utilidad sobre el precio de compra
        double precioBase = this.getPrecio() + utilidad;
        double impuesto = calcularImpuestoVenta(); // Calcular el impuesto utilizando el método
        
        double precioVenta = precioBase + impuesto; // Precio de venta con utilidad e impuesto
        return precioVenta;
    }



    @Override
    public String toString() {
        return " Perecedero " + super.toString() + " , Fecha de Vencimiento: " + fechaVencimiento + " \n ";
    } 

    
    
    
    

    
}
