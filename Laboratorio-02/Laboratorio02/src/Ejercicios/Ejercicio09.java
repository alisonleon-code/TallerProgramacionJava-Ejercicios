
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num, rc;

        System.out.print("Ingrese Numero : ");
        num = scan.nextDouble();

        rc = Math.cbrt(num);// Calcula la raíz cúbica de num 

        System.out.println("Raiz cubica: " + rc);
    }
}