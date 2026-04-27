/**
 *
 * @author AlisonLeon
 */
package Ejemplo01;

public class Rectangulo {

    int largo;
    int ancho;

    public Rectangulo() {
    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int calcularArea() {
        int res;
        res = largo * ancho;
        return res;
    }
}
