/**
 *
 * @author AlisonLeon
 */
package Ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        int dia,cant;
        double pago,des,total;

        Scanner scan=new Scanner(System.in);

        System.out.print("Dia función [1]Viernes [2]Sabado [3]Domingo: ");
        dia=scan.nextInt();

        System.out.print("Cantidad entradas: ");
        cant=scan.nextInt();

        Teatro t=new Teatro();

        pago=t.calcularPago(dia,cant);

        des=t.calcularDescuento(cant,pago);

        total=t.calcularTotal(pago,des);

        t.mostrarResultados(pago,des,total);

    }

}