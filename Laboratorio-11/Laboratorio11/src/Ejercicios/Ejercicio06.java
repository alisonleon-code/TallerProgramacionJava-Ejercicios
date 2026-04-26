package Ejercicios;

/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        int N, M, i, j, mayor = 0, pos1 = 0, pos2 = 0, menor = 9999, pos3 = 0, pos4 = 0, aux;
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
        System.out.print("La matriz original es: \n");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.print("\n");
        }
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                if (A[i][j] > mayor) {
                    mayor = A[i][j];
                    pos1 = i;
                    pos2 = j;
                }
                if (A[i][j] < menor) {
                    menor = A[i][j];
                    pos3 = i;
                    pos4 = j;
                }
            }
        }

        aux = A[pos1][pos2];
        A[pos1][pos2] = A[pos3][pos4];
        A[pos3][pos4] = aux;

        System.out.print("La matriz modificada es: \n");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.print("\n");
        }
    }
}
