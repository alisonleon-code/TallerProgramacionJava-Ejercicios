package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */

public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, cont=0;
        int edad, sexo;

        int ninos=0;
        int ninas=0;

        int conRegalo=0;
        int sinRegalo=0;

        int sumaEdades=0;

        char regalo;

        double promedioEdad;
        double porConRegalo;
        double porSinRegalo;


        System.out.print("Cantidad de asistentes: ");
        n=scan.nextInt();


        do{

            System.out.print("\nIngrese edad: ");
            edad=scan.nextInt();

            System.out.print("Sexo [1]Niño [2]Niña: ");
            sexo=scan.nextInt();

            System.out.print("¿Llevo regalo? [S/N]: ");
            regalo=scan.next().charAt(0);


            // Acumula edades
            sumaEdades+=edad;


            // Cuenta niños y niñas
            if(sexo==1){
                ninos++;
            }

            else if(sexo==2){
                ninas++;
            }


            // Cuenta quienes llevaron regalo
            if(regalo=='S' || regalo=='s'){
                conRegalo++;
            }

            else if(regalo=='N' || regalo=='n'){
                sinRegalo++;
            }

            cont++;

        }while(cont<n);



        promedioEdad=(double)sumaEdades/n;

        // Cálculo porcentajes
        porConRegalo=(double)conRegalo*100/n;
        porSinRegalo=(double)sinRegalo*100/n;



        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Promedio de edades: "+promedioEdad);
        System.out.println("Cantidad de niños: "+ninos);
        System.out.println("Cantidad de niñas: "+ninas);
        System.out.println("Porcentaje con regalo: "+porConRegalo+"%");
        System.out.println("Porcentaje sin regalo: "+porSinRegalo+"%");

    }

}