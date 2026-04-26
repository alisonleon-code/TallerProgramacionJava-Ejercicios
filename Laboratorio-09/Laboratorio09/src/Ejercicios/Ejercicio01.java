
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio01 {

    
    public static void main(String[] args) {
       int N,i,j=0;
       int Edad[]=new int[40];
       int Mayores[]=new int[40];
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingresar cantidad de personas: ");
        N=scan.nextInt();
        
        for(i=0;i<N;i++){
           System.out.print("Ingresar edad: ");
           Edad[i]=scan.nextInt();
           if(Edad[i]>100){
               System.out.print("Error de ingreso\n");
                i--;
           }  
        }
        
        // Comparar Edades mayores o iguales a 18 
        for(i=0;i<N;i++){
             if(Edad[i]>=18){
                  Mayores[j]=Edad[i];
                  j++;
             }
        }
        
        if(j>0){
            System.out.print("Las edades mayores e iguales a 18 son: \n");
            for(i=0;i<j;i++){
                System.out.print("\t"+Mayores[i]);
            }
        }else
             System.out.print("No se encontraron edades mayores e iguales a 18 son: \n");
    }
    
}
