package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int N,i,j=0;

        int A[]=new int[50];
        int B[]=new int[50];

        System.out.print("Ingresar tamaño del vector: ");
        N=scan.nextInt();

        for(i=0;i<N;i++){

            System.out.print("Ingresar numero: ");
            A[i]=scan.nextInt();

        }

        // Pasar pares al vector B
        for(i=0;i<N;i++){

            if(A[i]%2==0){

                B[j]=A[i];
                j++;
            }

        }

        System.out.println("\nVector A:");
        for(i=0;i<N;i++){
            System.out.print(A[i]+"\t");
        }

        if(j>0){
            System.out.println("\nVector B (pares):");

            for(i=0;i<j;i++){
                System.out.print(B[i]+"\t");
            }

        }
        else{

            System.out.println("\nNo existen numeros pares");
        }
    }
}