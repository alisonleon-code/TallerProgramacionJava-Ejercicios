
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        int edad, preg = 1;
        double peso;
        double sp1 = 0, sp2 = 0;
        int c1 = 0, c2 = 0;

        Scanner scan = new Scanner(System.in);

        while (preg == 1) {

            System.out.print("Edad: ");
            edad = scan.nextInt();

            System.out.print("Peso: ");
            peso = scan.nextDouble();

            if (edad < 18) {
                sp1 = sp1 + peso;
                c1++;
            } else {
                sp2 = sp2 + peso;
                c2++;
            }

            System.out.print("¿Continuar? [1]Si[2]No: ");
            preg = scan.nextInt();
        }

        if (c1 > 0)
            System.out.print("Promedio menores: " + (sp1 / c1) + "\n");

        if (c2 > 0)
            System.out.print("Promedio mayores: " + (sp2 / c2) + "\n");
    }
}