/**
 *
 * @author AlisonLeon
 */
package Ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        int cat,prod,cant;
        double pb,bon,pt;

        Scanner scan=new Scanner(System.in);

        System.out.print("Categoria [1]A [2]B [3]C: ");
        cat=scan.nextInt();

        System.out.print("Producto [1]Tejas [2]Losetas: ");
        prod=scan.nextInt();

        System.out.print("Unidades producidas: ");
        cant=scan.nextInt();

        Obrero o=new Obrero();

        o.setCat(cat);
        o.setProd(prod);
        o.setCant(cant);

        pb=o.calcularPagoBase();
        bon=o.calcularBonificacion(pb);
        pt=o.calcularPagoTotal(pb,bon);

        o.mostrarResultados(pb,bon,pt);

    }

}