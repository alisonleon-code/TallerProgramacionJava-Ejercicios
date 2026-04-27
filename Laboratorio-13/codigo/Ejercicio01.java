/**
 *
 * @author AlisonLeon
 */

package Ejercicio01;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
       
       String ape;//apellido como string
       int mes,ht,falt;// entero mes, horas trabajadas, faltas
       double tar,sb,des,sn;////calculos
    
        Scanner scan=new Scanner(System.in);//scaner del mismo java
        
        //ingreso de datos
        System.out.print("Ingresar apellido del empleado: ");
        ape=scan.next();
        System.out.print("Ingresar numero del mes: ");
        mes=scan.nextInt();
        System.out.print("Ingresar horas trabajadas: ");
        ht=scan.nextInt();
        System.out.print("Ingresar tarifa: ");
        tar=scan.nextDouble();
        System.out.print("Ingresar nùmero de faltas: ");
        falt=scan.nextInt();
        
        //llamar a la clase Empleado
        Empleado e=new Empleado();
        
        sb=e.calcularSueldobruto(ht,tar);//sbueldobase
        des=e.calcularDescuento(falt);
        sn=e.calcularSueldoneto(sb,des);
        e.mostrarBoleta(ape, mes, sb, des, sn);
    }
    
}
