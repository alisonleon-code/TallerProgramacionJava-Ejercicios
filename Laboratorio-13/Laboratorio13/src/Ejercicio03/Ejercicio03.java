/**
 *
 * @author AlisonLeon
 */
package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        int num,p,t,u,suma;

        Scanner scan=new Scanner(System.in);

        System.out.print("Ingresar número de 5 cifras: ");
        num=scan.nextInt();

        if(num<10000 || num>99999){
            System.out.println("Error: debe ingresar un número de 5 cifras");
        }
        else{

            Numero n=new Numero();

            p=n.primerDigito(num);
            t=n.tercerDigito(num);
            u=n.ultimoDigito(num);

            suma=n.sumaDigitos(p,t,u);

            n.mostrarResultado(p,t,u,suma);

        }

    }

}