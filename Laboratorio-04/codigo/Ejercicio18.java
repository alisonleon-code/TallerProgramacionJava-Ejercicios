
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio18 {

    public static void main(String[] args) {

        double precio = 0, des = 0, total;
        int destino, cant;

        Scanner scan = new Scanner(System.in);

        System.out.print("Destino [1]Arequipa [2]Moquegua [3]Tacna: ");
        destino = scan.nextInt();

        System.out.print("Cantidad: ");
        cant = scan.nextInt();

        switch (destino) {
            case 1:
                precio = 84;
                if (cant >= 4 && cant <= 10) des = 0.10;
                else if (cant > 10) des = 0.15;
                break;
            case 2:
                precio = 96;
                if (cant >= 4 && cant <= 10) des = 0.15;
                else if (cant > 10) des = 0.20;
                break;
            case 3:
                precio = 125;
                if (cant >= 4 && cant <= 10) des = 0.20;
                else if (cant > 10) des = 0.25;
                break;
        }

        double compra = precio * cant;
        double descuento = compra * des;
        total = compra - descuento;

        System.out.print("Descuento: " + descuento + "\n");
        System.out.print("Total: " + total + "\n");
    }
}
