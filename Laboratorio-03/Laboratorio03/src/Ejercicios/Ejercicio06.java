
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio06 {
    public static void main(String[] args) {

        double pago;
        int personas;
        char seguro;

        Scanner scan = new Scanner(System.in);

        System.out.println("Pago mensual:");
        pago = scan.nextDouble();

        System.out.println("Personas:");
        personas = scan.nextInt();

        System.out.println("Seguro adicional (S/N):");
        seguro = scan.next().charAt(0);

        if (seguro == 'S' || seguro == 's') {
            pago = pago + 80;
        }

        if (personas > 3) {
            pago = pago + (pago * 0.01 * (personas - 3));
        }

        System.out.println("Pago anual: " + (pago * 12));
    }
}