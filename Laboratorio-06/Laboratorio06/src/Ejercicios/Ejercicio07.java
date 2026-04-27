
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio07 {

   
    public static void main(String[] args) {
        int punt,cont1=0,cont2=0,cont3=0,preg=1,total;
        Scanner scan=new Scanner(System.in);
        
        while(preg==1){
             System.out.print("Ingresar el puntaje del postulante: \n");
             punt=scan.nextInt();
             if(punt>=0 && punt<=49)
                 cont1++;
             else  if(punt>=50 && punt<=79)
                           cont2++;
                    else if(punt>=80 && punt<=100)
                                   cont3++;
             System.out.print("¿Desea registrar más postulantes? [1]Si[2]No: \n"); 
             preg=scan.nextInt();
        }
        
        total=cont1+cont2+cont3;
        
        System.out.print("****Resultado de la prueba****\n");
        System.out.print("La cantidad de postulantes que obtuvieron entre 0 y 49 es: "+cont1+"\n");
        System.out.print("La cantidad de postulantes que obtuvieron entre 50 y 79 es: "+cont2+"\n");
        System.out.print("La cantidad de postulantes que obtuvieron entre 80 y 100 es: "+cont3+"\n");
        System.out.print("El total de postulantes es: "+total+"\n");
    }
    
}
