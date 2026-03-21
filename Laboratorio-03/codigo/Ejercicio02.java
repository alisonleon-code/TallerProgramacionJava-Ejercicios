
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {

        double costo, impuesto = 0, descuento = 0, total;
        char marca;

        Scanner scan = new Scanner(System.in);

        System.out.println("Costo:");
        costo = scan.nextDouble();

        System.out.println("Marca (T para Toyota):");
        marca = scan.next().charAt(0);

        if (costo >= 5000) {
            impuesto = costo * 0.08;
        }

        if (marca == 'T' || marca == 't') {
            descuento = costo * 0.06;
        }

        total = costo + impuesto - descuento;

        System.out.println("Total: " + total);
    }
}
