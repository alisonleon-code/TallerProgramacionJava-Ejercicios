package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N,i,num,j=0;

        int A[]=new int[50];
        int B[]=new int[50];

        System.out.print("Ingresar tamaño del vector: ");
        N=scan.nextInt();

        for(i=0;i<N;i++){
            System.out.print("Ingresar numero: ");
            A[i]=scan.nextInt();

        }

        System.out.print("Ingresar numero de referencia: ");
        num=scan.nextInt();

        // Pasar menores al vector B
        for(i=0;i<N;i++){

            if(A[i]<num){

                B[j]=A[i];
                j++;
            }
        }

        System.out.println("\nVector original:");

        for(i=0;i<N;i++){
            System.out.print(A[i]+"\t");
        }

        if(j>0){

            System.out.println("\nVector B:");

            for(i=0;i<j;i++){
                System.out.print(B[i]+"\t");
            }

        }else{
            System.out.println("\nNo existen numeros menores");

        }
    }

}