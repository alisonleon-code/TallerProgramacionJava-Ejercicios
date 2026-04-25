package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Número de clientes a registrar
        int n;
        // Control del bucle repetitivo
        int cont = 0;
        // Sexo: 1 varón, 2 mujer
        int sexo;
        // Contadores
        int varonesMas84 = 0;
        int mujeresMenor156 = 0;
        // Cantidad de hombres y mujeres registrados
        int hombres = 0;
        int mujeres = 0;
        // Datos ingresados
        double peso, talla;
        // Acumuladores para promedios
        double sumaPesoMujeres = 0;
        double sumaTallaHombres = 0;
        // Variables para resultados
        double promedioPesoMujeres = 0;
        double promedioTallaHombres = 0;

        System.out.print("Ingrese cantidad de clientes: ");
        n = scan.nextInt();

        // Repetir hasta registrar N personas
        do{

            System.out.print("\nSexo [1]Varon [2]Mujer: ");
            sexo = scan.nextInt();

            System.out.print("Ingrese peso (kg): ");
            peso = scan.nextDouble();

            System.out.print("Ingrese talla (m): ");
            talla = scan.nextDouble();

            // Evaluación para varones
            if(sexo==1){
                // Cuenta varones mayores de 84 kilos
                if(peso>84){
                    varonesMas84++;
                }
                // Acumula tallas para promedio
                sumaTallaHombres += talla;
                // Cuenta hombres registrados
                hombres++;
            }

            // Evaluación para mujeres
            else if(sexo==2){
                // Cuenta mujeres menores a 1.56 m
                if(talla<1.56){
                    mujeresMenor156++;
                }
                // Acumula pesos para promedio
                sumaPesoMujeres += peso;

                // Cuenta mujeres registradas
                mujeres++;
            }
            // Incrementa contador general
            cont++;
        }while(cont<n);
        // Cálculo del promedio de talla de hombres
        if(hombres>0){
            promedioTallaHombres = sumaTallaHombres / hombres;
        }
        // Cálculo del promedio de peso de mujeres
        if(mujeres>0){
            promedioPesoMujeres = sumaPesoMujeres / mujeres;
        }

        // Reporte final
        System.out.println("\n--------- REPORTE FINAL ---------");
        System.out.println("Varones que pesan más de 84 kg: " + varonesMas84);
        System.out.println("Mujeres que miden menos de 1.56 m: " + mujeresMenor156);
        System.out.println("Promedio peso de mujeres: " + promedioPesoMujeres);
        System.out.println("Promedio talla de varones: " + promedioTallaHombres);
        System.out.println("---------------------------------");

    }

}