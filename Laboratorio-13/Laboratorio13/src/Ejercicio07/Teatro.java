/**
 *
 * @author AlisonLeon
 */

package Ejercicio07;

public class Teatro {

    double calcularPago(int dia,int cant){

        double tarifa=0;

        switch(dia){
            case 1: tarifa=23.5; break;
            case 2: tarifa=33.5; break;
            case 3: tarifa=38.5; break;
        }

        return tarifa*cant;
    }


    double calcularDescuento(int cant,double pago){

        double des=0;

        if(cant>=15)
           des=pago*0.02;

        return des;
    }


    double calcularTotal(double pago,double des){
        return pago-des;
    }


    void mostrarResultados(double pago,double des,double total){

        System.out.println("Pago bruto: "+pago+" soles");
        System.out.println("Descuento: "+des+" soles");
        System.out.println("Total a pagar: "+total+" soles");

    }

}