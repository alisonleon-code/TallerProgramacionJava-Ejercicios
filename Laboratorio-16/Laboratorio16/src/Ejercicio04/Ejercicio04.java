/**
 *
 * @author AlisonLeon
 */
package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        String nom;
        int min;
        char zona;
        double pago,total;

        Scanner scan=new Scanner(System.in);

        System.out.print("Ingresar nombre del cliente: ");
        nom=scan.next();

        System.out.print("Ingresar minutos consumidos: ");
        min=scan.nextInt();

        System.out.print("Zona [A/B/C]: ");
        zona=scan.next().charAt(0);

        Cliente c=new Cliente();

        c.calcularTarifa(nom);

        pago=c.calcularTarifa(min);

        total=c.calcularTarifa(pago,zona);

        c.calcularTarifa(total);

    }

}