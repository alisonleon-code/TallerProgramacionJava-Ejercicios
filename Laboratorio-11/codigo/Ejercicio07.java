
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        int N, M, i, j;
        int A[][] = new int[60][80];
        int B[] = new int[140];
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar cantidad de filas: ");
        N = scan.nextInt();
        System.out.print("Ingresar cantidad de columnas: ");
        M = scan.nextInt();

        // Ingreso de la matriz A
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("Ingresar número A[" + i + "][" + j + "]: ");
                A[i][j] = scan.nextInt();
            }
        }

        // Sumar cada fila y guardar en el vector B
        for (i = 0; i < N; i++) {
            int sumaFila = 0;
            for (j = 0; j < M; j++) {
                sumaFila += A[i][j];
            }
            B[i] = sumaFila;
        }

        // Mostrar la matriz A
        System.out.println("\nLa matriz A es:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.print("\n");
        }

        // Mostrar el vector B con las sumas de las filas
        System.out.println("\nVector B (suma de cada fila):");
        for (i = 0; i < N; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
