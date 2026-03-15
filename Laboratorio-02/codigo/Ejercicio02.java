
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radio, area;

        System.out.print("Ingrese el radio: ");
        radio = scan.nextDouble();

        area = Math.PI * Math.pow(radio,2);//Calcula el área de un círculo usando la fórmula A = π * r²

        System.out.println("Area del circulo: " + area);

    }
    
}
