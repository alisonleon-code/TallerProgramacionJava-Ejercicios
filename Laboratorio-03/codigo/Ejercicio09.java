
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio09 {
    public static void main(String[] args) {

        double costo, inc = 0, desc = 0, total;
        int piso;
        char tipo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Costo:");
        costo = scan.nextDouble();

        System.out.println("Piso:");
        piso = scan.nextInt();

        System.out.println("Tipo (B=Basico):");
        tipo = scan.next().charAt(0);

        if (piso >= 2 && piso <= 5) {
            inc = costo * 0.03;
        } else {
            if (piso <= 8) {
                inc = costo * 0.05;
            } else {
                inc = costo * 0.07;
            }
        }

        total = costo + inc;

        if (tipo == 'B' || tipo == 'b') {
            desc = total * 0.02;
        }

        total = total - desc;

        System.out.println("Total: " + total);
    }
}
