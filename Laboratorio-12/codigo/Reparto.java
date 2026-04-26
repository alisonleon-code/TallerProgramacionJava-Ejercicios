package ejercicio02;

public class Reparto {
    double montoTotal = 6000;
    int edad1 = 18;
    int edad2 = 24;
    int edad3 = 32;
    
    double pago1, pago2, pago3;

    public void realizarReparto() {
        int sumaEdades = edad1 + edad2 + edad3;
        
        // Fórmula: (Edad * Monto) / Suma de Edades
        pago1 = (edad1 * montoTotal) / sumaEdades;
        pago2 = (edad2 * montoTotal) / sumaEdades;
        pago3 = (edad3 * montoTotal) / sumaEdades;

        System.out.println("Monto total a repartir: S/ " + montoTotal);
        System.out.println("Suma total de edades: " + sumaEdades);
        System.out.println("Monto Persona 1 (" + edad1 + " años): S/ " + pago1);
        System.out.println("Monto Persona 2 (" + edad2 + " años): S/ " + pago2);
        System.out.println("Monto Persona 3 (" + edad3 + " años): S/ " + pago3);

    }
}