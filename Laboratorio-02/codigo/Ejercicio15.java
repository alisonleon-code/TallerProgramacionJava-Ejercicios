
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mb, gb, kb, bytes;

        System.out.print("Ingrese en Megabytes: ");
        mb = scan.nextDouble();

        gb = mb / 1024;
        kb = mb * 1024;
        bytes = kb * 1024;

        System.out.println("Gigabytes: " + gb);
        System.out.println("Kilobytes: " + kb);
        System.out.println("Bytes: " + bytes);
    }
}
