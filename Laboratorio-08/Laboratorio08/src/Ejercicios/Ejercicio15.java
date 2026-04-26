package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int suma=0;

        System.out.print("Ingrese un numero: ");
        x=scan.nextInt();

        System.out.println("\nDivisores de "+x+":");
        
        for(int i=1;i<=x;i++){
            if(x%i==0){

                System.out.print(i+" ");

                // Acumula divisores
                suma+=i;
            }
        }
        System.out.println("\nSuma de divisores: "+suma);
    }
}