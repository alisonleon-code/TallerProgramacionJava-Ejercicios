package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int marca,cantidad;
        int numBoleta=1;
        int opc;

        String apellido;

        double pago=0;
        double dolares;
        double totalRecaudado=0;

        do{

            System.out.print("\nApellido cliente: ");
            apellido=scan.next();

            System.out.println("\nMarcas");
            System.out.println("[1] Nokia");
            System.out.println("[2] Motorola");
            System.out.println("[3] Sony");
            System.out.println("[4] Samsung");

            System.out.print("Seleccione marca: ");
            marca=scan.nextInt();

            System.out.print("Cantidad celulares: ");
            cantidad=scan.nextInt();

            switch(marca){
                case 1:
                    pago=cantidad*69;
                    break;

                case 2:
                    pago=cantidad*98;
                    break;

                case 3:
                    pago=cantidad*127;
                    break;

                case 4:
                    pago=cantidad*131;
                    break;

                default:
                    pago=0;
                    System.out.println("Marca incorrecta");
            }

            // Conversión a dólares
            dolares=pago/3.28;

            totalRecaudado+=pago;

            System.out.println("\n------ BOLETA DE PAGO ------");
            System.out.println("Boleta N°: "+numBoleta);
            System.out.println("Cliente: "+apellido);
            System.out.println("Pago en soles: S/. "+pago);
            System.out.println("Pago en dolares: $ "+dolares);

            numBoleta++;

            System.out.print("\n¿Cerrar caja? [1]No [2]Si: ");
            opc=scan.nextInt();

        }while(opc==1);

        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Total recaudado: S/. "+totalRecaudado);

    }

}