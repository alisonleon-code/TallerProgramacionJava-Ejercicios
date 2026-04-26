
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio05 {
    
    public static void main(String[] args) {
      int N,i,mayor=0;
      int Not[]=new int[60];
      String Nom[]=new String[60];
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingresar cantidad de participantes: ");
        N=scan.nextInt();
        
        for(i=0;i<N;i++){
           System.out.print("Ingresar nota: ");
           Not[i]=scan.nextInt();
           if(Not[i]>=0 && Not[i]<=20){
              System.out.print("Ingresar nombre: "); 
              Nom[i]=scan.next();
           }else{
              System.out.print("Nota incorrecta\n");
              i--;
           }
        }
        
        for(i=0;i<N;i++){
           if(Not[i]>mayor)
              mayor=Not[i];
        }
        
        System.out.print("Los ganadores del concurso son: \n");
        for(i=0;i<N;i++){
          if(Not[i]==mayor)
           System.out.print("\t"+Nom[i]);
        }
        System.out.print("\n");
    }
    
}
