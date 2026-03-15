
package Ejercicios;
/**
 *
 * @author AlisonLeon
 */
import java.util.Scanner;

public class Ejercicio06 {
 
    public static void main(String[] args) {
        int num,a,b,c,d,nr;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingresar número de 4 cifras: ");
        num = scan.nextInt();
        a = num/1000;
        num = num%1000;
        b = num/100;
        num = num%100;
        c = num/10;
        d = num%10;
        nr=d*1000+c*100+b*10+a;
        System.out.println("El número al revés es: "+nr);
    }
    
}
