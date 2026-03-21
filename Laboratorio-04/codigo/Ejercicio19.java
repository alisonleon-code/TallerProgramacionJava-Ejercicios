
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        double precio = 0, des = 0, total;
        int tipo, temp, cant;

        Scanner scan = new Scanner(System.in);

        System.out.print("Tipo [1]Deportivo [2]Casual [3]Elegante: ");
        tipo = scan.nextInt();

        System.out.print("Temporada [1]Invierno [2]Verano: ");
        temp = scan.nextInt();

        System.out.print("Cantidad: ");
        cant = scan.nextInt();

        switch (tipo) {
            case 1:
                precio = 50;
                if (temp == 1) des = 0.03;
                else des = 0.01;
                break;
            case 2:
                precio = 60;
                if (temp == 1) des = 0.05;
                else des = 0.02;
                break;
            case 3:
                precio = 70;
                if (temp == 1) des = 0.07;
                else des = 0.03;
                break;
        }

        double compra = precio * cant;
        double descuento = compra * des;
        total = compra - descuento;

        System.out.print("Descuento: " + descuento + "\n");
        System.out.print("Total: " + total + "\n");
    }
}