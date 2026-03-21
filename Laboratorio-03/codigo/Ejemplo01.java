package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */

public class Ejemplo01 {
    public static void main(String[] args) {

        // Declaración de variables
        char cat;
        double sa, inc = 0, sn;
        int canth, aum, bd = 0; // bd = bandera de error

        Scanner scan = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Indique la categoría del empleado [A] o [B]:");
        cat = scan.next().charAt(0);

        System.out.println("Ingrese su sueldo actual:");
        sa = scan.nextDouble();

        System.out.println("Ingrese su número de hijos:");
        canth = scan.nextInt();

        // Proceso: cálculo del incremento según categoría
        if (cat == 'A' || cat == 'a') {
            inc = sa * 0.15;
        } else if (cat == 'B' || cat == 'b') {
            inc = sa * 0.10;
        } else {
            System.out.println("Error: categoría inválida");
            bd = 1;
        }

        //aumento adicional por hijos
        if (canth > 2) {
            aum = 160;
        } else {
            aum = 0;
        }

        // Cálculo del sueldo neto
        sn = sa + inc + aum;

        // Salida
        if (bd == 0) {
            System.out.println("Incremento: " + inc);
            System.out.println("Aumento adicional: " + aum);
            System.out.println("Sueldo neto: " + sn + " soles");
        }

    }
}