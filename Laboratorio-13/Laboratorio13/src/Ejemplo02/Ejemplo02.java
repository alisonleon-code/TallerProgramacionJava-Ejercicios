/**
 *
 * @author AlisonLeon
 */
package Ejemplo02;
import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {

        int n1, n2, s, r, m, d;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar número 1: ");
        n1 = scan.nextInt();

        System.out.print("Ingresar número 2: ");
        n2 = scan.nextInt();

        CalculadoraR c = new CalculadoraR();

        s = c.calcularSuma(n1, n2);
        r = c.calcularResta(n1, n2);
        m = c.calcularMultiplicar(n1, n2);
        d = c.calcularDividir(n1, n2);

        c.mostrarResultado(s, r, m, d);
    }
}