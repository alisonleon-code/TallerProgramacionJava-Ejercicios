
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio08 {
    public static void main(String[] args) {

        double monto, descuento = 0, total;
        int cant;
        char tipo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Monto:");
        monto = scan.nextDouble();

        System.out.println("Cantidad:");
        cant = scan.nextInt();

        System.out.println("Tipo (C=Clasico, M=Mezclado, S=Supremo):");
        tipo = scan.next().charAt(0);

        if (tipo == 'C' || tipo == 'c') {
            descuento = monto * 0.02;
        } else {
            if (tipo == 'M' || tipo == 'm') {
                descuento = monto * 0.03;
            } else {
                descuento = monto * 0.04;
            }
        }

        if (cant > 5) {
            descuento = descuento + ((monto - descuento) * 0.01);
        }

        total = monto - descuento;

        System.out.println("Total: " + total);
    }
}