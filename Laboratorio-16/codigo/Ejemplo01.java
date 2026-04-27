/**
 *
 * @author AlisonLeon
 */
package Ejemplo01;

import java.util.Scanner;

public class Ejemplo01 {

    public static void main(String[] args) {
        int largo, ancho, res;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresar el largo: ");
        largo = scan.nextInt();
        System.out.print("Ingresar el ancho: ");
        ancho = scan.nextInt();
        Rectangulo r1 = new Rectangulo();
        res = r1.calcularArea();
        System.out.print("El area del rectangulo es: " + res + "\n");
        Rectangulo r2 = new Rectangulo(largo, ancho);
        res = r2.calcularArea();
        System.out.print("El area del rectangulo es: " + res + "\n");
    }

}
