
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;


public class Ejercicio10 {

  
    public static void main(String[] args) {
        int mtrans,dest;
        double ton,p=0;
        boolean bd=true;
     Scanner scan=new Scanner(System.in);
      System.out.print("Seleccione medio de transporte [1]Aéreo[2]Marítimo: ");
      mtrans=scan.nextInt();
      System.out.print("Seleccione destino [1]Norte[2]Sur[3]Centro: ");
      dest=scan.nextInt();
      System.out.print("Ingresar toneladas: ");
      ton=scan.nextDouble();
      
      switch(mtrans){
          case 1:switch(dest){
                   case 1: p=ton*30;break;
                   case 2: p=ton*25;break;
                   case 3: p=ton*20;break; 
                   default:System.out.print("Destino incorrecto\n");
                            bd=false;
                };break;
          case 2:switch(dest){
                   case 1: p=ton*25;break;
                   case 2: p=ton*20;break;
                   case 3: p=ton*15;break; 
                   default:System.out.print("Destino incorrecto\n");
                            bd=false;
                };break;
          default: System.out.print("Medio de transporte incorrecto\n");
                            bd=false;             
      }
      
      if(bd==true)
          System.out.print("El monto a pagar es: "+p+" soles\n");
    }
    
}
