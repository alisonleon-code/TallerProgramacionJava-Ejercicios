/**
 *
 * @author AlisonLeon
 */

package Ejemplo01;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {

        int n1, n2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar número 1: ");
        n1 = scan.nextInt();

        System.out.print("Ingresar número 2: ");
        n2 = scan.nextInt();

        CalculadoraV v = new CalculadoraV();

        v.sumar(n1, n2);
        v.restar(n1, n2);
        v.multiplicar(n1, n2);
        v.dividir(n1, n2);

        v.mostrarResultado();
    }
}

