package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        int N, M, i, j, suma = 0;
        int A[][] = new int[50][50];

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar filas: ");
        N = scan.nextInt();

        System.out.print("Ingresar columnas: ");
        M = scan.nextInt();

        // Ingreso de datos
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("Ingresar número: ");
                A[i][j] = scan.nextInt();
            }
        }

        // Sumar forma de O (bordes)
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {

                if (i == 0 || i == N - 1 || j == 0 || j == M - 1) {
                    suma += A[i][j];
                }
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nSuma de la letra O: " + suma);
    }
}