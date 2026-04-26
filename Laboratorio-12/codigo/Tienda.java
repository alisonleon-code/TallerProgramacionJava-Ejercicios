package ejercicio06;

public class Tienda {
    double montoCompra = 3457;
    double porcentajeDescuento = 0.11;
    double descuento, totalPagar;

    public void calcularVenta() {
        descuento = montoCompra * porcentajeDescuento;
        totalPagar = montoCompra - descuento;

        System.out.println("Monto de la compra: S/ " + montoCompra);
        System.out.println("Descuento aplicado (11%): S/ " + descuento);
        System.out.println("Monto total a pagar: S/ " + totalPagar);

    }
}