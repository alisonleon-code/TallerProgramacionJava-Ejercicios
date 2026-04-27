/**
 *
 * @author AlisonLeon
 */
package Ejercicio03;

public class Empleado {

    private String sex;
    private double sal;

    private double mayor=0;
    private double menor=99999;
    private double suma=0;

    private int mujeres=0;
    private int hombres=0;
    private int cont=0;

    public void setSex(String sex){
        this.sex=sex;
    }

    public void setSal(double sal){
        this.sal=sal;
    }

    public double getMayor(){
        return mayor;
    }

    public double getMenor(){
        return menor;
    }

    public int getMujeres(){
        return mujeres;
    }

    public int getHombres(){
        return hombres;
    }

    public double calcularPromedio(){
        return suma/cont;
    }

    void procesarDatos(){

        if(sal>mayor)
            mayor=sal;

        if(sal<menor)
            menor=sal;

        suma=suma+sal;
        cont++;

        if(sex.equalsIgnoreCase("F"))
            mujeres++;

        if(sex.equalsIgnoreCase("M"))
            hombres++;
    }

}