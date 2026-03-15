
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double galones, litros, m3, pie3;

        System.out.print("Galones: ");
        galones = scan.nextDouble();

        litros = galones * 3.79;
        m3 = litros / 1000;
        pie3 = m3 / 0.0283;

        System.out.println("Litros: " + litros);
        System.out.println("Metros cubicos: " + m3);
        System.out.println("Pies cubicos: " + pie3);
    }
}