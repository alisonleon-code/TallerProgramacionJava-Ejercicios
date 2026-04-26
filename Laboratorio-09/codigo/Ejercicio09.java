
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio09 {

    public static void main(String[] args) {
      int N,i,x=0;
      int F[]=new int[50];
      boolean bd=false;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingresar tamaño del vector: ");
        N=scan.nextInt();
        
        for(i=0;i<N;i++){
           System.out.print("Ingresar nùmero: ");
           F[i]=scan.nextInt();
        }
        
        for(i=0;i<N;i++){
           if(F[i]%7==0){
              x=F[i];
              i=N;
              bd=true;
           }
        }
        System.out.print("El vector original es: \n");
            for(i=0;i<N;i++){
                System.out.print("\t"+F[i]);
            }
       System.out.print("\n");
            
        for(i=0;i<N;i++){
            if(F[i]>x)
              F[i]=x;
        }
        
        if(bd==true){
           System.out.print("El vector modificado es: \n");
            for(i=0;i<N;i++){
                System.out.print("\t"+F[i]);
            }
            System.out.print("\n");
        }else
           System.out.print("No se encontraron mùltiplos de 7\n"); 
   
    }
}
