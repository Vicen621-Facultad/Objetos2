package io.github.vicen621;

import java.util.List;

public class Pago {
    private List<Producto> productos;
    private String tipo;
    private static final double ADICIONAL_TARJETA = 1000.0;
    private static final double DESCUENTO_EFECTIVO = 2000.0;

    public Pago(String tipo, List<Producto> productos) {
        this.productos = productos;
        this.tipo = tipo;
    }

    public double calcularMontoFinal() {
        double total = 0.0;
        // if statement -> form template method
        if (this.tipo == "EFECTIVO") {
            total = this.productos.stream().mapToDouble(Producto::getPrecioConIVA).sum();

            if (total > 1_000_000) {
                total = total - DESCUENTO_EFECTIVO;
            }
        } else if (this.tipo == "TARJETA") {
            total = this.productos.stream().mapToDouble(Producto::getPrecioConIVA).sum();

            total = total + ADICIONAL_TARJETA;
        }
        return total;
    }

}
