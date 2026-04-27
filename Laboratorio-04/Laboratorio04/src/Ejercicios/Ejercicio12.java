
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        double kilos, tarifa = 0, total;
        int destino, modalidad;
        boolean bd = true;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kilos: ");
        kilos = scan.nextDouble();

        System.out.print("Destino [1]Tarapoto [2]Jaen [3]Chachapoyas: ");
        destino = scan.nextInt();

        System.out.print("Modalidad [1]A [2]B [3]C: ");
        modalidad = scan.nextInt();

        switch (destino) {
            case 1: tarifa = 15; break;
            case 2: tarifa = 20; break;
            case 3: tarifa = 10; break;
            default: bd = false;
        }

        total = tarifa * kilos;

        switch (modalidad) {
            case 1: break;
            case 2: total = total + (total * 0.25); break;
            case 3: total = total + (total * 0.45); break;
            default: bd = false;
        }

        if (bd == true) {
            System.out.print("Total: " + total + "\n");
        } else {
            System.out.print("Datos incorrectos\n");
        }
    }
}