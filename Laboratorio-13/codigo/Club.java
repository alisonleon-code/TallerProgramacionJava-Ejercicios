/**
 *
 * @author AlisonLeon
 */
package Ejercicio04;

public class Club {

    double calcularIncremento(int tser,double pm){
        double inc=0;

        switch(tser){
            case 1: inc=pm*0.05; break;
            case 2: inc=pm*0.07; break;
            case 3: inc=pm*0.09; break;
        }

        return inc;
    }


    double calcularPagoTotal(int edad,double pm,double inc){

        double des,pt;

        if(edad>60)
            des=(pm+inc)*0.02;
        else
            des=0;

        pt=pm+inc-des;

        return pt;
    }


    void mostrarResultados(double inc,double pt){

        System.out.println("Monto de incremento: "+inc+" soles");
        System.out.println("Pago total: "+pt+" soles");

    }

}