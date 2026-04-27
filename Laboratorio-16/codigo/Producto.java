/**
 *
 * @author AlisonLeon
 */
package Ejercicio05;

public class Producto {

    public void detallesPago(int cod){
        System.out.print("Código: "+cod+"\n");
    }

    public void detallesPago(String marca){
        System.out.print("Marca: "+marca+"\n");
    }

    public void detallesPago(double precio){
        System.out.print("Precio: "+precio+" soles\n");
    }

    public void detallesPago(double precio,char modelo,char talla){

        double inc=0,pf;

        if(modelo=='A' && talla=='S')
            inc=precio*0.03;
        else if(modelo=='A' && talla=='L')
            inc=precio*0.04;
        else if(modelo=='B')
            inc=precio*0.05;

        pf=precio+inc;

        System.out.print("Pago final: "+pf+" soles\n");
    }

}