
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */

public class Ejercicio08 {

    public static void main(String[] args) {

        double costo, des = 0, total;
        int vehiculo;
        char cliente;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese costo de reparación: ");
        costo = scan.nextDouble();

        System.out.print("Tipo [1]Moto [2]Auto [3]Camion: ");
        vehiculo = scan.nextInt();

        System.out.print("Cliente antiguo (S/N): ");
        cliente = scan.next().charAt(0);

        switch (vehiculo) {
            case 1: des = 10; break;
            case 2: des = 20; break;
            case 3: des = 30; break;
            default: System.out.print("Opción incorrecta\n");
        }

        if (cliente == 'S' || cliente == 's') {
            des = des + 15;
        }

        total = costo - des;

        System.out.print("Total a pagar: " + total + "\n");
    }
}