package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        int N, M, i, j;
        String minas[] = new String[50];
        double produccion[][] = new double[50][50];
        double promedio[] = new double[50];

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar cantidad de minas: ");
        N = scan.nextInt();

        System.out.print("Ingresar cantidad de meses: ");
        M = scan.nextInt();

        // Ingreso de nombres de minas
        for (i = 0; i < N; i++) {
            System.out.print("Ingresar nombre de la mina: ");
            minas[i] = scan.next();
        }

        // Ingreso de producción
        for (i = 0; i < N; i++) {
            double suma = 0;

            System.out.println("\nMina: " + minas[i]);

            for (j = 0; j < M; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                produccion[i][j] = scan.nextDouble();
                suma += produccion[i][j];
            }

            promedio[i] = suma / M;
        }

        // Mostrar promedios
        System.out.println("\n--- PROMEDIOS ---");
        for (i = 0; i < N; i++) {
            System.out.println(minas[i] + " -> " + promedio[i]);
        }

        // Minas con promedio menor a 120
        System.out.println("\nMinas con producción menor a 120:");
        boolean encontrado = false;

        for (i = 0; i < N; i++) {
            if (promedio[i] < 120) {
                System.out.println(minas[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay minas con promedio menor a 120");
        }
    }
}