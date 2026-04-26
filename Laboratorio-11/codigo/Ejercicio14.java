package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        int N, M, i, j, aux;
        int A[][] = new int[60][60];
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar cantidad de filas: ");
        N = scan.nextInt();

        System.out.print("Ingresar cantidad de columnas: ");
        M = scan.nextInt();

        // Ingreso de datos
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("Ingresar número A[" + i + "][" + j + "]: ");
                A[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nMatriz original:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.print("\n");
        }

        // Intercambiar primera columna con última columna
        for (i = 0; i < N; i++) {
            aux = A[i][0];
            A[i][0] = A[i][M - 1];
            A[i][M - 1] = aux;
        }

        System.out.println("\nMatriz modificada:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.print("\n");
        }
    }
}