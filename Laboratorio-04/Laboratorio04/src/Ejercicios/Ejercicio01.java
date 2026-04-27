
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio01 {
    
 public static void main(String[] args) {
    double n1,n2,r=0;
    char op;
    int bd=0; // bd inicia en 0
    Scanner scan=new Scanner(System.in);
    System.out.println("Ingresar primer número: ");
    n1=scan.nextDouble();
    System.out.println("Seleccione el operador [+][-][*][/]");
    op=scan.next().charAt(0);
    System.out.println("Ingresar segundo número: ");
    n2=scan.nextDouble();

    switch(op){
    case '+': r=n1+n2;break;
    case '-': r=n1-n2;break;
    case '*': r=n1*n2;break;
    case '/': if(n2!=0)
                  r=n1/n2;
             else{
                System.out.print("División irreal\n");
                bd=1;};break; // bd cambia a 1 ante un posible error de ingreso
            default: System.out.print("Operador invalido\n");
                bd=1; // bd cambia a 1 ante un posible error de ingreso
    }

    if(bd==0)
    System.out.println("El resultado de: "+n1+" "+op+" "+n2+" es: "+r);
    
    }
    
}
