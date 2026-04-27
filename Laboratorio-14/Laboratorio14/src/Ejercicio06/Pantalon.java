/**
 *
 * @author AlisonLeon
 */
package Ejercicio06;

public class Pantalon {

    private int talla;
    private int cant;

    public void setTalla(int talla){
        this.talla=talla;
    }

    public void setCant(int cant){
        this.cant=cant;
    }

    double calcularCompra(){

        double precio=0;

        switch(talla){
            case 1: precio=50; break; // Small
            case 2: precio=60; break; // Medium
            case 3: precio=70; break; // Large
        }

        return precio*cant;
    }

    double calcularDescuento(double compra){

        double des=0;

        if(cant>=1 && cant<=10)
            des=compra*0.02;

        else if(cant>=11 && cant<=16)
            des=compra*0.08;

        else if(cant>=17 && cant<=20)
            des=compra*0.10;

        return des;
    }

    double calcularPagoFinal(double compra,double des){
        return compra-des;
    }

    void mostrarResultados(double compra,double des,double pf){
        System.out.print("Monto de compra: "+compra+"\n");
        System.out.print("Descuento: "+des+"\n");
        System.out.print("Monto final: "+pf+"\n");
    }

}