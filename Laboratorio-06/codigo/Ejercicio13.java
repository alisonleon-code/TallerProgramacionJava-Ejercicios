
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        int tipo, cant, preg = 1;
        double precio = 0, pb, des, pn;
        double totalDesc = 0, totalVentas = 0;

        Scanner scan = new Scanner(System.in);

        while (preg == 1) {

            System.out.print("Tipo [1]Clasico [2]Mixto [3]Especial: ");
            tipo = scan.nextInt();

            System.out.print("Cantidad: ");
            cant = scan.nextInt();

            if (tipo == 1) {
                precio = 4.5;
                des = cant * precio * 0.02;
            } else if (tipo == 2) {
                precio = 8.5;
                des = cant * precio * 0.04;
            } else {
                precio = 12.5;
                des = cant * precio * 0.06;
            }

            pb = cant * precio;
            pn = pb - des;

            System.out.print("Descuento: " + des + "\n");
            System.out.print("Pago final: " + pn + "\n");

            totalDesc = totalDesc + des;
            totalVentas = totalVentas + pn;

            System.out.print("¿Continuar? [1]Si[2]No: ");
            preg = scan.nextInt();
        }

        System.out.print("Total descuentos: " + totalDesc + "\n");
        System.out.print("Total ventas: " + totalVentas + "\n");
    }
}