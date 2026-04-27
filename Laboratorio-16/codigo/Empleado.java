/**
 *
 * @author AlisonLeon
 */
package Ejercicio02;

public class Empleado {

    public void boletaEmpleado(String nom){
        System.out.print("Empleado: "+nom+"\n");
    }

    public void boletaEmpleado(double peso,double talla){
        System.out.print("Peso: "+peso+" kg\n");
        System.out.print("Talla: "+talla+" m\n");
    }

    public void boletaEmpleado(double sueldo){
        sueldo=sueldo+(sueldo*0.03);
        System.out.print("Sueldo final con aumento: "+sueldo+" soles\n");
    }

}