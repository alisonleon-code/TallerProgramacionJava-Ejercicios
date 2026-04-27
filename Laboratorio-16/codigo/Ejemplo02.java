/**
 *
 * @author AlisonLeon
 */
package Ejemplo02;

import java.util.Scanner;

public class Ejemplo02 {

    public static void main(String[] args) {

        int l, a, res1, res2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar lado del cuadrado: ");
        a = scan.nextInt();

        System.out.print("Ingresar largo del rectángulo: ");
        l = scan.nextInt();

        Figuras f = new Figuras();

        res1 = f.calcularArea(a);
        System.out.println("Área del cuadrado: " + res1);

        res2 = f.calcularArea(l, a);
        System.out.println("Área del rectángulo: " + res2);

    }

}
