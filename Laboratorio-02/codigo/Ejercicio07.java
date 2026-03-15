
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precio, cuota;
        int n;

        System.out.print("Precio del equipo: ");
        precio = scan.nextDouble();

        System.out.print("Numero de cuotas: ");
        n = scan.nextInt();

        cuota = (precio / n) * 1.05;

        System.out.println("Monto por cuota: " + cuota);
    }
}