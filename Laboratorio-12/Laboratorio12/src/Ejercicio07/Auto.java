package ejercicio07;

public class Auto {
    double precioVenta = 15000;
    double igv = 0.19;    
    double seguro = 0.08; 
    double montoIGV, montoSeguro, precioFinal;

    public void calcularPrecioFinal() {
        montoIGV = precioVenta * igv;
        montoSeguro = precioVenta * seguro;
        precioFinal = precioVenta + montoIGV + montoSeguro;

        System.out.println("Precio de venta base: $ " + precioVenta);
        System.out.println("Impuesto IGV (19%): $ " + montoIGV);
        System.out.println("Impuesto Seguro (8%): $ " + montoSeguro);
        System.out.println("MONTO FINAL A PAGAR: $ " + precioFinal);
    }
}