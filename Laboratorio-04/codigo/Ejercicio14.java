
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        double precio, des = 0, total;
        int algodon, prenda;

        Scanner scan = new Scanner(System.in);

        System.out.print("Precio: ");
        precio = scan.nextDouble();

        System.out.print("Algodon [1]Simple [2]Pima: ");
        algodon = scan.nextInt();

        System.out.print("Prenda [1]Formal [2]Deportiva: ");
        prenda = scan.nextInt();

        switch (algodon) {
            case 1:
                if (prenda == 1) des = precio * 0.15;
                else des = precio * 0.10;
                break;
            case 2:
                if (prenda == 1) des = precio * 0.10;
                else des = precio * 0.05;
                break;
        }

        total = precio - des;

        System.out.print("Total: " + total + "\n");
    }
}