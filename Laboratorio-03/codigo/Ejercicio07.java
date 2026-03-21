
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio07 {
    public static void main(String[] args) {

        double impuesto, descuento = 0;
        int ton;
        char zona;

        Scanner scan = new Scanner(System.in);

        System.out.println("Impuesto:");
        impuesto = scan.nextDouble();

        System.out.println("Toneladas:");
        ton = scan.nextInt();

        System.out.println("Zona rural (S/N):");
        zona = scan.next().charAt(0);

        if (ton <= 18) {
            descuento = impuesto * 0.08;
        } else if (ton <= 35) {
            descuento = impuesto * 0.10;
        } else {
            descuento = impuesto * 0.12;
        }

        if (zona == 'S' || zona == 's') {
            descuento = descuento + (impuesto * 0.03);
        }

        System.out.println("Final: " + (impuesto - descuento));
    }
}