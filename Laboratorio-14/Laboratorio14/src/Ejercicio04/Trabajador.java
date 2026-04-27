/**
 *
 * @author AlisonLeon
 */
package Ejercicio04;

public class Trabajador {

    private int con;
    private int est;

    public void setCon(int con){
        this.con=con;
    }

    public void setEst(int est){
        this.est=est;
    }

    double calcularSueldo(){
        double sueldo=0;

        switch(con){
            case 1: sueldo=800; break;
            case 2: sueldo=900; break;
            case 3: sueldo=1000; break;
        }

        return sueldo;
    }

    double calcularBonificacion(){
        double bono=0;

        switch(est){
            case 1: bono=100; break;
            case 2: bono=150; break;
        }

        return bono;
    }

    double calcularSueldoFinal(double sueldo,double bono){
        return sueldo+bono;
    }

    void mostrarResultados(double sueldo,double bono,double sf){
        System.out.print("Sueldo base: "+sueldo+"\n");
        System.out.print("Bonificación: "+bono+"\n");
        System.out.print("Sueldo final: "+sf+"\n");
    }

}