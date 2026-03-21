
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;


public class Ejercicio04 {

    public static void main(String[] args) {
     double pen,des=0,np;
     char cat;
     int bd=0;
     Scanner scan=new Scanner(System.in);
      System.out.print("Ingresar pensión del estudiante: ");
      pen=scan.nextDouble();
      System.out.print("Seleccione catagoría [A][B][C]: ");
      cat=scan.next().charAt(0);
      
      switch(cat){
          case 'A':
          case 'a':des=pen*0.02;break;
          case 'B':
          case 'b':des=pen*0.03;break;
          case 'C':
          case 'c':des=pen*0.04;break;
          default: System.out.print("Opción incorrecta\n");
                   bd=1;
      }
      
      np=pen-des;
      
      if(bd==0){
         System.out.print("El monto de descuento es: "+des+" soles\n");
         System.out.print("La nueva pensión es: "+np+" soles\n");
      }
    }
    
}
