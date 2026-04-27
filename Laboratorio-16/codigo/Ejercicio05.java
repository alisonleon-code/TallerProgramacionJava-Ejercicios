/**
 *
 * @author AlisonLeon
 */
package Ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        int cod;
        String marca;
        double precio;
        char modelo,talla;

        Scanner scan=new Scanner(System.in);

        System.out.print("Ingresar código: ");
        cod=scan.nextInt();

        System.out.print("Ingresar marca: ");
        marca=scan.next();

        System.out.print("Ingresar precio: ");
        precio=scan.nextDouble();

        System.out.print("Modelo [A/B]: ");
        modelo=scan.next().charAt(0);

        System.out.print("Talla [S/L]: ");
        talla=scan.next().charAt(0);

        Producto p=new Producto();

        p.detallesPago(cod);
        p.detallesPago(marca);
        p.detallesPago(precio);
        p.detallesPago(precio,modelo,talla);

    }

}