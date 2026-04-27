/**
 *
 * @author AlisonLeon
 */
package Ejercicio01;

public class Empleado {
    //calcular sueldo
    
    double calcularSueldobruto(int ht,double tar){
        
        double sb;
        //sbueldobase = horas trabajadas* tarifa
          sb=ht*tar;
        return sb;//sbueldobase
    }
    //descuento
    
    double calcularDescuento(int falt){
        double des;
          des=falt*12.3;
        return des;
    }
    
    double calcularSueldoneto(double sb,double des){
         double sn;
            sn=sb-des;
         return sn;
    }
    
    void mostrarBoleta(String ape,int mes,double sb,double des,double sn){
       System.out.print("*******Boleta de pago******\n");
       System.out.print("Apellido: "+ape+"\n");
       System.out.print("Nª mes: "+mes+"\n");
       System.out.print("Sueldo bruto: "+sb+" soles\n");
       System.out.print("Descuento: "+des+" soles\n");
       System.out.print("--------------------------\n");
       System.out.print("Sueldo neto: "+sn+" soles\n");
    }
}
