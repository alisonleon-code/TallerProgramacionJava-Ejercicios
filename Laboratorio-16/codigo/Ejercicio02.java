/**
 *
 * @author AlisonLeon
 */
package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        String nom;
        double peso,talla,sueldo;

        Scanner scan=new Scanner(System.in);

        System.out.print("Ingresar nombre del empleado: ");
        nom=scan.next();

        System.out.print("Ingresar peso: ");
        peso=scan.nextDouble();

        System.out.print("Ingresar talla: ");
        talla=scan.nextDouble();

        System.out.print("Ingresar sueldo: ");
        sueldo=scan.nextDouble();

        Empleado e=new Empleado();

        e.boletaEmpleado(nom);
        e.boletaEmpleado(peso,talla);
        e.boletaEmpleado(sueldo);

    }

}