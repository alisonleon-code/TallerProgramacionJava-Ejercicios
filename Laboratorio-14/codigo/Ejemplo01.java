/**
 *
 * @author AlisonLeon
 */
package Ejemplo01;

import java.util.Scanner;

public class Ejemplo01 {

    public static void main(String[] args) {
        int s;
        Scanner scan = new Scanner(System.in);

        Calculadora c = new Calculadora();

        System.out.print("Ingresar primer número: ");
        c.setN1(scan.nextInt());
        System.out.print("Ingresar segundo número: ");
        c.setN2(scan.nextInt());
        s = c.calcularSuma();

        System.out.print("La suma es: " + s + "\n");
    }

}
