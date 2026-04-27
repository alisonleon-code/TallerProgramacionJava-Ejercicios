/**
 *
 * @author AlisonLeon
 */
package Ejercicio01;

public class Obrero {

    // Sobrecarga de métodos

    public void datosObrero(String nom){
        System.out.print("Nombre del obrero: "+nom+"\n");
    }

    public void datosObrero(int anios){
        System.out.print("Años de servicio: "+anios+"\n");
    }

    public void datosObrero(double sueldo){

        if(sueldo>2000)
            sueldo=sueldo+(sueldo*0.02);
        else
            sueldo=sueldo+(sueldo*0.05);

        System.out.print("Sueldo final: "+sueldo+" soles\n");
    }

}