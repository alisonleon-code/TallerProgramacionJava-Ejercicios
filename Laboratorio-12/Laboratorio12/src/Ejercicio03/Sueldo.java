package ejercicio03;

public class Sueldo {
    int sueldoTotal = 7531;

    public void desglosarBilletes() {
        int resto = sueldoTotal;
        
        int b100 = resto / 100; 
        resto = resto % 100;
        
        int b50 = resto / 50;   
        resto = resto % 50;
        
        int b20 = resto / 20;   
        resto = resto % 20;
        
        int b10 = resto / 10;   
        resto = resto % 10;
        
        int b5 = resto / 5;     
        resto = resto % 5;
        
        int m1 = resto; // Lo que queda son monedas de 1

        System.out.println("Sueldo a pagar: S/ " + sueldoTotal);
        System.out.println("Billetes de 100: " + b100);
        System.out.println("Billetes de 50: " + b50);
        System.out.println("Billetes de 20: " + b20);
        System.out.println("Billetes de 10: " + b10);
        System.out.println("Billetes de 5: " + b5);
        System.out.println("Monedas de 1: " + m1);

    }
}