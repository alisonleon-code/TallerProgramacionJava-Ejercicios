/**
 *
 * @author AlisonLeon
 */
package Ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        int talla,cant;
        double compra,des,pf;

        Scanner scan=new Scanner(System.in);

        System.out.print("Talla [1]Small [2]Medium [3]Large: ");
        talla=scan.nextInt();

        System.out.print("Cantidad de prendas: ");
        cant=scan.nextInt();

        Pantalon p=new Pantalon();

        p.setTalla(talla);
        p.setCant(cant);

        compra=p.calcularCompra();
        des=p.calcularDescuento(compra);
        pf=p.calcularPagoFinal(compra,des);

        p.mostrarResultados(compra,des,pf);

    }

}