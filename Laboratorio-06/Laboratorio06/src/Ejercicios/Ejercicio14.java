
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        int tipoAlg, tipoPren, cant;
        int preg = 1, preg2;
        double precio = 0, pb = 0, igv, totalGeneral = 0;

        Scanner scan = new Scanner(System.in);

        while (preg == 1) {

            pb = 0;

            System.out.print("¿Desea comprar un tipo de polo? [1]Si[2]No: ");
            preg2 = scan.nextInt();

            while (preg2 == 1) {

                System.out.print("Algodón [1]Tanguis [2]Pima: ");
                tipoAlg = scan.nextInt();

                System.out.print("Prenda [1]Formal [2]Deportiva: ");
                tipoPren = scan.nextInt();

                System.out.print("Cantidad: ");
                cant = scan.nextInt();

                if (tipoAlg == 1 && tipoPren == 1)
                    precio = 32;
                else if (tipoAlg == 1 && tipoPren == 2)
                    precio = 42;
                else if (tipoAlg == 2 && tipoPren == 1)
                    precio = 52;
                else
                    precio = 62;

                pb = pb + (precio * cant);

                System.out.print("¿Desea comprar otro tipo? [1]Si[2]No: ");
                preg2 = scan.nextInt();
            }

            igv = pb * 0.19;

            System.out.print("Pago bruto: " + pb + "\n");
            System.out.print("IGV: " + igv + "\n");
            System.out.print("Pago final: " + (pb + igv) + "\n");

            totalGeneral = totalGeneral + (pb + igv);

            System.out.print("¿Registrar otro cliente? [1]Si[2]No: ");
            preg = scan.nextInt();
        }

        System.out.print("Total recaudado: " + totalGeneral + "\n");
    }
}