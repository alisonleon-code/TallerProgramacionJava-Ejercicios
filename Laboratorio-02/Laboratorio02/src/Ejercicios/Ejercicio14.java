
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        double x, number,r;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insertar potencia: ");
        x = scan.nextInt();
        System.out.print("Insertar numero: ");
        number = scan.nextInt();
        r=Math.pow(number,x);// Eleva number a la potencia x 
        System.out.println("El resultado es:  " + r);
    }    
}
