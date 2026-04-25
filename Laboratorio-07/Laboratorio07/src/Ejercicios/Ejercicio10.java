package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int d1,d2,d3,d4;

        do{

            System.out.print("\nIngrese numero de 4 digitos: ");
            num=scan.nextInt();


            if(num==1000 || num==9999){
                break;
            }


            // Separar dígitos
            d1=num/1000;
            d2=(num/100)%10;
            d3=(num/10)%10;
            d4=num%10;


            int sumaPares=0;
            int sumaImpares=0;


            // Suma pares e impares
            if(d1%2==0)
                sumaPares+=d1;
            else
                sumaImpares+=d1;


            if(d2%2==0)
                sumaPares+=d2;
            else
                sumaImpares+=d2;


            if(d3%2==0)
                sumaPares+=d3;
            else
                sumaImpares+=d3;


            if(d4%2==0)
                sumaPares+=d4;
            else
                sumaImpares+=d4;


            // Hallar dígito mayor
            int mayor=d1;

            if(d2>mayor)
                mayor=d2;

            if(d3>mayor)
                mayor=d3;

            if(d4>mayor)
                mayor=d4;



            System.out.println("\nSuma digitos pares: "+sumaPares);
            System.out.println("Suma digitos impares: "+sumaImpares);
            System.out.println("Digito mayor: "+mayor);


        }while(num!=1000 && num!=9999);

    }

}