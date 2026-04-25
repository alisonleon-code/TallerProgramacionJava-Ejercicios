
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio01 {
   
    public static void main(String[] args) {
      String ape;
      int dni,tip,cant;
      double p=0,suma=0;
      boolean bd=true;
     Scanner scan=new Scanner(System.in);
        
        do{
          System.out.print("Ingresar apellido del cliente: "); 
          ape=scan.next();
          System.out.print("Ingresar DNI: ");
          dni=scan.nextInt();
          System.out.print("Indique el tipo de gasolina [84][90][97]:");
          tip=scan.nextInt();
          System.out.print("Ingresar cantidad de galones: ");
          cant=scan.nextInt();
          
          switch(tip){
              case 84: p=cant*8.2;break;
              case 90: p=cant*10.5;break;
              case 97: p=cant*15.3;break;
            default:System.out.print("Fin del programa");
                    bd=false;
          }  
          suma=suma+p;
          System.out.print("*****Boleta de pago****\n");
          System.out.print("Nombre: "+ape+"\n");
          System.out.print("DNI: "+dni+"\n");
          System.out.print("Total a pagar es: "+p+"soles\n");
          System.out.print("****************************\n");
        }while(bd==true);
        
        System.out.print("-----------------------------\n"); 
      System.out.print("El total a recaudado es: "+suma+"soles\n"); 
      System.out.print("-----------------------------\n"); 
    }
    
}
