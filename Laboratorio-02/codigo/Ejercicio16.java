
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int perros, gatos, aves, total;
        double porperros, porgatos, poraves;

        System.out.print("Ingrese cantidad de Perros: ");
        perros = scan.nextInt();

        System.out.print("Ingrese cantidad de Gatos: ");
        gatos = scan.nextInt();

        System.out.print("Ingrese cantidad de Aves: ");
        aves = scan.nextInt();

        total = perros + gatos + aves;

        porperros= (perros * 100.0) / total;
        porgatos = (gatos * 100.0) / total;
        poraves = (aves * 100.0) / total;
        
        System.out.println("RESULTADO EN PORCENTAJE");
        System.out.println("Perros: " + porperros+ "%");
        System.out.println("Gatos: " + porgatos + "%");
        System.out.println("Aves: " + poraves+ "%");
    }
}