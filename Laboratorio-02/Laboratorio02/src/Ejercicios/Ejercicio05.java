
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double metros, cm, km, pulgadas;

        System.out.print("Metros: ");
        metros = scan.nextDouble();

        cm = metros * 100;
        km = metros / 1000;
        pulgadas = cm / 2.54;

        System.out.println("Centimetros: " + cm);
        System.out.println("Kilometros: " + km);
        System.out.println("Pulgadas: " + pulgadas);
    }
}
