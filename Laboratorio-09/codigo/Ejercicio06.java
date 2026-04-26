package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N,i,suma;
        int A[]=new int[50];

        System.out.print("Ingresar tamaño del vector: ");
        N=scan.nextInt();

        for(i=0;i<N;i++){

            System.out.print("Ingresar numero: ");
            A[i]=scan.nextInt();

        }

        // Primer número par
        int primerPar=0;

        for(i=0;i<N;i++){

            if(A[i]%2==0){
                primerPar=A[i];
                break;
            }

        }

        // Último número impar
        int ultimoImpar=0;

        for(i=N-1;i>=0;i--){

            if(A[i]%2!=0){
                ultimoImpar=A[i];
                break;
            }

        }

        suma=primerPar+ultimoImpar;

        // Buscar mayor
        int mayor=A[0];
        int posMayor=0;

        for(i=1;i<N;i++){

            if(A[i]>mayor){
                mayor=A[i];
                posMayor=i;
            }
        }

        // Reemplazar mayor por suma
        A[posMayor]=suma;
        System.out.println("\nSuma: "+suma);
        System.out.println("Vector modificado:");
        for(i=0;i<N;i++){
            System.out.print(A[i]+"\t");
        }

    }

}