package Ejercicios;

/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {

        double montoCompra, descuento = 0.0, montoConDescuento, impuesto = 0.0, montoFinal;
        String rubro;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra (S/.): ");
        montoCompra = sc.nextDouble();
  
        System.out.print("Ingrese el rubro de la compra (Comestibles/Artefactos): ");
        rubro = sc.next().toLowerCase(); 

        if (montoCompra >= 100 && montoCompra <= 250) {
            descuento = 3; // 3% de descuento
        } else if (montoCompra >= 251 && montoCompra <= 500) {
            descuento = 5; // 5% de descuento
        } else if (montoCompra > 500) {
            descuento = 10; // 10% de descuento
        }

        // Calcular el monto con descuento
        montoConDescuento = montoCompra - (montoCompra * descuento / 100);

        // Usar switch para manejar el rubro y aplicar el impuesto correspondiente
        switch (rubro) {
            case "comestibles":
                impuesto = 15; // 15% de impuesto para comestibles
                break;
            case "artefactos":
                impuesto = 30; // 30% de impuesto para artefactos
                break;
            default:
                System.out.println("Rubro no válido.");
                return;
        }

        // Calcular el monto final después de aplicar el impuesto
        montoFinal = montoConDescuento + (montoConDescuento * impuesto / 100);

        // Mostrar el resultado
        System.out.println("Monto de la compra: S/." + montoCompra);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Monto con descuento: S/." + montoConDescuento);
        System.out.println("Impuesto aplicado: " + impuesto + "%");
        System.out.println("Monto final a pagar: S/." + montoFinal);
    }
}
