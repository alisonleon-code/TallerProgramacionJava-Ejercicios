package Ejemplos;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;
public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N,i;
        int C[]=new int[50];

        System.out.print("Ingresar tamaño del vector: ");
        N=scan.nextInt();

        // Llenar vector
        for(i=0;i<N;i++){
            System.out.print("Ingresar numero: ");
            C[i]=scan.nextInt();

        }
        System.out.println("\nNumeros ingresados:");
        // Mostrar vector
        for(i=0;i<N;i++){

            System.out.print(C[i]+"\t");
        }
    }
}