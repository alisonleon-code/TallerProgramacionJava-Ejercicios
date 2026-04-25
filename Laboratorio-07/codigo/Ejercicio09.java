package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nombre;
        long ruc;

        int tipo,kilos,opc;

        int contCana=0;
        int contRemolacha=0;
        int contEstevia=0;

        double pagoBruto=0;
        double igv;
        double pagoNeto;


        do{

            System.out.print("\nIngrese RUC: ");
            ruc=scan.nextLong();

            System.out.print("Ingrese nombre cliente: ");
            nombre=scan.next();

            System.out.println("\nTipo Azucar");
            System.out.println("[1] Caña de azucar");
            System.out.println("[2] Remolacha");
            System.out.println("[3] Estevia");

            System.out.print("Seleccione tipo: ");
            tipo=scan.nextInt();

            System.out.print("Cantidad de kilos: ");
            kilos=scan.nextInt();


            switch(tipo){

                case 1:
                    pagoBruto=kilos*3.25;
                    contCana++;
                    break;

                case 2:
                    pagoBruto=kilos*4.75;
                    contRemolacha++;
                    break;

                case 3:
                    pagoBruto=kilos*6.85;
                    contEstevia++;
                    break;

                default:
                    pagoBruto=0;
                    System.out.println("Tipo incorrecto");
            }


            igv=pagoBruto*0.19;
            pagoNeto=pagoBruto+igv;


            System.out.println("\n------ FACTURA ------");
            System.out.println("Cliente: "+nombre);
            System.out.println("RUC: "+ruc);
            System.out.println("Pago bruto: S/."+pagoBruto);
            System.out.println("IGV: S/."+igv);
            System.out.println("Pago neto: S/."+pagoNeto);


            System.out.print("\n¿Registrar otra venta? [1]Si [2]No: ");
            opc=scan.nextInt();

        }while(opc==1);



        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Clientes que compraron Caña: "+contCana);
        System.out.println("Clientes que compraron Remolacha: "+contRemolacha);
        System.out.println("Clientes que compraron Estevia: "+contEstevia);

    }

}