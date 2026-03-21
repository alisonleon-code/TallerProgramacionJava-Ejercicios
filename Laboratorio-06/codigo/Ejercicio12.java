
package Ejercicios;

import java.util.Scanner;


public class Ejercicio12 {

   
    public static void main(String[] args) {
       int tip,cant,preg=1,reg=2;
       double p=0,suma,sumat=0;
       String nom;
        Scanner scan=new Scanner(System.in);
       while(reg==2){
         System.out.print("Ingresar nombre del cliente: ");
         nom=scan.next();
         preg=1;
         suma=0;
        while(preg==1){
           System.out.print("Indique el tipo [1]Dulce[2]Salado[3]Mixto:");
           tip=scan.nextInt();
           System.out.print("Ingresar cantidad de productos: ");
           cant=scan.nextInt();
           switch(tip){
               case 1:p=cant*4.5;break;
               case 2:p=cant*3.5;break;
               case 3:p=cant*6.5;break;    
           }
           suma=suma+p;
           System.out.print("¿Desea elegir otro tipo de postre? [1]Si[2]No: \n"); 
           preg=scan.nextInt();
        }
        sumat=sumat+suma;
        System.out.print("*****Boleta de consumo****\n");
        System.out.print("Nombre: "+nom+"\n");
        System.out.print("Total a pagar es: "+suma+"soles\n");
        System.out.print("****************************\n");
        System.out.print("¿Desea cerrar la caja registradora? [1]Si[2]No: \n"); 
        reg=scan.nextInt();
      }
      System.out.print("-----------------------------\n"); 
      System.out.print("El total a recaudado es: "+sumat+"soles\n"); 
      System.out.print("-----------------------------\n"); 
    }
    
}
