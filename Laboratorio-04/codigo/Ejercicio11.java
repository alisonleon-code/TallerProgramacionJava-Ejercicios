
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        double monto, interes = 0, total;
        int meses;
        boolean bd = true;

        Scanner scan = new Scanner(System.in);

        System.out.print("Monto: ");
        monto = scan.nextDouble();

        System.out.print("Meses [6,12,18]: ");
        meses = scan.nextInt();

        switch (meses) {
            case 6: interes = monto * 0.03; break;
            case 12: interes = monto * 0.05; break;
            case 18: interes = monto * 0.07; break;
            default:
                System.out.print("Dato incorrecto\n");
                bd = false;
        }

        total = monto + interes;

        if (bd == true) {
            System.out.print("Interés: " + interes + "\n");
            System.out.print("Total: " + total + "\n");
        }
    }
}