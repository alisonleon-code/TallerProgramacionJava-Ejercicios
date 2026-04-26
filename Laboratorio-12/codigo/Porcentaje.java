package ejemplo01;

public class Porcentaje { 
    // Atributos 
    int num = 450;   
    double inte = 0.10, por; 

    // Método calcularPorcentaje
    public void calcularPorcentaje() {   
        por = num * inte; 
        System.out.println("El " + (inte * 100) + "% de " + num + " es: " + por); 
    } 
}