
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio09 {

    public static void main(String[] args) {

        double tiempo, suma = 0;
        int c = 0, c1 = 0, c2 = 0, preg = 1;

        Scanner scan = new Scanner(System.in);

        while (preg == 1) {

            System.out.print("Tiempo (min): ");
            tiempo = scan.nextDouble();

            suma = suma + tiempo;
            c++;

            if (tiempo < 25)
                c1++;

            if (tiempo > 40)
                c2++;

            System.out.print("¿Continuar? [1]Si[2]No: ");
            preg = scan.nextInt();
        }

        if (c > 0) {
            System.out.print("Promedio: " + (suma / c) + "\n");
        }

        System.out.print("Menos de 25 min: " + c1 + "\n");
        System.out.print("Más de 40 min: " + c2 + "\n");
    }
}