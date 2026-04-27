/**
 *
 * @author AlisonLeon
 */
package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        int N,i;
        double prom;

        Scanner scan=new Scanner(System.in);

        Empleado e=new Empleado();

        System.out.print("Ingresar cantidad de empleados: ");
        N=scan.nextInt();

        for(i=0;i<N;i++){

            System.out.print("Ingresar sexo [M/F]: ");
            e.setSex(scan.next());

            System.out.print("Ingresar salario: ");
            e.setSal(scan.nextDouble());

            e.procesarDatos();
        }

        prom=e.calcularPromedio();

        System.out.print("Mayor salario: "+e.getMayor()+"\n");
        System.out.print("Menor salario: "+e.getMenor()+"\n");
        System.out.print("Promedio salarios: "+prom+"\n");
        System.out.print("Cantidad mujeres: "+e.getMujeres()+"\n");
        System.out.print("Cantidad varones: "+e.getHombres()+"\n");

    }

}