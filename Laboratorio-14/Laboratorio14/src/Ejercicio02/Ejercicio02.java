/**
 *
 * @author AlisonLeon
 */
package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        int des,cant;
        double pi,desc,total;

        Scanner scan=new Scanner(System.in);

        System.out.print("[1]Francia [2]Italia [3]Grecia: ");
        des=scan.nextInt();

        System.out.print("Ingresar cantidad de pasajes: ");
        cant=scan.nextInt();

        Pasaje p=new Pasaje();

        p.setDes(des);
        p.setCant(cant);

        pi=p.calcularPrecioInicial();
        desc=p.calcularDescuento(pi);
        total=p.calcularTotal(pi,desc);

        p.mostrarResultados(pi,desc,total);

    }

}