/**
 *
 * @author AlisonLeon
 */
package Ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        double metros,cm,km,pulg;

        Scanner scan=new Scanner(System.in);

        System.out.print("Ingresar medida en metros: ");
        metros=scan.nextDouble();

        Conversion c=new Conversion();

        cm=c.convertirCentimetros(metros);
        km=c.convertirKilometros(metros);
        pulg=c.convertirPulgadas(metros);

        c.mostrarResultados(cm,km,pulg);

    }

}