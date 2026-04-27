
/**
CalculadoraR (métodos con return):
- Cada método devuelve un valor (int).
- Usa variables locales dentro de cada método.
- Los resultados se retornan directamente a la clase main.
- Es más flexible y reutilizable porque los valores pueden usarse en otras operaciones.
 
 * return = ejecuta y devuelve resultados.
 */
package Ejemplo02;

public class CalculadoraR {
    
    int calcularSuma(int n1,int n2){
       int s;// variable local
        s=n1+n2;
        return s;
    }
    
    int calcularResta(int n1,int n2){
       int r;
       r=n1-n2;
       return r;
    }
    
    int calcularMultiplicar(int n1,int n2){
       int m;
       m=n1*n2;
       return m;
    }
    
    int calcularDividir(int n1,int n2){
       int d;
       d=n1/n2;
       return d;
    }
    
    void mostrarResultado(int s,int r,int m,int d){
       System.out.print("La suma es: "+s+"\n");
       System.out.print("La resta es: "+r+"\n");
       System.out.print("La multiplicaciòn es: "+m+"\n");
       System.out.print("La divisiòn es: "+d+"\n");
    }
}
