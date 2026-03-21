
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        double pago, inc = 0, total;
        int tipo, veces;

        Scanner scan = new Scanner(System.in);

        System.out.print("Pago mensual: ");
        pago = scan.nextDouble();

        System.out.print("Tipo [1]Individual [2]Grupal [3]Aventura: ");
        tipo = scan.nextInt();

        System.out.print("Veces por semana: ");
        veces = scan.nextInt();

        switch (tipo) {
            case 1: inc = pago * 0.02; break;
            case 2: inc = pago * 0.03; break;
            case 3: inc = pago * 0.05; break;
        }

        if (veces > 3) {
            inc = inc + (pago * 0.01);
        }

        total = pago + inc;

        System.out.print("Incremento: " + inc + "\n");
        System.out.print("Total: " + total + "\n");
    }
}