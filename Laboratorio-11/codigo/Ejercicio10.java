package Ejercicios;

/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int N, i, j, suma;
        String Nom[] = new String[60];
        int Not[][] = new int[60][3];
        int Prom[] = new int[60];
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar cantidad de estudiantes: ");
        N = scan.nextInt();

        for (i = 0; i < N; i++) {
            System.out.print("Ingresar nombre: ");
            Nom[i] = scan.next();
            for (j = 0; j < 3; j++) {
                System.out.print("Ingresar nota: ");
                Not[i][j] = scan.nextInt();
                if (Not[i][j] < 0 || Not[i][j] > 20) {
                    System.out.print("Nota incorrecta\n");
                    j--;
                }
            }
        }

        for (i = 0; i < N; i++) {
            suma = 0;
            for (j = 0; j < 3; j++) {
                suma = suma + Not[i][j];
            }
            Prom[i] = suma / 3;
        }

        System.out.print("El promedio de cada estudiante es: \n ");
        for (i = 0; i < N; i++) {
            System.out.print("\t" + Nom[i]);
            System.out.print("\t" + Prom[i]);
        }

        System.out.print("\n ");

        System.out.print("Los estudiantes aprobados son : \n ");
        for (i = 0; i < N; i++) {
            if (Prom[i] >= 12) {
                System.out.print("\t" + Nom[i]);
            }
        }

        System.out.print("\n ");
    }
}
