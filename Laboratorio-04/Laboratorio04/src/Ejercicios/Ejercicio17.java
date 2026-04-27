
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio17 {

    public static void main(String[] args) {

        double pago = 0, extra = 0, total;
        int plan;
        char seguro;

        Scanner scan = new Scanner(System.in);

        System.out.print("Plan [1]Basico [2]Familiar [3]Premium: ");
        plan = scan.nextInt();

        System.out.print("Seguro (S/N): ");
        seguro = scan.next().charAt(0);

        switch (plan) {
            case 1: pago = 1000; break;
            case 2: pago = 1600; break;
            case 3: pago = 2500; break;
        }

        if (seguro == 'S' || seguro == 's') {
            extra = pago * 0.04;
        }

        total = pago + extra;

        System.out.print("Pago adicional: " + extra + "\n");
        System.out.print("Total: " + total + "\n");
    }
}