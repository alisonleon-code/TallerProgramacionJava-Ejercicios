
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double produccion, asia, europa, latam, africa;

        System.out.print("Produccion total: ");
        produccion = scan.nextDouble();

        asia = produccion* 0.35;
        europa = produccion * 0.27;
        latam = produccion * 0.19;
        africa = produccion - (asia + europa + latam);

        System.out.println("Asia: " + asia);
        System.out.println("Europa: " + europa);
        System.out.println("America Latina: " + latam);
        System.out.println("Africa: " + africa);
    }
}