
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio04 {
    public static void main(String[] args) {

        double alquiler;
        int piso;
        char cochera;

        Scanner scan = new Scanner(System.in);

        System.out.println("Alquiler:");
        alquiler = scan.nextDouble();

        System.out.println("Piso:");
        piso = scan.nextInt();

        System.out.println("Cochera (S/N):");
        cochera = scan.next().charAt(0);

        if (piso >= 3 && piso <= 8) {
            alquiler = alquiler + 100;
        }

        if (cochera == 'S' || cochera == 's') {
            alquiler = alquiler + 45;
        }

        System.out.println("Total: " + alquiler);
    }
}