package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Michel Market");

        // Crear proveedores
        Proveedor proveedor1 = new Proveedor("Maicol", "223134");
        Proveedor proveedor2 = new Proveedor("Esteban", "41214114");
        Proveedor proveedor3 = new Proveedor("Sergio", "24432432");
        Proveedor proveedor4 = new Proveedor("Laura", "55443322");
        Proveedor proveedor5 = new Proveedor("Carlos", "123456789");

        // Crear productos
        LocalDate fechaVencimiento1 = LocalDate.of(2022, 9, 3);
        LocalDate fechaVencimiento2 = LocalDate.of(2024, 12, 3);
        LocalDate fechaVencimiento3 = LocalDate.of(2025, 5, 10);
        LocalDate fechaVencimiento4 = LocalDate.of(2023, 8, 15);

        Envasado envasado1 = new Envasado("213424123", "Carne", 12.000, proveedor1, fechaVencimiento1, 2.5, Pais.ARGENTINA);
        Envasado envasado2 = new Envasado("5637432", "Arroz", 3.800, proveedor2, fechaVencimiento2, 1.0, Pais.CHILE);
        Refigerado refrigerado1 = new Refigerado("324123", "Helado", 3.500, proveedor3, "39423924", 32.0);
        Refigerado refrigerado2 = new Refigerado("912374", "Yogur", 4.200, proveedor4, "92837462", 10.0);
        Perecedero perecedero1 = new Perecedero("42134", "Pescado", 20.000, proveedor3, fechaVencimiento3);
        Perecedero perecedero2 = new Perecedero("783920", "Manzanas", 5.000, proveedor5, fechaVencimiento4);
        
        // Agregar productos y proveedores a la empresa
        empresa.agregarProducto(envasado1);
        empresa.agregarProducto(envasado2);
        empresa.agregarProducto(refrigerado1);
        empresa.agregarProducto(refrigerado2);
        empresa.agregarProducto(perecedero1);
        empresa.agregarProducto(perecedero2);

        empresa.agregarProveedor(proveedor1);
        empresa.agregarProveedor(proveedor2);
        empresa.agregarProveedor(proveedor3);
        empresa.agregarProveedor(proveedor4);
        empresa.agregarProveedor(proveedor5);

        // Mostrar información completa de la empresa
        System.out.println(empresa.toString());
    }
}
