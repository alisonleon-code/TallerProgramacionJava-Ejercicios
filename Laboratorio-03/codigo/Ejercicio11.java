
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio11 {
    public static void main(String[] args) {

        double pago, inc = 0, total;
        int edad;
        char servicio;

        Scanner scan = new Scanner(System.in);

        System.out.println("Pago:");
        pago = scan.nextDouble();

        System.out.println("Edad:");
        edad = scan.nextInt();

        System.out.println("Servicio (C=Comidas, S=Sauna, H=Hospedaje):");
        servicio = scan.next().charAt(0);

        if (servicio == 'C' || servicio == 'c') {
            inc = pago * 0.05;
        } else {
            if (servicio == 'S' || servicio == 's') {
                inc = pago * 0.07;
            } else {
                inc = pago * 0.09;
            }
        }

        total = pago + inc;

        if (edad > 60) {
            total = total - (total * 0.02);
        }

        System.out.println("Total: " + total);
    }
}
