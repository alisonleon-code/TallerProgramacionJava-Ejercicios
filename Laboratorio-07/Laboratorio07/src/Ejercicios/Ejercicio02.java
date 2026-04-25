package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio02 {

    public static void main(String[] args) {

        String nacionalidad;
        String nacMayor="";
        char op;

        double estatura;
        double mayor=0;

        int contMenores=0;

        Scanner scan = new Scanner(System.in);

        do{

            System.out.print("Ingrese nacionalidad del deportista: ");
            nacionalidad=scan.next();

            System.out.print("Ingrese estatura: ");
            estatura=scan.nextDouble();

            if(estatura>mayor){
                mayor=estatura;
                nacMayor=nacionalidad;
            }

            if(estatura<1.60){
                contMenores++;
            }

            System.out.print("¿Desea registrar otro deportista? (S/N): ");
            op=scan.next().charAt(0);

        }while(op=='S' || op=='s');


        System.out.println("\n--------- REPORTE FINAL ---------");
        System.out.println("Nacionalidad del deportista mas alto: "+nacMayor);
        System.out.println("Estatura mayor registrada: "+mayor);
        System.out.println("Deportistas menores de 1.60m: "+contMenores);
        System.out.println("---------------------------------");

    }

}