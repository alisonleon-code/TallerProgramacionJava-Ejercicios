package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String apellido, esp;
        String cardioMayor = "";
        String pediaMenor = "";

        int anios;
        int mayorCardio = 0;
        int menorPedia = 999;

        int sumaCardio = 0;
        int sumaPedia = 0;

        int contCardio = 0;
        int contPedia = 0;

        boolean bd = true;

        do{
            System.out.print("\nIngrese apellido: ");
            apellido = scan.next();

            System.out.print("Especialidad [cardiologia/pediatria]: ");
            esp = scan.next();

            System.out.print("Años de experiencia: ");
            anios = scan.nextInt();
            
            if(esp.equalsIgnoreCase("cardiologia")){

                // Busca mayor experiencia en cardiología
                if(anios > mayorCardio){
                    mayorCardio = anios;
                    cardioMayor = apellido;
                }

                // Acumula para promedio
                sumaCardio += anios;
                contCardio++;
            }

            else if(esp.equalsIgnoreCase("pediatria")){

                // Busca menor experiencia en pediatría
                if(anios < menorPedia){
                    menorPedia = anios;
                    pediaMenor = apellido;
                }

                // Acumula para promedio
                sumaPedia += anios;
                contPedia++;
            }

            else{
                System.out.println("Especialidad incorrecta. Fin del programa.");
                bd=false;
            }

        }while(bd==true);

        double promCardio=0;
        double promPedia=0;
        // Cálculo de promedios
        if(contCardio>0){
            promCardio=(double)sumaCardio/contCardio;
        }
        if(contPedia>0){
            promPedia=(double)sumaPedia/contPedia;
        }
        
        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Cardiologo con mayor experiencia: "+cardioMayor);
        System.out.println("Pediatra con menor experiencia: "+pediaMenor);
        System.out.println("Promedio experiencia cardiologos: "+promCardio);
        System.out.println("Promedio experiencia pediatras: "+promPedia);

    }

}