/**
 *
 * @author AlisonLeon
 */
package Ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        int tipo,veces;
        double pago,inc,extra,total;

        Scanner scan=new Scanner(System.in);

        System.out.print("[1]Individual [2]Grupal [3]Aventura: ");
        tipo=scan.nextInt();

        System.out.print("Pago mensual: ");
        pago=scan.nextDouble();

        System.out.print("Veces por semana: ");
        veces=scan.nextInt();

        Deporte d=new Deporte();

        inc=d.calcularIncremento(tipo,pago);

        extra=d.incrementoExtra(veces,pago);

        total=d.calcularPagoTotal(pago,inc,extra);

        d.mostrarResultados(inc,extra,total);

    }

}