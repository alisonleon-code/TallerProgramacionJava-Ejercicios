
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, a, b, c, mult;

        System.out.print("Numero de 3 cifras: ");
        num = scan.nextInt();

        a = num / 100;
        b = (num / 10) % 10;
        c = num % 10;

        mult = a * b * c;

        System.out.println("Multiplicacion: " + mult);
    }
}
