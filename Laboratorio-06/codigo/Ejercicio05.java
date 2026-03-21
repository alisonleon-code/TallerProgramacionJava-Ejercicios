
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */

public class Ejercicio05 {

    public static void main(String[] args) {

        String nom, mayorNom = null, menorNom = null;
        double nota, mayor = 0, menor = 21;
        int preg = 1;

        Scanner scan = new Scanner(System.in);

        while (preg == 1) {

            System.out.print("Apellido: ");
            nom = scan.next();

            System.out.print("Nota: ");
            nota = scan.nextDouble();

            // MÉTODO SUPUESTO FALSO (MAYOR) 
            if (nota > mayor) {
                mayor = nota;
                mayorNom = nom;
            }

            //  MÉTODO SUPUESTO FALSO (MENOR) 
            if (nota < menor) {
                menor = nota;
                menorNom = nom;
            }

            System.out.print("¿Continuar? [1]Si[2]No: ");
            preg = scan.nextInt();
        }

        System.out.print("Mayor nota: " + mayor + " Alumno: " + mayorNom + "\n");
        System.out.print("Menor nota: " + menor + " Alumno: " + menorNom + "\n");
    }
}