
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio01 {

    public static void main(String[] args) {
      int N,M,i,j,q=0;
      int A[][]=new int[60][80];
      int B[]=new int[140];
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingresar cantidad de filas: ");
        N=scan.nextInt();
        System.out.print("Ingresar cantidad de columnas: ");
        M=scan.nextInt();
        
        for(i=0;i<N;i++){
           for(j=0;j<M;j++){
           System.out.print("Ingresar nùmero: ");
           A[i][j]=scan.nextInt();
        }
       }
        
       for(i=0;i<N;i++){
           for(j=0;j<M;j++){
             if(A[i][j]%6==0){
                B[q]=A[i][j];
                q++;
             }
           }
       } 
        
       System.out.print("Los nùmeros de la matriz son: \n");
       for(i=0;i<N;i++){
           for(j=0;j<M;j++){
             System.out.print("\t"+A[i][j]);
           }
           System.out.print("\n");
       }
       if(q>0){
       System.out.print("Los mùltiplos de 6 de la matriz son: \n");
       for(i=0;i<q;i++){
           System.out.print("\t"+B[i]);
       } 
       System.out.print("\n");
       }else
           System.out.print("No se encontraron mùltiplos de 6 en la matriz\n");
    }
    
}
