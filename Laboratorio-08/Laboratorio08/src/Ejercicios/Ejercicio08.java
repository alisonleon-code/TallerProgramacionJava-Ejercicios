package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio08 {
    public static void main(String[] args) {
       int N,i,ginst,edad,mayor=0,cont1=0,cont2=0,cont3=0,cont4=0;
       Scanner scan=new Scanner(System.in);
       System.out.print("Ingresar cantidad de personas: "); 
       N=scan.nextInt();
       
       for(i=0;i<N;i++){
           System.out.print("Indique el grado de instrucción: [1]Primaria [2]Secundaria[3]Superior: ");
           ginst=scan.nextInt();
           if(ginst==1 || ginst==2 || ginst==3){
               System.out.print("Ingresar edad: ");
               edad=scan.nextInt();
               if(edad>0 && edad<120){
                        if(edad>mayor)
                           mayor=edad;
                        switch(ginst){
                            case 1: cont1++;break;
                            case 2: cont2++;break;
                            case 3: cont3++;
                                        if(edad!=35)
                                            cont4++;break;
                        }
               }else{
                   System.out.print("Edad incorrecta\n");
                   i--;
               }
           }else{
               System.out.print("Grado de instrucción incorrecta\n");
               i--;
           }
       }
       
       System.out.print("*************Resultado de la encuesta****************\n");
       System.out.println("La mayor edad de todas las personas es: "+mayor+" \n");
       System.out.println("La cantidad de personas con Primaria: "+cont1+" \n");
       System.out.println("La cantidad de personas con Secundaria: "+cont2+" \n");
       System.out.println("La cantidad de personas con Superior: "+cont3+" \n");
       System.out.println("La cantidad de personas con Superior y no tienen 35 años: "+cont4+" \n");
       System.out.print("****************************************************************\n");
    }
    
}
