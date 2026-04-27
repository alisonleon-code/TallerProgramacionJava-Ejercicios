
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio14 {
    public static void main(String[] args) {

        double precio = 0, descuento, total;
        int cantidad;
        char tipo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Tipo (D=Deportivo, C=Casual, E=Elegante):");
        tipo = scan.next().charAt(0);

        System.out.println("Cantidad:");
        cantidad = scan.nextInt();

        if (tipo == 'D' || tipo == 'd') {
            precio = 50;
        } else {
            if (tipo == 'C' || tipo == 'c') {
                precio = 60;
            } else {
                precio = 70;
            }
        }

        double compra = precio * cantidad;

        if (cantidad <= 10) {
            descuento = compra * 0.03;
        } else {
            if (cantidad <= 16) {
                descuento = compra * 0.05;
            } else {
                descuento = compra * 0.07;
            }
        }

        total = compra - descuento;

        System.out.println("Total: " + total);
    }
}