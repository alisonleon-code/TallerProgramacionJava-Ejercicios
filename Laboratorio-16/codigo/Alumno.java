/**
 *
 * @author AlisonLeon
 */
package Ejercicio03;

public class Alumno {

    public void obtenerPosibilidades(String nom){
        System.out.print("Alumno: "+nom+"\n");
    }

    public void obtenerPosibilidades(int p1,int p2){
        int prom;
        prom=(p1+p2)/2;
        System.out.print("Promedio de prácticas: "+prom+"\n");
    }

    public void obtenerPosibilidades(double ep,double ef){
        double prom;
        prom=(ep+ef)/2;
        System.out.print("Promedio de exámenes: "+prom+"\n");
    }

}