package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        int sexo;

        int mujeres=0;
        int varones=0;
        int mujeresMenor800=0;

        double sueldo;
        double mayorSueldo=0;

        double porcentaje;

        String nombre;
        String mejorVaron="";

        System.out.print("Cantidad de empleados: ");
        n=scan.nextInt();

        for(int i=0;i<n;i++){

            System.out.print("\nNombre empleado: ");
            nombre=scan.next();

            System.out.print("Sexo [1]Varon [2]Mujer: ");
            sexo=scan.nextInt();

            System.out.print("Salario: ");
            sueldo=scan.nextDouble();

            if(sexo==1){

                varones++;

                // Busca mayor sueldo de varones
                if(sueldo>mayorSueldo){
                    mayorSueldo=sueldo;
                    mejorVaron=nombre;
                }

            }

            else if(sexo==2){

                mujeres++;

                // Cuenta mujeres con sueldo menor a 800
                if(sueldo<800){
                    mujeresMenor800++;
                }
            }

        }

        // Porcentaje mujeres menores de 800
        porcentaje=0;

        if(mujeres>0){
            porcentaje=(double)mujeresMenor800*100/mujeres;
        }

        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Cantidad de mujeres: "+mujeres);
        System.out.println("Cantidad de varones: "+varones);
        System.out.println("Porcentaje mujeres que ganan menos de 800: "+porcentaje+"%");
        System.out.println("Varon con mayor sueldo: "+mejorVaron);

    }

}