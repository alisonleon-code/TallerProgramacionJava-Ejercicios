
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio05{

    public static void main(String[] args) {
        // variables
        double precioUnidad, totalCompra = 0, totalDescuento = 0,descuentoPorSabor = 0,montoBruto;
        int cantidad;
        char sabor;
        boolean valido = true;

        // Entrada de datos
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio por unidad del helado: ");
        precioUnidad = scan.nextDouble();

        System.out.print("Ingrese el sabor del helado (F : Fresa, L : Lúcuma, C :Chocolate): ");
        sabor = scan.next().charAt(0);

        System.out.print("Ingrese la cantidad de helados: ");
        cantidad = scan.nextInt();

        // descuento 
        switch(sabor) {
            case 'F': descuentoPorSabor = 0.01;break;
            case 'L':descuentoPorSabor = 0.03;break;
            case 'C': descuentoPorSabor = 0.05; break;
            default:
                System.out.println("Sabor inválido.");
                valido = false;
                break;
        }

        // Cálculo si los datos son válidos
        if (valido) {
            montoBruto = precioUnidad * cantidad;
            totalDescuento = montoBruto * descuentoPorSabor;

            // Aplicar descuento adicional si corresponde
            if (cantidad > 10) {
                totalDescuento = totalDescuento + 5; // Evitando el uso de +=
            }

            totalCompra = montoBruto - totalDescuento;

            // Mostrar resultados
            System.out.println("Descuento total aplicado: " + totalDescuento + " soles");
            System.out.println("Monto total a pagar: " + totalCompra + " soles");
        }

    }
}
