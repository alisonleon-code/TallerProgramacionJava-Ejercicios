
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, primero, ultimo, suma;

        System.out.print("Ingrese un número de 5 cifras: ");
        num = scan.nextInt();

        primero = num / 10000;
        ultimo = num % 10;

        suma = primero + ultimo;

        System.out.println("Suma: " + suma);
    }
}
