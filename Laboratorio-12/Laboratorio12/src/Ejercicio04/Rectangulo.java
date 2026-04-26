package ejercicio04;

public class Rectangulo {
    double base = 4;
    double altura = 7;
    double area, perimetro;

    public void mostrarCalculos() {
        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("Base: " + base + " | Altura: " + altura);
        System.out.println("El Área es: " + area);
        System.out.println("El Perímetro es: " + perimetro);

    }
}