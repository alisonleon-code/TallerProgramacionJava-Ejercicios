/**
 *
 * @author AlisonLeon
 */
package Ejercicio03;

public class Numero {

    int primerDigito(int n){
        return n/10000;
    }

    int tercerDigito(int n){
        return (n/100)%10;
    }

    int ultimoDigito(int n){
        return n%10;
    }

    int sumaDigitos(int a,int b,int c){
        return a+b+c;
    }

    void mostrarResultado(int p,int t,int u,int suma){
        System.out.println("\nPrimer dígito: "+p);
        System.out.println("Tercer dígito: "+t);
        System.out.println("Último dígito: "+u);
        System.out.println("Suma: "+suma);
    }

}