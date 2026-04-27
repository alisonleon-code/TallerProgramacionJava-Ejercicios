/**
 *
 * @author AlisonLeon
 */
package Ejercicio04;

public class Cliente {

    public void calcularTarifa(String nom){
        System.out.print("Cliente: "+nom+"\n");
    }

    public double calcularTarifa(int min){
        double pago;
        pago=min*0.30;
        return pago;
    }

    public double calcularTarifa(double pago,char zona){
        double des=0;

        switch(zona){
            case 'A': des=pago*0.02; break;
            case 'B': des=pago*0.03; break;
            case 'C': des=pago*0.04; break;
        }

        return pago-des;
    }

    public void calcularTarifa(double total){
        System.out.print("Total a pagar: "+total+" soles\n");
    }

}