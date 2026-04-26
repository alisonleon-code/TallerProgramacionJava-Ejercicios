package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N;
        double suma=0;
        int num=1;

        System.out.print("Cantidad de terminos: ");
        N=scan.nextInt();

        for(int i=1;i<=N;i++){

            if(i==1){

                System.out.print("1/4");
                suma+=1.0/4;
                num=3;
            }

            else{
                if(i%2==0){

                    System.out.print(" - "+num+"/4");

                    // posiciones pares restan
                    suma-= (double)num/4;
                }

                else{

                    System.out.print(" + "+num+"/4");

                    // posiciones impares suman
                    suma+= (double)num/4;
                }
                num+=2;
            }
        }

        System.out.println("\nResultado de la serie: "+suma);
    }
}