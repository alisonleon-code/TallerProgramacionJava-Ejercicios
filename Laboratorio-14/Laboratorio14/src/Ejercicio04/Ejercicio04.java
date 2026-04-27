/**
 *
 * @author AlisonLeon
 */
package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        int con,est;
        double sueldo,bono,sf;

        Scanner scan=new Scanner(System.in);

        System.out.print("[1]Trimestral [2]Semestral [3]Anual: ");
        con=scan.nextInt();

        System.out.print("[1]Soltero [2]Casado: ");
        est=scan.nextInt();

        Trabajador t=new Trabajador();

        t.setCon(con);
        t.setEst(est);

        sueldo=t.calcularSueldo();
        bono=t.calcularBonificacion();
        sf=t.calcularSueldoFinal(sueldo,bono);

        t.mostrarResultados(sueldo,bono,sf);

    }

}