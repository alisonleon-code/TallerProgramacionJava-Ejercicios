
package Ejemplos;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejemplo4 {

    public static void main(String[] args) {
        double num,r;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        num=scan.nextDouble();
        r=Math.sqrt(num);// Math.sqrt() es un método de la clase Math que devuelve la raíz cuadrada de un número.
        System.out.println("La raíz cuadrada de: "+num+" es: "+r);
    }
}
