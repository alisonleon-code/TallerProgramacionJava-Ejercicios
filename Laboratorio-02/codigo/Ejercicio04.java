
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hombres, mujeres, total;
        double porhombres, pormujeres ;

        System.out.print("Cantidad de hombres: ");
        hombres = scan.nextInt();

        System.out.print("Cantidad de mujeres: ");
        mujeres = scan.nextInt();

        total = hombres + mujeres;

        porhombres = (hombres * 100.0) / total;
        pormujeres = (mujeres * 100.0) / total;

        System.out.println("Porcentaje hombres: " + porhombres + "%");
        System.out.println("Porcentaje mujeres: " + pormujeres  + "%");
    }    
}
