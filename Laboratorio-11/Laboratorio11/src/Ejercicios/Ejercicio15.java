package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        int N, i, j, aux;
        int A[][] = new int[60][60];
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar tamaño de la matriz (NxN): ");
        N = scan.nextInt();

        // Ingreso de datos
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("Ingresar número A[" + i + "][" + j + "]: ");
                A[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nMatriz original:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.print("\n");
        }

        // Intercambio: diagonal principal con última fila
        for (i = 0; i < N; i++) {
            aux = A[i][i];
            A[i][i] = A[N - 1][i];
            A[N - 1][i] = aux;
        }

        System.out.println("\nMatriz modificada:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.print("\n");
        }
    }
}