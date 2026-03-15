
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double monto, medicinageneral, cardiologia, peditria, traumatologia;

        System.out.print("Monto de donacion: ");
        monto = scan.nextDouble();

        medicinageneral = monto * 0.45;
        cardiologia = monto * 0.30;
        peditria = monto * 0.15;
        traumatologia = monto - (medicinageneral + cardiologia + peditria);

        System.out.println("Medicina General: " + medicinageneral);
        System.out.println("Cardiologia: " + cardiologia);
        System.out.println("Pediatria: " + peditria);
        System.out.println("Traumatologia: " + traumatologia);
    }
}