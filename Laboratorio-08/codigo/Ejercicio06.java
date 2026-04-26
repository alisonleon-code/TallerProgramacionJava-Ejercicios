package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;
        int tam,material;

        int plastico=0;
        int carton=0;

        int chicas=0;
        int medianas=0;
        int grandes=0;

        double porChicas;
        double porMedianas;
        double porGrandes;

        System.out.print("Cantidad de productos: ");
        n=scan.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("\nTamaño [1]Chico [2]Mediano [3]Grande: ");
            tam=scan.nextInt();

            System.out.print("Material [1]Plastico [2]Carton: ");
            material=scan.nextInt();

            // Cuenta material
            if(material==1){
                plastico++;
            }

            else if(material==2){
                carton++;
            }

            // Cuenta tamaños
            switch(tam){

                case 1:
                    chicas++;
                    break;

                case 2:
                    medianas++;
                    break;

                case 3:
                    grandes++;
                    break;
            }

        }

        // Cálculo porcentajes
        porChicas=(double)chicas*100/n;
        porMedianas=(double)medianas*100/n;
        porGrandes=(double)grandes*100/n;

        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Cajas de plastico: "+plastico);
        System.out.println("Cajas de carton: "+carton);

        System.out.println("\nPorcentaje chicas: "+porChicas+"%");
        System.out.println("Porcentaje medianas: "+porMedianas+"%");
        System.out.println("Porcentaje grandes: "+porGrandes+"%");
    }
}