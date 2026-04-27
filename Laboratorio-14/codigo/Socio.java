/**
 *
 * @author AlisonLeon
 */
package Ejercicio08;

public class Socio {

    private int cat;
    private int edad;

    public void setCat(int cat){
        this.cat=cat;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    double calcularPagoMensual(){

        double pago=0;

        switch(cat){
            case 1: pago=200; break; // A
            case 2: pago=150; break; // B
            case 3: pago=100; break; // C
        }

        return pago;
    }

    double calcularDescuento(double pago){

        if(edad>55)
            return pago*0.20;
        else
            return 0;
    }

    double calcularPagoFinal(double pago,double des){
        return pago-des;
    }

    void mostrarResultados(double pago,double des,double pf){
        System.out.print("Pago mensual: "+pago+"\n");
        System.out.print("Descuento: "+des+"\n");
        System.out.print("Monto a pagar: "+pf+"\n");
    }

}