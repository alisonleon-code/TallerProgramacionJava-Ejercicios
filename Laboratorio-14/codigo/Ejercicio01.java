/**
 *
 * @author AlisonLeon
 */
package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        Multiplo m=new Multiplo();

        do{
            System.out.print("Ingresar número: ");
            m.setNum(scan.nextInt());

            m.multiplo3();
            m.multiplo4();
            m.multiplo7();

            System.out.print("¿Desea registrar más números [1]Si [2]No?: ");
            m.setOpc(scan.nextInt());

        }while(m.getOpc()==1);

        System.out.print("Cantidad de múltiplos de 3: "+m.getC1()+"\n");
        System.out.print("Cantidad de múltiplos de 4: "+m.getC2()+"\n");
        System.out.print("Cantidad de múltiplos de 7: "+m.getC3()+"\n");

    }

}