package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,temp;
        int divisores;

        int contPrimos=0;
        int suma=0;

        double promedio;

        System.out.print("Ingrese valor a: ");
        a=scan.nextInt();

        System.out.print("Ingrese valor b: ");
        b=scan.nextInt();

        // Intercambia si están invertidos
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }

        System.out.println("\nNumeros primos encontrados:");

        for(int i=a;i<=b;i++){

            divisores=0;


            for(int j=1;j<=i;j++){

                if(i%j==0){
                    divisores++;
                }

            }

            if(divisores==2){

                System.out.print(i+" ");

                suma+=i;
                contPrimos++;
            }

        }

        if(contPrimos>0){

            promedio=(double)suma/contPrimos;

            System.out.println("\nPromedio de primos: "+promedio);
        }

        else{

            System.out.println("No existen numeros primos en el rango");

        }
    }
}