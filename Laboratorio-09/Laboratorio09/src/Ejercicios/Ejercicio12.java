package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int N, i;
        int A[] = new int[60];
        int B[] = new int[60];
        int C[] = new int[60];

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresar tamaño de los vectores: ");
        N = scan.nextInt();

        // Llenar vector A
        for(i=0;i<N;i++){
            System.out.print("Ingresar número A: ");
            A[i] = scan.nextInt();
        }

        // Llenar vector B
        for(i=0;i<N;i++){
            System.out.print("Ingresar número B: ");
            B[i] = scan.nextInt();
        }

        // Operación entre A y B
        for(i=0;i<N;i++){
            if(A[i] > B[i]){
                C[i] = A[i] - B[i]; // resta si A es mayor
            }else{
                C[i] = A[i] + B[i]; // suma si B es mayor o igual
            }
        }

        // Mostrar resultado
        System.out.println("\nVector C resultado:");

        for(i=0;i<N;i++){
            System.out.print("\t" + C[i]);
        }

        System.out.println();
    }
}