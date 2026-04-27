/**
 *
 * @author AlisonLeon
 */
package Ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        int mar, ant;
        double cost, imp, cf;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresar costo del vehículo: ");
        cost = scan.nextDouble();
        System.out.print("Ingresar los años de antiguedad: ");
        ant = scan.nextInt();
        System.out.print("Indique si es Nissan [1]Si[2]No: ");
        mar = scan.nextInt();
        Vehiculo v = new Vehiculo();
        imp = v.calcularImpuesto(ant, cost);
        cf = v.calcularCostofinal(cost, imp, mar);
        v.mostrarResultados(imp, cf);

    }

}
