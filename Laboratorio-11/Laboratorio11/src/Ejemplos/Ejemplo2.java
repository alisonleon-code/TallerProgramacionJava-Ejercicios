package Ejemplos;
/**
 *
 * @author AlisonLeon
 */

import java.util.Scanner;

public class Ejemplo2 {

    public static void main(String[] args) {

        int i, j, N, M;
        int B[][] = new int[50][50];

        Scanner scan = new Scanner(System.in);

        // Tamaño de la matriz
        System.out.print("Ingresar número de filas: ");
        N = scan.nextInt();

        System.out.print("Ingresar número de columnas: ");
        M = scan.nextInt();

        // Ingreso de datos
        for(i = 0; i < N; i++){
            for(j = 0; j < M; j++){
                System.out.print("Ingresar número: ");
                B[i][j] = scan.nextInt();
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz ingresada:");

        for(i = 0; i < N; i++){
            for(j = 0; j < M; j++){
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
    }
}