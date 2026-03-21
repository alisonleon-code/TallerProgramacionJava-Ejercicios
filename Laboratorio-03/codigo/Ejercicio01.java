
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        char cat;
        double sa, inc = 0, sn;
        int hijos, aum, bd = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Categoría (A/B):");
        cat = scan.next().charAt(0);

        System.out.println("Sueldo actual:");
        sa = scan.nextDouble();

        System.out.println("Número de hijos:");
        hijos = scan.nextInt();

        if (cat == 'A' || cat == 'a') {
            inc = sa * 0.15;
        } else if (cat == 'B' || cat == 'b') {
            inc = sa * 0.10;
        } else {
            System.out.println("Error en categoría");
            bd = 1;
        }

        if (hijos > 2) {
            aum = 160;
        } else {
            aum = 0;
        }

        sn = sa + inc + aum;

        if (bd == 0) {
            System.out.println("Sueldo neto: " + sn);
        }
    }
}