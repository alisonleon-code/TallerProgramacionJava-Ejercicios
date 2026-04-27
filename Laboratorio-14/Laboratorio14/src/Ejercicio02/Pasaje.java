/**
 *
 * @author AlisonLeon
 */
package Ejercicio02;

public class Pasaje {

    private int des; // destino
    private int cant; // cantidad pasajes

    public void setDes(int des){
        this.des=des;
    }

    public void setCant(int cant){
        this.cant=cant;
    }

    public int getCant(){
        return cant;
    }

    double calcularPrecioInicial(){
        double pi=0;

        switch(des){
            case 1: pi=cant*184; break; // Francia
            case 2: pi=cant*139.7; break; // Italia
            case 3: pi=cant*127.4; break; // Grecia
        }

        return pi;
    }

    double calcularDescuento(double pi){
        double desc;

        if(cant<5)
            desc=pi*0.15;
        else
            desc=pi*0.20;

        return desc;
    }

    double calcularTotal(double pi,double desc){
        return pi-desc;
    }

    void mostrarResultados(double pi,double desc,double total){
        System.out.print("Precio inicial: "+pi+"\n");
        System.out.print("Descuento: "+desc+"\n");
        System.out.print("Total a pagar: "+total+"\n");
    }

}