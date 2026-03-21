
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        int edad, preg = 1;
        char grado;
        int cp = 0, cs = 0, cr = 0, total = 0;
        double suma = 0, mayor = 0;

        Scanner scan = new Scanner(System.in);

        while (preg == 1) {

            System.out.print("Edad: ");
            edad = scan.nextInt();

            System.out.print("Grado [P]Primaria [S]Secundaria [R]Superior: ");
            grado = scan.next().charAt(0);

            suma = suma + edad;
            total++;

            // ******** MÉTODO SUPUESTO FALSO (MAYOR EDAD) ********
            if (edad > mayor) {
                mayor = edad;
            }

            if (grado == 'P' || grado == 'p')
                cp++;
            else if (grado == 'S' || grado == 's')
                cs++;
            else if (grado == 'R' || grado == 'r')
                cr++;

            System.out.print("¿Continuar? [1]Si[2]No: ");
            preg = scan.nextInt();
        }

        System.out.print("Promedio edades: " + (suma / total) + "\n");
        System.out.print("Mayor edad: " + mayor + "\n");

        System.out.print("Primaria: " + (cp * 100.0 / total) + "%\n");
        System.out.print("Secundaria: " + (cs * 100.0 / total) + "%\n");
        System.out.print("Superior: " + (cr * 100.0 / total) + "%\n");
    }
}