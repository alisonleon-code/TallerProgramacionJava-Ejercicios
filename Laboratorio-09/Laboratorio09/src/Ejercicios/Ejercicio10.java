
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        int N,i;
        int HT[]=new int[60];
        String Nom[]=new String[60];
        int Sueldo[]=new int[60];
        
       Scanner scan=new Scanner(System.in);
         
        System.out.print("Ingresar cantidad de empleados: ");
        N=scan.nextInt();
        
        for(i=0;i<N;i++){
           System.out.print("Ingresar horas trabajadas: ");
           HT[i]=scan.nextInt();
           if(HT[i]>0){
                System.out.print("Ingresar nombre del trabajador: ");
                Nom[i]=scan.next();
           }else{
                  System.out.print("Las horas no pueden ser negativas\n");
                  i--;
           }
        }
        
         for(i=0;i<N;i++){
              if(HT[i]>=1 && HT[i]<=40)
                  Sueldo[i]=HT[i]*20;
              else  if(HT[i]>=41 && HT[i]<=80)
                               Sueldo[i]=HT[i]*25;
                       else
                                Sueldo[i]=HT[i]*27;
         }
         
         System.out.print("Los sueldos de los trabajadores son: \n");
            for(i=0;i<N;i++){
                System.out.print("\t"+Nom[i]);
                System.out.print("\t"+Sueldo[i]);
            }
         
    }
    
}
