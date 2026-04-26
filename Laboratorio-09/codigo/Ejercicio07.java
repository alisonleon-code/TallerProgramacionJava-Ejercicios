
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio07 {

    public static void main(String[] args) {
       int N,i,cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,porc1,porc2,porc3,porc4,porc5;
       char Letra[]=new char[60];
       Scanner scan=new Scanner(System.in);
       System.out.print("Ingresar cantidad de letras: ");
        N=scan.nextInt();
        
        for(i=0;i<N;i++){
             System.out.print("Ingresar letras: ");
             Letra[i]=scan.next().charAt(0);
        }
        
        for(i=0;i<N;i++){
             switch(Letra[i]){
                 case 'a':
                 case 'A': cont1++;break;
                 case 'e':
                 case 'E': cont2++;break;
                 case 'i':
                 case 'I': cont3++;break;
                 case 'o':
                 case 'O': cont4++;break;
                 case 'u':
                 case 'U': cont5++;break;
             }
        }
        
        porc1=(cont1*100)/N;
        porc2=(cont2*100)/N;
        porc3=(cont3*100)/N;
        porc4=(cont4*100)/N;
        porc5=(cont5*100)/N;
        
        System.out.print("La cantidad de la vocal A es: "+cont1+" con un porcentaje de : "+porc1+"%\n");
        System.out.print("La cantidad de la vocal E es: "+cont2+" con un porcentaje de : "+porc2+"%\n");
        System.out.print("La cantidad de la vocal I es: "+cont3+" con un porcentaje de : "+porc3+"%\n");
        System.out.print("La cantidad de la vocal O es: "+cont4+" con un porcentaje de : "+porc4+"%\n");
        System.out.print("La cantidad de la vocal U es: "+cont5+" con un porcentaje de : "+porc5+"%\n");
        
    }
    
}
