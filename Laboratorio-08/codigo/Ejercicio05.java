
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio05 {

    public static void main(String[] args) {
       int N,i;
       double suma=0,num=1,den=1;
         Scanner scan=new Scanner(System.in);
         System.out.print("Ingresar cantidad de terminos a sumar: "); 
         N=scan.nextInt();
         
         for(i=0;i<N;i++){
              System.out.print(num+"/"+den+"+");
              suma=suma+num/den;
              den++;
         }
         
         System.out.print("\nLa suma de los "+N+" terminos es: "+suma);       
    }   
}
