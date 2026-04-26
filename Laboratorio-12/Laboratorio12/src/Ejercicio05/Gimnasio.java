package ejercicio05;

public class Gimnasio {
    double peso1 = 45.7;
    double peso2 = 67.8;
    double peso3 = 56.3;
    double promedio;

    public void calcularPromedio() {
        promedio = (peso1 + peso2 + peso3) / 3;

        System.out.println("Peso Alumno 1: " + peso1 + " kg");
        System.out.println("Peso Alumno 2: " + peso2 + " kg");
        System.out.println("Peso Alumno 3: " + peso3 + " kg");
        System.out.printf("El peso promedio es: %.2f kg\n", promedio); 
    }
}