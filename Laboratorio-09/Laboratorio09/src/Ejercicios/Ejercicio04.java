
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio04 {

    public static void main(String[] args) {
      int N,i,mayor=0,pos1=0,menor=9999,pos2=0,aux;
      int C[]=new int[50];
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingresar tamaño del vector: ");
        N=scan.nextInt();
        
        for(i=0;i<N;i++){
           System.out.print("Ingresar nùmero: ");
           C[i]=scan.nextInt();
        }
        
        for(i=0;i<N;i++){
            if(C[i]>mayor){
               mayor=C[i];
               pos1=i;
            }
            if(C[i]<menor){
               menor=C[i];
               pos2=i;
            }
        }
        System.out.print("El vector original es: \n");
            for(i=0;i<N;i++){
                System.out.print("\t"+C[i]);
            }
        System.out.print("\n");
        
        aux=C[pos1];
        C[pos1]=C[pos2];
        C[pos2]=aux;
        
        System.out.print("El vector modificado es: \n");
            for(i=0;i<N;i++){
                System.out.print("\t"+C[i]);
            }
        System.out.print("\n");
    }
    
}
