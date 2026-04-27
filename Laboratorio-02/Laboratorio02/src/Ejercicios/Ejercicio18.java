
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;

        System.out.print("Numero: ");
        num = scan.nextDouble();

        System.out.println("Numero redondeado: " + Math.round(num));// Imprime el valor de num redondeado 
    }
}