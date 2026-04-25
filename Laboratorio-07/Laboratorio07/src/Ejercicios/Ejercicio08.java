package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int marca;
        boolean bd=true;

        int nissan=0;
        int toyota=0;
        int kia=0;
        int otras=0;

        int total=0;

        double porNissan;
        double porToyota;
        double porKia;
        double porOtras;


        do{

            System.out.println("\nMarca:");
            System.out.println("[1] Nissan");
            System.out.println("[2] Toyota");
            System.out.println("[3] Kia");
            System.out.println("[4] Otras");
            System.out.println("Otra opcion para salir");

            System.out.print("Seleccione marca: ");
            marca=scan.nextInt();

            switch(marca){

                case 1:
                    nissan++;
                    total++;
                    break;

                case 2:
                    toyota++;
                    total++;
                    break;

                case 3:
                    kia++;
                    total++;
                    break;

                case 4:
                    otras++;
                    total++;
                    break;

                default:
                    System.out.println("Fin del programa");
                    bd=false;
            }

        }while(bd==true);

        if(total>0){

            // Cálculo porcentajes
            porNissan=(double)nissan*100/total;
            porToyota=(double)toyota*100/total;
            porKia=(double)kia*100/total;
            porOtras=(double)otras*100/total;


            System.out.println("\n------ REPORTE FINAL ------");
            System.out.println("Autos Nissan: "+nissan);
            System.out.println("Autos Toyota: "+toyota);
            System.out.println("Autos Kia: "+kia);
            System.out.println("Otras marcas: "+otras);

            System.out.println("\nPorcentaje Nissan: "+porNissan+"%");
            System.out.println("Porcentaje Toyota: "+porToyota+"%");
            System.out.println("Porcentaje Kia: "+porKia+"%");
            System.out.println("Porcentaje Otras: "+porOtras+"%");
        }

    }

}