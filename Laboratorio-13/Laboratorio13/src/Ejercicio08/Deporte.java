/**
 *
 * @author AlisonLeon
 */
package Ejercicio08;

public class Deporte {

    double calcularIncremento(int tipo,double pago){

        double inc=0;

        switch(tipo){
            case 1: inc=pago*0.02; break;
            case 2: inc=pago*0.03; break;
            case 3: inc=pago*0.05; break;
        }

        return inc;
    }


    double incrementoExtra(int veces,double pago){

        double extra=0;

        if(veces>3)
           extra=pago*0.01;

        return extra;
    }


    double calcularPagoTotal(double pago,double inc,double extra){
        return pago+inc+extra;
    }


    void mostrarResultados(double inc,double extra,double total){

        System.out.println("Incremento por deporte: "+inc+" soles");
        System.out.println("Incremento adicional: "+extra+" soles");
        System.out.println("Pago total: "+total+" soles");

    }

}