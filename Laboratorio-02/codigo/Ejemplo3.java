
package Ejemplos;
/**
 *
 * @author AlisonLeon
 */
import java.util.Date;// Esta clase permite trabajar con fechas y horas del sistema.
import java.util.Scanner;

public class Ejemplo3 {
 
    public static void main(String[] args) {
       String ape;
       Scanner scan=new Scanner(System.in);
       System.out.print("Ingresar el apellido del empleado: ");
       ape=scan.next();
       Date d=new Date();
       System.out.println("El empleado: "+ape+" ingresó hoy:");
       System.out.printf("%tD\n",d);
       System.out.println("a las :");
       System.out.printf("%tT\n",d);
    } 
}
