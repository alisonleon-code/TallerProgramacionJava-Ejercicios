
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio12 {
    public static void main(String[] args) {

        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lado 1:");
        a = scan.nextInt();

        System.out.println("Lado 2:");
        b = scan.nextInt();

        System.out.println("Lado 3:");
        c = scan.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilatero");
        } else {
            if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Escaleno");
            }
        }
    }
}