package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio14{

    public static void main(String[] args) {
        int N, i, M, j;
        String nombre = null, nombreMayorPromedio = null;
        double carga, mayor, menor, suma, prom, mayorPromedio = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar cantidad de conductores: ");
        N = scan.nextInt();

        for (i = 0; i < N; i++) {
            System.out.print("Ingresar cantidad de viajes del conductor " + (i + 1) + ": ");
            M = scan.nextInt();

            System.out.print("Ingresar nombre del conductor " + (i + 1) + ": ");
            nombre = scan.next();

            System.out.print("Ingresar carga del viaje 1: ");
            carga = scan.nextDouble();

            mayor = carga;
            menor = carga;
            suma = carga;

            for (j = 1; j < M; j++) {
                System.out.print("Ingresar carga del viaje " + (j + 1) + ": ");
                carga = scan.nextDouble();
                suma = suma + carga;

                if (carga > mayor) {
                    mayor = carga;
                }
                if (carga < menor) {
                    menor = carga;
                }
            }

            prom = suma / M;
            System.out.println("Conductor: " + nombre);
            System.out.println("Mayor carga: " + mayor);
            System.out.println("Menor carga: " + menor);
            System.out.println("Carga promedio: " + prom + "\n");

            if (prom > mayorPromedio) {
                mayorPromedio = prom;
                nombreMayorPromedio = nombre;
            }
        }

        System.out.println("Conductor con mayor carga promedio: " + nombreMayorPromedio);
        System.out.println("Mayor carga promedio: " + mayorPromedio);

    }
}

