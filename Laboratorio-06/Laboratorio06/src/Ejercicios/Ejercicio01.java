package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio01 {

    public static void main(String[] args) {
       int nm,cant,preg=1;
       String nom,x=null;
       double pb,des,pn,suma=0,mayor=0;
        Scanner scan=new Scanner(System.in);
        
        while(preg==1){
            System.out.print("Ingresar nùmero de mesa: ");
            nm=scan.nextInt();
            System.out.print("Ingresar el nombre del cliente: ");
            nom=scan.next();
            System.out.print("Ingresar la cantidad de menùs: ");
            cant=scan.nextInt();
            
            pb=cant*8.5;
            
            if(cant==1 || cant==2)
                des=0;
            else if(cant>=3 && cant<=9)
                     des=pb*0.05;
                 else
                     des=pb*0.10;
            
            pn=pb-des;
            
            System.out.print("****Boleta de consumo****\n");
            System.out.print("Nùmero de mesa: "+nm+"\n");
            System.out.print("Cliente: "+nom+"\n");
            System.out.print("Pago bruto: "+pb+" soles\n");
            System.out.print("Descuento: "+des+" soles\n");
            System.out.print("-------------------------\n");
            System.out.print("Pago neto: "+pn+" soles\n");
            System.out.print("**************************\n");
            
            if(pn>mayor){  //Mètodo supuesto falso
                mayor=pn;
                x=nom;
            }
            suma=suma+pn;
            
            System.out.print("¿Desea registrar otro consumo? [1]Si[2]No: \n"); 
            preg=scan.nextInt();
        }
         
        System.out.print("****Reporte Final****\n");
        System.out.print("El total recaudado es: "+suma+" soles\n");
        System.out.print("Cliente que realizò el mayor pago es: "+x+"\n");
    }
    
}
