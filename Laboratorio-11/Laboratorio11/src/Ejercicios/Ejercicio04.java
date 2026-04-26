package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        int N, i, j;
        int A[][] = new int[50][50];

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar tamaño de la matriz (N): ");
        N = scan.nextInt();

        // Ingreso de datos
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("Ingresar número: ");
                A[i][j] = scan.nextInt();
            }
        }

        // Reemplazar diagonal secundaria múltiplos de 5
        for (i = 0; i < N; i++) {
            j = N - 1 - i;

            if (A[i][j] % 5 == 0) {
                A[i][j] = 0;
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz modificada:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.println();
        }
    }
}