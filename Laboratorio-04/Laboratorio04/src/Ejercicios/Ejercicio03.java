
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio03 {

    
  public static void main(String[] args) {
    int nc,dest;
    double cost,inte=0,mf;
    boolean bd=true;
     Scanner scan=new Scanner(System.in);
      System.out.print("Seleccione destino [1]Nacional[2]Internacional: ");
      dest=scan.nextInt();
      System.out.print("Ingresar el número de ciudades: ");
      nc=scan.nextInt();
      System.out.print("Ingresar costo del paquete turístico: ");
      cost=scan.nextDouble();
      
      switch(dest){
          case 1: if(nc>=1 && nc<=3)
                     inte=cost*0.03;
                  else if(nc>=4 && nc<=8)
                          inte=cost*0.04;
                       else
                           inte=cost*0.08;break;
          case 2: if(nc>=1 && nc<=3)
                     inte=cost*0.05;
                  else if(nc>=4 && nc<=8)
                          inte=cost*0.06;
                       else
                           inte=cost*0.10;break;
          default: System.out.print("Destino incorrecto\n");
                   bd=false;
      }
      
      mf=cost+inte;
      if(bd==true){
         System.out.print("El monto de interés es: "+inte+" soles\n");
         System.out.print("El total a pagar es: "+mf+" soles\n");
      }
    }
    
}
