
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio05 {
    public static void main(String[] args) {

        int horas, años, hijos;
        double sueldo, gratificacion = 0, total;

        Scanner scan = new Scanner(System.in);

        System.out.println("Horas:");
        horas = scan.nextInt();

        System.out.println("Años:");
        años = scan.nextInt();

        System.out.println("Hijos:");
        hijos = scan.nextInt();

        sueldo = horas * 30;

        if (años >= 5 && años <= 20) {
            gratificacion = sueldo * 0.40;
        } else {
            if (años > 20) {
                gratificacion = sueldo * 0.50;
            }
        }

        if (hijos > 0) {
            total = sueldo + gratificacion + 250;
        } else {
            total = sueldo + gratificacion;
        }

        System.out.println("Total: " + total);
    }
}
