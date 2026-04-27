
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio03 {
    public static void main(String[] args) {

        double pension, descuento = 0, total;
        int promedio;
        char elenco;

        Scanner scan = new Scanner(System.in);

        System.out.println("Pension:");
        pension = scan.nextDouble();

        System.out.println("Promedio:");
        promedio = scan.nextInt();

        System.out.println("Elenco (S/N):");
        elenco = scan.next().charAt(0);

        if (promedio >= 16 && promedio <= 20) {
            descuento = pension * 0.20;
        }

        if (elenco == 'S' || elenco == 's') {
            descuento = descuento + (pension * 0.05);
        }

        total = pension - descuento;

        System.out.println("Total: " + total);
    }
}
