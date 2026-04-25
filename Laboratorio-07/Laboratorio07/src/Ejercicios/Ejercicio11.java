package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nac;
        int contMenor55=0;
        int cont55a70=0;
        int contMayor70=0;

        double peso;
        double mayorNacional=0;
        double menorExtranjero=999;

        do{
            System.out.print("\nNacionalidad [1]Nacional [2]Extranjero: ");
            nac=scan.nextInt();

            System.out.print("Ingrese peso: ");
            peso=scan.nextDouble();

            if(peso>0){
                // Clasificación por rangos de peso
                if(peso<55){
                    contMenor55++;
                }

                else if(peso<=70){
                    cont55a70++;
                }

                else{
                    contMayor70++;
                }

                switch(nac){
                    case 1:

                        // Mayor peso nacional
                        if(peso>mayorNacional){
                            mayorNacional=peso;
                        }
                        break;

                    case 2:

                        // Menor peso extranjero
                        if(peso<menorExtranjero){
                            menorExtranjero=peso;
                        }
                        break;
                }

            }

        }while(peso>0);

        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Menores de 55 kg: "+contMenor55);
        System.out.println("Entre 55 y 70 kg: "+cont55a70);
        System.out.println("Mayores de 70 kg: "+contMayor70);
        System.out.println("Mayor peso nacional: "+mayorNacional);
        System.out.println("Menor peso extranjero: "+menorExtranjero);
    }
}