/**
 *
 * @author AlisonLeon
 */
package Ejercicio06;

public class Vehiculo {

    double calcularImpuesto(int ant, double cost) {
        double imp;
        if (ant >= 1 && ant <= 4) {
            imp = 0;
        } else if (ant >= 5 && ant <= 9) {
            imp = cost * 0.02;
        } else if (ant >= 10 && ant <= 15) {
            imp = cost * 0.04;
        } else {
            imp = cost * 0.06;
        }
        return imp;
    }

    double calcularCostofinal(double cost, double imp, int mar) {
        int des = 0;
        double cf;
        if (mar == 1) {
            des = 200;
        } else if (mar == 2) {
            des = 0;
        }
        cf = cost + imp - des;
        return cf;
    }

    void mostrarResultados(double imp, double cf) {
        System.out.print("El monto de impuesto es: " + imp + " soles\n");
        System.out.print("El costo final del vehículo es: " + cf + " soles\n");
    }
}
