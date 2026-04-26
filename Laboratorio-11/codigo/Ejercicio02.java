package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        int N, M, i, j;
        int mayor = 0, colMayor = 0;
        int sumaPares = 0, contPares = 0;

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

        // Encontrar mayor y suma de pares
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {

                if (A[i][j] > mayor) {
                    mayor = A[i][j];
                    colMayor = j;
                }

                if (A[i][j] % 2 == 0) {
                    sumaPares += A[i][j];
                    contPares++;
                }
            }
        }

        double promedio = 0;
        if (contPares > 0) {
            promedio = (double) sumaPares / contPares;
        }

        // Reemplazar columna del mayor por promedio
        for (i = 0; i < N; i++) {
            A[i][colMayor] = (int) promedio;
        }

        // Mostrar matriz final
        System.out.println("\nMatriz modificada:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nPromedio pares: " + promedio);
        System.out.println("Mayor número: " + mayor);
    }
}