
/**
CalculadoraV (métodos void):
- No devuelve ningún valor.
- Los resultados se guardan en variables globales (atributos de la clase).
- El método solo ejecuta la operación, pero no “retorna” el resultado.
- Se necesita un método adicional para mostrar los resultados.
 
 * void = ejecuta acciones sin devolver datos.
 */

package Ejemplo01;

public class CalculadoraV {
    int s, r, m;
    double d;

    void sumar(int n1, int n2) {
        s = n1 + n2;
    }

    void restar(int n1, int n2) {
        r = n1 - n2;
    }

    void multiplicar(int n1, int n2) {
        m = n1 * n2;
    }

    void dividir(int n1, int n2) {
        d = n1 / n2;
    }

    void mostrarResultado() {
        System.out.println("Suma: " + s);
        System.out.println("Resta: " + r);
        System.out.println("Multiplicación: " + m);
        System.out.println("División: " + d);
    }
}