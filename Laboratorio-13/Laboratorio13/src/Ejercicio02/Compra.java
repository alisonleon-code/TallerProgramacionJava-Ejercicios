/**
 *
 * @author AlisonLeon
 */
package Ejercicio02;

public class Compra {

    double calcularDescuento(double monto){
        double des=0;

        if(monto>=100 && monto<=250)
            des=monto*0.03;
        else if(monto<=500)
            des=monto*0.05;
        else
            des=monto*0.10;

        return des;
    }

    double calcularImpuesto(double montoDescontado, char rubro){
        double imp=0;

        if(rubro=='C' || rubro=='c')
            imp=montoDescontado*0.15;

        if(rubro=='A' || rubro=='a')
            imp=montoDescontado*0.30;

        return imp;
    }

    double calcularPagoTotal(double monto,double des,double imp){
        return (monto-des)+imp;
    }

    void mostrarBoleta(double monto,double des,double imp,double total){
        System.out.println("\n***** BOLETA DE COMPRA *****");
        System.out.println("Monto compra: S/."+monto);
        System.out.println("Descuento: S/."+des);
        System.out.println("Impuesto: S/."+imp);
        System.out.println("-------------------");
        System.out.println("Pago Total: S/."+total);
    }

}