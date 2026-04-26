package ejercicio08;

public class Estatura {

    double pies = 3;
    double pulgadas = 4;

    double PULGADAS_POR_PIE = 12;
    double CM_POR_PULGADA = 2.54;
    double CM_POR_METRO = 100.0;

    public void convertirAMetros() {
        double totalPulgadas = (pies * PULGADAS_POR_PIE) + pulgadas;
        double totalCentimetros = totalPulgadas * CM_POR_PULGADA;
        double totalMetros = totalCentimetros / CM_POR_METRO;

        System.out.println("Medida original: " + (int)pies + " pies y " + (int)pulgadas + " pulgadas");
        System.out.println("Total en pulgadas: " + totalPulgadas + " in");
        System.out.println("Equivalencia en centímetros: " + totalCentimetros + " cm");
        System.out.println("RESULTADO FINAL: " + totalMetros + " metros");
    }
}