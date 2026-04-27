/**
 *
 * @author AlisonLeon
 */
package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        String nom;
        int anios;
        double sueldo;

        Scanner scan=new Scanner(System.in);

        System.out.print("Ingresar nombre del obrero: ");
        nom=scan.next();

        System.out.print("Ingresar años de servicio: ");
        anios=scan.nextInt();

        System.out.print("Ingresar sueldo: ");
        sueldo=scan.nextDouble();

        Obrero o=new Obrero();

        o.datosObrero(nom);
        o.datosObrero(anios);
        o.datosObrero(sueldo);

    }

}