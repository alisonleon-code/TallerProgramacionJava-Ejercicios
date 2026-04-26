package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N;
        double prod=1;

        System.out.print("Ingresar cantidad de terminos: ");
        N=scan.nextInt();

        for(int i=1;i<=N;i++){

            // Mostrar términos
            if(i<N)
                System.out.print(i+"/"+(2*i)+" * ");
            else
                System.out.print(i+"/"+(2*i));

            // Multiplica términos
            prod=prod*((double)i/(2*i));

        }

        System.out.println("\nMultiplicacion de la serie: "+prod);
    }

}