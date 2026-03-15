package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        String nombre, apellido;
        int edad;
        double peso;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        nombre = scan.nextLine();

        System.out.print("Escribe tus apellidos: ");
        apellido = scan.nextLine();

        System.out.print("Escribe tu edad: ");
        edad = scan.nextInt();

        System.out.print("Escribe tu peso: ");
        peso = scan.nextDouble();

        // Mostrar los datos ingresados
        System.out.println("\nSUS DATOS SON:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");

    }

}