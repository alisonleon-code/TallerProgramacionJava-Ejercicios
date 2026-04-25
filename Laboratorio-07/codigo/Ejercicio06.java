package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contIntentos;
        double distancia;
        double suma;
        double promedio;
        double mayorPromedio=0;
        String nombre;
        String ganador="";
        do{
            System.out.print("\nIngrese nombre del deportista: ");
            nombre=scan.next();

            suma=0;
            contIntentos=0;
            do{
                System.out.print("Ingrese distancia del salto: ");
                distancia=scan.nextDouble();
                // Finaliza si distancia inválida
                if(distancia<0.5){
                    break;
                }
                // Acumula los 5 intentos
                suma+=distancia;
                contIntentos++;
            }while(contIntentos<5);
            if(distancia<0.5){
                break;
            }
            promedio=suma/5;
            // Busca mejor promedio
            if(promedio>mayorPromedio){
                mayorPromedio=promedio;
                ganador=nombre;
            }
            System.out.println("Salto promedio de "+nombre+" : "+promedio+" m");
        }while(distancia>=0.5);

        System.out.println("\n------ RESULTADO FINAL ------");
        System.out.println("Ganador: "+ganador);
        System.out.println("Mejor salto promedio: "+mayorPromedio+" m");

    }

}