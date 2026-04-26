package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n,edad;
        double pago;
        double finalPago;

        double totalRango1=0;
        double totalRango2=0;
        double totalRango3=0;

        int sinDescuento=0;

        System.out.print("Cantidad de personas: ");
        n=scan.nextInt();

        for(int i=0;i<n;i++){

            System.out.print("\nIngrese edad: ");
            edad=scan.nextInt();

            System.out.print("Ingrese pago: ");
            pago=scan.nextDouble();


            if(edad>=10 && edad<=30){

                finalPago=pago-(pago*0.02);
                totalRango1+=finalPago;
            }

            else if(edad<=50){

                finalPago=pago-(pago*0.03);
                totalRango2+=finalPago;
            }

            else if(edad>=51){

                finalPago=pago-(pago*0.05);
                totalRango3+=finalPago;
            }

            else{

                // Personas sin descuento
                sinDescuento++;
            }

        }

        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Total recaudado rango 10-30: "+totalRango1);
        System.out.println("Total recaudado rango 31-50: "+totalRango2);
        System.out.println("Total recaudado rango 51 a mas: "+totalRango3);
        System.out.println("Personas sin descuento: "+sinDescuento);
    }
}