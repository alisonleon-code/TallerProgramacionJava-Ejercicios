/**
 *
 * @author AlisonLeon
 */
package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        int e,tser;
        double pm,inc,pt;

        Scanner scan=new Scanner(System.in);

        System.out.print("Seleccione servicio [1]Comida [2]Sauna [3]Hospedaje: ");
        tser=scan.nextInt();

        System.out.print("Ingresar pago mensual: ");
        pm=scan.nextDouble();

        System.out.print("Ingresar edad del socio: ");
        e=scan.nextInt();

        Club c=new Club();

        inc=c.calcularIncremento(tser,pm);

        if(inc>0){
            pt=c.calcularPagoTotal(e,pm,inc);
            c.mostrarResultados(inc,pt);
        }
        else
            System.out.println("Tipo de servicio incorrecto");

    }

}