package Ejercicios;

/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        int N, M, i, j;
        int A[][] = new int[60][80];
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresar cantidad de filas: ");
        N = scan.nextInt();
        System.out.print("Ingresar cantidad de columnas: ");
        M = scan.nextInt();

        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("Ingresar nùmero: ");
                A[i][j] = scan.nextInt();
            }
        }

        System.out.print("Los nùmeros de la matriz original son: \n");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.print("\n");
        }

        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                if (j == 0 || j == M - 1 || i == N - 1) {
                    A[i][j] = A[i][j] * 2;
                }
            }
        }

        System.out.print("Los nùmeros de la matriz modificada son: \n");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.print("\n");
        }
    }

}
