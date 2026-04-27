
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio07 {

    public static void main(String[] args) {

        double costo, imp = 0, total;
        int años, marca;
        boolean bd = true;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese costo del vehículo: ");
        costo = scan.nextDouble();

        System.out.print("Ingrese años de antigüedad (5,7,10): ");
        años = scan.nextInt();

        System.out.print("Seleccione marca [1]Nissan [2]Toyota [3]Otros: ");
        marca = scan.nextInt();

        switch (años) {
            case 5: imp = costo * 0.03; break;
            case 7: imp = costo * 0.05; break;
            case 10: imp = costo * 0.07; break;
            default:
                System.out.print("Dato incorrecto\n");
                bd = false;
        }

        total = costo + imp;

        switch (marca) {
            case 1: total = total - 200; break;
            case 2: total = total - 100; break;
            case 3: break;
            default:
                System.out.print("Marca incorrecta\n");
                bd = false;
        }

        if (bd == true) {
            System.out.print("Impuesto: " + imp + "\n");
            System.out.print("Total: " + total + "\n");
        }
    }
}