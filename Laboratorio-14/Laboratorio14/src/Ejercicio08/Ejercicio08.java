/**
 *
 * @author AlisonLeon
 */
package Ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        int cat,edad;
        double pago,des,pf;

        Scanner scan=new Scanner(System.in);

        System.out.print("Categoria [1]A [2]B [3]C: ");
        cat=scan.nextInt();

        System.out.print("Ingresar edad: ");
        edad=scan.nextInt();

        Socio s=new Socio();

        s.setCat(cat);
        s.setEdad(edad);

        pago=s.calcularPagoMensual();
        des=s.calcularDescuento(pago);
        pf=s.calcularPagoFinal(pago,des);

        s.mostrarResultados(pago,des,pf);

    }

}