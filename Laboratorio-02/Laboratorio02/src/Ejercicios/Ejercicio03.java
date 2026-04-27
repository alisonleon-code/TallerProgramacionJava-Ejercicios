
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1, n2, n3, promedio;

        System.out.print("Nota 1: ");
        n1 = scan.nextDouble();

        System.out.print("Nota 2: ");
        n2 = scan.nextDouble();

        System.out.print("Nota 3: ");
        n3 = scan.nextDouble();

        promedio = (n1 + n2 + (n3 * 2)) / 4;

        System.out.println("Promedio: " + promedio);
    }
}
