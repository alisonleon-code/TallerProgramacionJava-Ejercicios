package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio03 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int N,ht;
        int cont1=0,cont2=0,cont3=0;

        double tarifa,sueldo;
        double porc1,porc2,porc3;

        String nom;

        System.out.print("Ingresar cantidad de empleados: ");
        N=scan.nextInt();

        System.out.print("Ingresar tarifa por hora: ");
        tarifa=scan.nextDouble();

        for(int i=0;i<N;i++){

            System.out.print("\nIngresar horas trabajadas: ");
            ht=scan.nextInt();

            sueldo=ht*tarifa;

            System.out.print("Ingresar nombre empleado: ");
            nom=scan.next();

            System.out.println("\n***** BOLETA DE PAGO *****");
            System.out.println("Nombre: "+nom);
            System.out.println("Sueldo: "+sueldo+" soles");

            // Clasifica empleados por rangos
            if(sueldo<700){
                cont1++;
            }

            else if(sueldo<=1300){
                cont2++;
            }

            else{
                cont3++;
            }

        }

        // Cálculo de porcentajes
        porc1=(double)cont1*100/N;
        porc2=(double)cont2*100/N;
        porc3=(double)cont3*100/N;

        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Menores de 700: "+cont1+" - "+porc1+"%");
        System.out.println("Entre 700 y 1300: "+cont2+" - "+porc2+"%");
        System.out.println("Mayores de 1300: "+cont3+" - "+porc3+"%");

    }

}