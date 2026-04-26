package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;
public class Ejercicio03 {

    public static void main(String[] args) {
      int N,i,j,sdp=0,sds=0;
      int A[][]=new int[60][80];
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingresar cantidad de filas y columnas: ");
        N=scan.nextInt();
        
        for(i=0;i<N;i++){
           for(j=0;j<N;j++){
           System.out.print("Ingresar nùmero: ");
           A[i][j]=scan.nextInt();
        }
       }
       
        System.out.print("Los nùmeros de la matriz son: \n");
       for(i=0;i<N;i++){
           for(j=0;j<N;j++){
             System.out.print("\t"+A[i][j]);
           }
           System.out.print("\n");
       }
       
       for(i=0;i<N;i++){
           for(j=0;j<N;j++){
               if(i==j)
                  sdp=sdp+A[i][j];
               if(i+j==N-1)
                  sds=sds+A[i][j];
           }
       }
       
       System.out.print("La suma de la diagonal principal es: "+sdp+"\n");
       System.out.print("La suma de la diagonal secundaria es: "+sds+"\n");
    }    
}
