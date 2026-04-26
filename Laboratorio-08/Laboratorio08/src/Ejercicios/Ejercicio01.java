package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AlisonLeon
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int N,cont;
        int cur,not;
        int mayorPhp=0, mayorAndroid=0;

        String nom;
        String mejorPhp=null;
        String mejorAndroid=null;


        System.out.print("Ingresar cantidad de estudiantes: ");
        N=scan.nextInt();

        for(cont=0;cont<N;cont++){
            System.out.print("\nIngresar nombre del estudiante: ");
            nom=scan.next();

            System.out.print("Indique curso [1]PHP [2]Android: ");
            cur=scan.nextInt();

            if(cur==1 || cur==2){
                System.out.print("Ingresar nota: ");
                not=scan.nextInt();

                if(not>=0 && not<=20){
                    switch(cur){

                        case 1:
                            // Mayor nota en PHP
                            if(not>mayorPhp){
                                mayorPhp=not;
                                mejorPhp=nom;
                            }
                            break;

                        case 2:

                            // Mayor nota en Android
                            if(not>mayorAndroid){
                                mayorAndroid=not;
                                mejorAndroid=nom;
                            }
                            break;
                    }

                }else{
                    System.out.println("Nota incorrecta");
                    cont--; // repite alumno
                }

            }else{
                System.out.println("Curso incorrecto");
                cont--; // repite alumno
            }

        }

        System.out.println("\n------ REPORTE FINAL ------");
        System.out.println("Mejor alumno PHP: "+mejorPhp+" con nota "+mayorPhp);
        System.out.println("Mejor alumno Android: "+mejorAndroid+" con nota "+mayorAndroid);

    }

}