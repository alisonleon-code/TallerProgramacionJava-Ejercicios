
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */


public class Ejercicio03 {

  
    public static void main(String[] args) {
       int num=1,cont1=0,cont2=0;
        Scanner scan=new Scanner(System.in);
        
        while(num>0 && num<=100){
            System.out.print("Ingresar número: \n");
            num=scan.nextInt();
            if(num>0 && num<=100){
                if(num%3==0)
                    cont1++;
                if(num%7==0)
                    cont2++;
            }
        }
        
        System.out.print("La cantidad de múltiplos de 3 es: "+cont1+"\n");
        System.out.print("La cantidad de múltiplos de 7 es: "+cont2+"\n");
    }
    
}
