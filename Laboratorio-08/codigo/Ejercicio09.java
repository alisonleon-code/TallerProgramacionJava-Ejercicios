package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio09 {
    public static void main(String[] args) {
      int N,i,M,j;
      String ape,x=null;
      double not,mayor,suma,prom;
       Scanner scan=new Scanner(System.in);
       System.out.print("Ingresar cantidad de aulas: "); 
       N=scan.nextInt();
        
        for(i=0;i<N;i++){
            System.out.print("Ingresar cantidad de alumnos: "); 
            M=scan.nextInt();
            suma=0;
            mayor=0;
            for(j=0;j<M;j++){
                 System.out.print("Ingresar apellido: ");
                 ape=scan.next();
                 System.out.print("Ingresar nota final: ");
                 not=scan.nextDouble();
                 suma=suma+not;
                 if(not>mayor){
                     mayor=not;
                     x=ape;
                 }
            }
            prom=suma/M;
            System.out.println("El mejor alumno del aula es: "+x+" con la nota de: "+mayor+"\n");
            System.out.println("La nota promedio del aula es: "+prom+"\n");
        }
    }
    
}
