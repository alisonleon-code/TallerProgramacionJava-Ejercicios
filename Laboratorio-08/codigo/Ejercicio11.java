package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N,M;
        int nac;

        double salto;
        double suma;
        double prom;

        double menorProm=999;

        String ultimoLugar="";

        System.out.print("Cantidad de atletas: ");
        N=scan.nextInt();

        System.out.print("Cantidad de saltos por atleta: ");
        M=scan.nextInt();

        for(int i=0;i<N;i++){

            System.out.print("\nNacionalidad [1]Nacional [2]Extranjero: ");
            nac=scan.nextInt();

            suma=0;

            for(int j=0;j<M;j++){

                System.out.print("Ingrese salto: ");
                salto=scan.nextDouble();

                suma+=salto;
            }

            prom=suma/M;

            System.out.println("Promedio atleta: "+prom);

            // Último lugar (menor promedio)
            if(prom<menorProm){
                menorProm=prom;

                if(nac==1){
                    ultimoLugar="Nacional";
                }
                else{
                    ultimoLugar="Extranjero";
                }

            }

        }

        System.out.println("\n------ RESULTADO FINAL ------");
        System.out.println("Nacionalidad del ultimo lugar: "+ultimoLugar);
        System.out.println("Promedio mas bajo: "+menorProm);

    }

}