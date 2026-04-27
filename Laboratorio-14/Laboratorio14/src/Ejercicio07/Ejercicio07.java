/**
 *
 * @author AlisonLeon
 */
package Ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        int N,i,edad;
        double peso;

        Scanner scan=new Scanner(System.in);

        Persona p=new Persona();

        System.out.print("Cantidad de personas: ");
        N=scan.nextInt();

        for(i=0;i<N;i++){

            System.out.print("Ingresar edad: ");
            edad=scan.nextInt();

            System.out.print("Ingresar peso: ");
            peso=scan.nextDouble();

            p.setEdad(edad);
            p.setPeso(peso);

            p.clasificarPersona();
        }

        p.mostrarResultados();

    }

}