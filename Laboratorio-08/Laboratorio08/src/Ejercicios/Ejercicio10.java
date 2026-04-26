package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int N;
        int marca,puertas;

        double precio=0;
        double descuento=0;
        double pagoFinal;

        int toyota=0;
        int nissan=0;

        double descToyota2=0;
        double descToyota4=0;
        double descNissan2=0;
        double descNissan4=0;

        System.out.print("Cantidad de clientes: ");
        N=scan.nextInt();

        for(int i=0;i<N;i++){
            System.out.print("\nMarca [1]Toyota [2]Nissan: ");
            marca=scan.nextInt();

            System.out.print("Puertas [2]Dos [4]Cuatro: ");
            puertas=scan.nextInt();

            if(marca==1){

                toyota++;
                precio=50000;

                if(puertas==2){
                    descuento=precio*0.02;
                    descToyota2+=descuento;
                }

                else if(puertas==4){
                    descuento=precio*0.05;
                    descToyota4+=descuento;
                }

            }

            else if(marca==2){

                nissan++;
                precio=45000;

                if(puertas==2){
                    descuento=precio*0.04;
                    descNissan2+=descuento;
                }

                else if(puertas==4){
                    descuento=precio*0.07;
                    descNissan4+=descuento;
                }

            }

            pagoFinal=precio-descuento;

            System.out.println("\nPago final cliente: "+pagoFinal);

        }

        System.out.println("\n------ REPORTE FINAL ------");

        System.out.println("Autos Toyota vendidos: "+toyota);
        System.out.println("Autos Nissan vendidos: "+nissan);

        System.out.println("\nDescuentos Toyota 2 puertas: "+descToyota2);
        System.out.println("Descuentos Toyota 4 puertas: "+descToyota4);

        System.out.println("\nDescuentos Nissan 2 puertas: "+descNissan2);
        System.out.println("Descuentos Nissan 4 puertas: "+descNissan4);
    }
}