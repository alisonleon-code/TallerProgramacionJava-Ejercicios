package Ejercicios;
/**
 *
 * @author AlisonLeon
 */

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        int N, i, j;
        char letraBuscada;
        boolean encontrado = false;

        char M[][] = new char[50][50];

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar tamaño de la matriz: ");
        N = scan.nextInt();

        // Ingreso de matriz
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("Ingresar letra: ");
                M[i][j] = scan.next().charAt(0);
            }
        }

        System.out.print("Ingresar letra a buscar: ");
        letraBuscada = scan.next().charAt(0);

        System.out.println("\nMatriz ingresada:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nLa letra "+ letraBuscada  +" se encontró en las filas:");

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {

                if (M[i][j] == letraBuscada) {
                    System.out.println("Fila: " + i);
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró la letra en la matriz");
        }
    }
}