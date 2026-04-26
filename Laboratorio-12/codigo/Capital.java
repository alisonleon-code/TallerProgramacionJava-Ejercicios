package ejercicio01;

public class Capital {
    // Atributos
    double c1 = 500;   // Pedro (Dólares)
    double c2 = 750;   // María (Dólares)
    double c3 = 3500;  // Juan (Soles)
    double t, p1, p2, p3;

    public void calcularCapital() {

        double c3Dolares = c3 / 3.50;
        
        // Capital Total
        t = c1 + c2 + c3Dolares;
        
        // Cálculo de porcentajes
        p1 = (c1 * 100) / t;
        p2 = (c2 * 100) / t;
        p3 = (c3Dolares * 100) / t;

        System.out.println("Total del capital: $ " + t);
        System.out.println("Porcentaje Pedro: " + p1 + " %");
        System.out.println("Porcentaje Maria: " + p2 + " %");
        System.out.println("Porcentaje Juan: " + p3 + " %");

    }
}