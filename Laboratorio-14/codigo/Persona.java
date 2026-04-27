/**
 *
 * @author AlisonLeon
 */
package Ejercicio07;

public class Persona {

    private int edad;
    private double peso;

    private int cn=0,cj=0,ca=0;
    private double sn=0,sj=0,sa=0;

    public void setEdad(int edad){
        this.edad=edad;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public void clasificarPersona(){

        if(edad>=0 && edad<=12){
            cn++;
            sn=sn+peso;
        }

        else if(edad>=13 && edad<=29){
            cj++;
            sj=sj+peso;
        }

        else{
            ca++;
            sa=sa+peso;
        }

    }

    double promedioNiños(){
        if(cn>0)
           return sn/cn;
        else
           return 0;
    }

    double promedioJovenes(){
        if(cj>0)
           return sj/cj;
        else
           return 0;
    }

    double promedioAdultos(){
        if(ca>0)
           return sa/ca;
        else
           return 0;
    }

    void mostrarResultados(){
        System.out.print("Promedio niños: "+promedioNiños()+"\n");
        System.out.print("Promedio jóvenes: "+promedioJovenes()+"\n");
        System.out.print("Promedio adultos: "+promedioAdultos()+"\n");
    }

}