
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio10 {
    public static void main(String[] args) {

        double monto, interes = 0, total;
        int meses;
        char moneda;

        Scanner scan = new Scanner(System.in);

        System.out.println("Monto:");
        monto = scan.nextDouble();

        System.out.println("Meses:");
        meses = scan.nextInt();

        System.out.println("Moneda (D=dolares, S=soles):");
        moneda = scan.next().charAt(0);

        if (meses <= 12) {
            interes = monto * 0.03;
        } else {
            if (meses <= 24) {
                interes = monto * 0.05;
            } else {
                interes = monto * 0.07;
            }
        }

        if (moneda == 'D' || moneda == 'd') {
            interes = interes + (monto * 0.02);
        } else {
            interes = interes + (monto * 0.04);
        }

        total = monto + interes;

        System.out.println("Total: " + total);
    }
}
