/**
 *
 * @author AlisonLeon
 */
package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        double compra,descuento,impuesto,total;
        char rubro;

        Scanner scan=new Scanner(System.in);

        System.out.print("Ingresar monto de compra: ");
        compra=scan.nextDouble();

        System.out.print("Ingrese rubro [C=comestibles / A=artefactos]: ");
        rubro=scan.next().charAt(0);

        Compra c=new Compra();

        descuento=c.calcularDescuento(compra);

        impuesto=c.calcularImpuesto(compra-descuento,rubro);

        total=c.calcularPagoTotal(compra,descuento,impuesto);

        c.mostrarBoleta(compra,descuento,impuesto,total);

    }

}