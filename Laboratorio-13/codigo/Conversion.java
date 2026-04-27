/**
 *
 * @author AlisonLeon
 */
package Ejercicio05;

public class Conversion {

    double convertirCentimetros(double m){
        return m*100;
    }

    double convertirKilometros(double m){
        return m/1000;
    }

    double convertirPulgadas(double m){
        return (m*100)/2.54;
    }

    void mostrarResultados(double cm,double km,double pul){
        System.out.println("\nConversiones:");
        System.out.println("Centímetros: "+cm);
        System.out.println("Kilómetros: "+km);
        System.out.println("Pulgadas: "+pul);
    }

}