
package Ejercicios;

/**
 *
 * @author AlisonLeon
 */

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        int cond, nota, preg = 1;
        int ci = 0, ct = 0;
        int cap = 0, cdp = 0;
        double sap = 0, sdp = 0;

        Scanner scan = new Scanner(System.in);

        while (preg == 1) {

            System.out.print("Condición [1]Ingresante [2]Traslado: ");
            cond = scan.nextInt();

            System.out.print("Nota: ");
            nota = scan.nextInt();

            if (cond == 1)
                ci++;
            else if (cond == 2)
                ct++;

            if (nota >= 14) {
                sap = sap + nota;
                cap++;
            } else {
                sdp = sdp + nota;
                cdp++;
            }

            System.out.print("¿Desea registrar otro alumno? [1]Si[2]No: ");
            preg = scan.nextInt();
        }

        System.out.print("Ingresantes: " + ci + "\n");
        System.out.print("Traslados: " + ct + "\n");

        if (cap > 0)
            System.out.print("Promedio aprobados: " + (sap / cap) + "\n");

        if (cdp > 0)
            System.out.print("Promedio desaprobados: " + (sdp / cdp) + "\n");
    }
}