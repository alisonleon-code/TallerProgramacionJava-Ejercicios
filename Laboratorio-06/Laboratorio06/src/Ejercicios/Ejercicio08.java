
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio08 {

    public static void main(String[] args) {

        double temp, suma = 0, mayor = 0, menor = 100;
        int i = 1, c = 0;

        Scanner scan = new Scanner(System.in);

        while (i <= 30) {

            System.out.print("Temperatura del día " + i + ": ");
            temp = scan.nextDouble();

            suma = suma + temp;

            // MÉTODO SUPUESTO FALSO (MÁXIMO) 
            if (temp > mayor) {
                mayor = temp;
            }

            // MÉTODO SUPUESTO FALSO (MÍNIMO) 
            if (temp < menor) {
                menor = temp;
            }

            if (temp > 28)
                c++;

            i++;
        }

        System.out.print("Temperatura máxima: " + mayor + "\n");
        System.out.print("Temperatura mínima: " + menor + "\n");
        System.out.print("Días > 28°C: " + c + "\n");
        System.out.print("Promedio: " + (suma / 30) + "\n");
    }
}