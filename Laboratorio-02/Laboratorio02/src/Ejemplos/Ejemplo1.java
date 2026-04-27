
package Ejemplos;
/**
 *
 * @author AlisonLeon
 */
// Scanner permite leer datos ingresados por el usuario desde el teclado.
import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        String nombre;
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        nombre = scan.next();
        System.out.println("Tu nombre es "+nombre);
    }
}
