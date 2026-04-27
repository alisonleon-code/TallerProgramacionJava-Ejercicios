/**
 *
 * @author AlisonLeon
 */
package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        String nom;
        int p1,p2;
        double ep,ef;

        Scanner scan=new Scanner(System.in);

        System.out.print("Ingresar nombre del alumno: ");
        nom=scan.next();

        System.out.print("Ingresar práctica 1: ");
        p1=scan.nextInt();

        System.out.print("Ingresar práctica 2: ");
        p2=scan.nextInt();

        System.out.print("Ingresar examen parcial: ");
        ep=scan.nextDouble();

        System.out.print("Ingresar examen final: ");
        ef=scan.nextDouble();

        Alumno a=new Alumno();

        a.obtenerPosibilidades(nom);
        a.obtenerPosibilidades(p1,p2);
        a.obtenerPosibilidades(ep,ef);

    }

}