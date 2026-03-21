
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */

public class Ejercicio09 {

    public static void main(String[] args) {

        double precio = 0, total, des = 0;
        int dia, cant;

        Scanner scan = new Scanner(System.in);

        System.out.print("Día [1]Viernes [2]Sabado [3]Domingo: ");
        dia = scan.nextInt();

        System.out.print("Cantidad de entradas: ");
        cant = scan.nextInt();

        switch (dia) {
            case 1: precio = 23.5; break;
            case 2: precio = 33.5; break;
            case 3: precio = 38.5; break;
            default: System.out.print("Día incorrecto\n");
        }

        total = precio * cant;

        if (cant >= 15) {
            des = total * 0.02;
        }

        System.out.print("Descuento: " + des + "\n");
        System.out.print("Total: " + (total - des) + "\n");
    }
}