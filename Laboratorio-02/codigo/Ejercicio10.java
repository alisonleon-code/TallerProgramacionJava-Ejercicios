
package Ejercicios;

/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero1, numero2;
        int unidadNumero1, unidadNumero2;

        System.out.print("Ingrese el primer numero: ");
        numero1 = scan.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = scan.nextInt();

        unidadNumero1 = numero1 % 10;
        unidadNumero2 = numero2 % 10;

        numero1 = (numero1 / 10) * 10 + unidadNumero2;
        numero2 = (numero2 / 10) * 10 + unidadNumero1;

        System.out.println("Nuevo numero 1: " + numero1);
        System.out.println("Nuevo numero 2: " + numero2);

    }
}