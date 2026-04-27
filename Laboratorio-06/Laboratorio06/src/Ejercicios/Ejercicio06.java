
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */

public class Ejercicio06 {

    public static void main(String[] args) {

        int tipo, cs = 0, cs2 = 0;
        double peso, mayor = 0, sumaPapaya = 0;
        int cp = 0;
        int preg = 1;

        Scanner scan = new Scanner(System.in);

        while (preg == 1) {

            System.out.print("Tipo [1]Manzana [2]Papaya [3]Sandia: ");
            tipo = scan.nextInt();

            System.out.print("Peso: ");
            peso = scan.nextDouble();

            if (peso == 0)
                break;

            // MÉTODO SUPUESTO FALSO (MAYOR - MANZANA) 
            if (tipo == 1 && peso > mayor) {
                mayor = peso;
            }

            if (tipo == 2) {
                sumaPapaya = sumaPapaya + peso;
                cp++;
            }

            if (tipo == 3) {
                cs++;
                if (peso < 2.5)
                    cs2++;
            }

            System.out.print("¿Continuar? [1]Si[2]No: ");
            preg = scan.nextInt();
        }

        System.out.print("Mayor peso de manzana: " + mayor + "\n");

        if (cp > 0)
            System.out.print("Promedio papayas: " + (sumaPapaya / cp) + "\n");

        if (cs > 0)
            System.out.print("Porcentaje sandias <2.5kg: " + (cs2 * 100.0 / cs) + "%\n");
    }
}