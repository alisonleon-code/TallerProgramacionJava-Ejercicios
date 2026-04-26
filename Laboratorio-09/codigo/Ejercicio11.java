
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int N,i,M;
         int A[]=new int[60];
         int B[]=new int[90];
       Scanner scan=new Scanner(System.in);
         
        System.out.print("Ingresar tamaño del vector A: ");
        N=scan.nextInt();
        
        for(i=0;i<N;i++){
           System.out.print("Ingresar nùmero: ");
           A[i]=scan.nextInt();
        }
        
        System.out.print("Ingresar tamaño del vector B: ");
        M=scan.nextInt();
        
        for(i=0;i<M;i++){
           System.out.print("Ingresar nùmero: ");
           B[i]=scan.nextInt();
        }
        
        System.out.print("El vector A original es: \n");
            for(i=0;i<N;i++){
                System.out.print("\t"+A[i]);
            }
        System.out.print("\n");
        
        System.out.print("El vector B original es: \n");
            for(i=0;i<M;i++){
                System.out.print("\t"+B[i]);
            }
        System.out.print("\n");
        
         for(i=0;i<N;i++){
            if(A[i]%2==0){
                B[M]=A[i];
                M++;
            }
         }
         
         System.out.print("El vector B modificado es: \n");
            for(i=0;i<M;i++){
                System.out.print("\t"+B[i]);
            }
        System.out.print("\n");
        
    }
    
}
