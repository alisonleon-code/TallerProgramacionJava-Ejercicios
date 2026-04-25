package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio03 {

    public static void main(String[] args) {

        int cat,cant,preg;
        int suma1=0,suma2=0,suma3=0,total;

        Scanner scan = new Scanner(System.in);

        do{

            System.out.print("Indique categoria [1]Infantil [2]Adulto [3]Adulto Mayor: ");
            cat=scan.nextInt();

            System.out.print("Ingrese cantidad de asistentes: ");
            cant=scan.nextInt();

            switch(cat){

                case 1:
                    suma1 += cant*15;
                    break;

                case 2:
                    suma2 += cant*35;
                    break;

                case 3:
                    suma3 += cant*25;
                    break;

                default:
                    System.out.println("Categoria incorrecta");
            }

            System.out.print("¿Desea registrar otra venta? [1]Si [2]No: ");
            preg=scan.nextInt();

        }while(preg==1);


        total=suma1+suma2+suma3;


        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Ganancia categoria Infantil: "+suma1+" soles");
        System.out.println("Ganancia categoria Adulto: "+suma2+" soles");
        System.out.println("Ganancia categoria Adulto Mayor: "+suma3+" soles");
        System.out.println("Ganancia total del teatro: "+total+" soles");
        System.out.println("----------------------------");

    }

}