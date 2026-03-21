
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        double pago = 0, total;
        int tipo;
        char medico;

        Scanner scan = new Scanner(System.in);

        System.out.print("Tipo [1]Accidentes [2]Salud [3]Discapacidad: ");
        tipo = scan.nextInt();

        System.out.print("Médico a domicilio (S/N): ");
        medico = scan.next().charAt(0);

        switch (tipo) {
            case 1: pago = 50; break;
            case 2: pago = 60; break;
            case 3: pago = 70; break;
        }

        if (medico == 'S' || medico == 's') {
            pago = pago + 10;
        }

        total = pago * 12;

        System.out.print("Pago anual: " + total + "\n");
    }
}