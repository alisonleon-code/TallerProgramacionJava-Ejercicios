package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
      int mes=0,a,d=0;
      boolean bd=true;
      Scanner scan=new Scanner(System.in);
      System.out.print("Ingresar número del mes: ");
      mes=scan.nextInt();
      System.out.print("Ingresar año: ");
      a=scan.nextInt();
      
      switch(mes){
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 12: d=31;break;
          case 4:
          case 6:
          case 9:
          case 11: d=30;break;
          case 2: if(a%4==0)
                     d=29;
                  else
                     d=28;break;
        default: System.out.print("Mes incorrecto\n");
                 bd=false;
      }
      
      if(bd==true)
         System.out.println("El mes: "+mes+" tiene "+d+" días");
    }
    
}