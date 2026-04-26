
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
       int N,i,menor=99999,pos=0,suma=0;
       int A[]=new int[60];
       
         Scanner scan=new Scanner(System.in);
         
        System.out.print("Ingresar tamaño del vector: ");
        N=scan.nextInt();
        
        for(i=0;i<N;i++){
           System.out.print("Ingresar nùmero: ");
           A[i]=scan.nextInt();
        }
        
        for(i=0;i<N;i++){
            if(A[i]<menor){
                menor=A[i];
                pos=i;
            }
        }
        
        pos=pos+1;
        
        for(i=pos;i<N;i++){
             suma=suma+A[i];
        }
        
        System.out.print("El vector original es: \n");
            for(i=0;i<N;i++){
                System.out.print("\t"+A[i]);
            }
        System.out.print("\n");
        
        A[pos-1]=suma;
        
        System.out.print("El vector modificado es: \n");
            for(i=0;i<N;i++){
                System.out.print("\t"+A[i]);
            }
        System.out.print("\n");
    }
    
}
