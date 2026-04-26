package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int tipo,procedencia;

        double precio;

        double mayorNacional=0;
        double menorImportado=99999;

        double gananciaComida=0;
        double gananciaVestido=0;

        System.out.print("Cantidad de productos: ");
        n=scan.nextInt();

        for(int i=0;i<n;i++){

            System.out.print("\nTipo [1]Comida [2]Vestido: ");
            tipo=scan.nextInt();

            System.out.print("Procedencia [1]Nacional [2]Importado: ");
            procedencia=scan.nextInt();

            System.out.print("Precio: ");
            precio=scan.nextDouble();

            if(procedencia==1){

                // Mayor precio nacional
                if(precio>mayorNacional){
                    mayorNacional=precio;
                }
            }

            else if(procedencia==2){

                // Menor precio importado
                if(precio<menorImportado){
                    menorImportado=precio;
                }
            }

            // Acumula ganancias por tipo
            if(tipo==1){
                gananciaComida+=precio;
            }

            else if(tipo==2){
                gananciaVestido+=precio;
            }

        }

        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Mayor precio Nacional: "+mayorNacional);
        System.out.println("Menor precio Importado: "+menorImportado);
        System.out.println("Ganancia en comida: "+gananciaComida);
        System.out.println("Ganancia en vestido: "+gananciaVestido);
    }
}