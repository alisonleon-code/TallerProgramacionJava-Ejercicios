
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio13 {
    public static void main(String[] args) {

        double costo, impuesto = 0, total;
        int años;
        char marca;

        Scanner scan = new Scanner(System.in);

        System.out.println("Costo:");
        costo = scan.nextDouble();

        System.out.println("Años:");
        años = scan.nextInt();

        System.out.println("Marca (N=Nissan):");
        marca = scan.next().charAt(0);

        if (años >= 5 && años <= 9) {
            impuesto = costo * 0.02;
        } else {
            if (años <= 15) {
                impuesto = costo * 0.04;
            } else {
                impuesto = costo * 0.06;
            }
        }

        total = costo + impuesto;

        if (marca == 'N' || marca == 'n') {
            total = total - 200;
        }

        System.out.println("Total: " + total);
    }
}