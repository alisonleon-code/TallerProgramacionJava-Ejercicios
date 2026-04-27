
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        double monto, interes = 0, cuota;
        int tarjeta, cuotas;
        boolean bd = true;

        Scanner scan = new Scanner(System.in);

        System.out.print("Monto: ");
        monto = scan.nextDouble();

        System.out.print("Cuotas (max 8): ");
        cuotas = scan.nextInt();

        System.out.print("Tarjeta [1]Visa [2]Premium [3]Electron: ");
        tarjeta = scan.nextInt();

        if (cuotas > 8) {
            System.out.print("No permitido\n");
            bd = false;
        }

        switch (tarjeta) {
            case 1: interes = 0.05; break;
            case 2: interes = 0.03; break;
            case 3: interes = 0.01; break;
        }

        if (bd == true) {
            cuota = (monto + (monto * interes)) / cuotas;
            System.out.print("Cuota: " + cuota + "\n");
        }
    }
}