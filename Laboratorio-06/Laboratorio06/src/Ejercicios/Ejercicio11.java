
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        int tipo, cant, preg = 1;
        String nom, ape;
        double pb, igv, pn, total = 0;

        Scanner scan = new Scanner(System.in);

        while (preg == 1) {

            System.out.print("Nombre: ");
            nom = scan.next();

            System.out.print("Apellido: ");
            ape = scan.next();

            System.out.print("Tipo [1]Futbol [2]Basquet [3]Urbanas: ");
            tipo = scan.nextInt();

            System.out.print("Cantidad: ");
            cant = scan.nextInt();

            if (tipo == 1)
                pb = cant * 250;
            else if (tipo == 2)
                pb = cant * 180;
            else
                pb = cant * 130;

            igv = pb * 0.19;
            pn = pb + igv;

            System.out.print("****FACTURA****\n");
            System.out.print("Cliente: " + nom + " " + ape + "\n");
            System.out.print("Pago bruto: " + pb + "\n");
            System.out.print("IGV: " + igv + "\n");
            System.out.print("Pago neto: " + pn + "\n");

            total = total + pn;

            System.out.print("¿Continuar? [1]Si[2]No: ");
            preg = scan.nextInt();
        }

        System.out.print("Total recaudado: " + total + "\n");
    }
}