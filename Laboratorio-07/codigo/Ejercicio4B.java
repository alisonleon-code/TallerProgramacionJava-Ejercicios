package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio4B {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, contg = 0, sexo, pesoMayorHombre = 0, alturaMenorMujer = 0, hombre = 0, mujer = 0;
        double peso, altura, AlturaHombre = 0, PesoMujer = 0,promedioh,promediom;
        System.out.print("Cantidad de personas: ");
        n = scan.nextInt();
        do{
            System.out.println("Sexo: [1]Varòn [2]Mujer");
            sexo = scan.nextInt();
            System.out.print("Peso (kg): ");
            peso = scan.nextDouble();
            System.out.print("Altura (m): ");
            altura = scan.nextDouble();
            
            switch(sexo){
                case 1:if (peso > 84)
                          pesoMayorHombre++;
                          AlturaHombre += altura;
                          hombre++;break;
                case 2: if (altura < 1.56)
                              alturaMenorMujer++;
                              PesoMujer += peso;
                            mujer++;break;  
            }
            contg++;
        }while(contg < n);
        promedioh=AlturaHombre/hombre;
        promediom=PesoMujer/=mujer;
        System.out.println("Varones que pesan màs de 84 kilos: "+pesoMayorHombre);
        System.out.println("Mujeres que miden menos de 1.56 metros: "+alturaMenorMujer);
        System.out.println("Promedio del peso de las mujeres: "+promediom);
        System.out.println("Promedio de la altura de los hombres: "+promedioh);
    }
    
}
