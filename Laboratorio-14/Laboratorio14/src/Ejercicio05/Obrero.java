/**
 *
 * @author AlisonLeon
 */
package Ejercicio05;

public class Obrero {

    private int cat;
    private int prod;
    private int cant;

    public void setCat(int cat){
        this.cat=cat;
    }

    public void setProd(int prod){
        this.prod=prod;
    }

    public void setCant(int cant){
        this.cant=cant;
    }

    double calcularPagoBase(){

        double tarifa=0;

        // producto 1 = Tejas
        if(prod==1){
            switch(cat){
                case 1: tarifa=2.5; break;
                case 2: tarifa=2.0; break;
                case 3: tarifa=1.5; break;
            }
        }

        // producto 2 = Losetas
        if(prod==2){
            switch(cat){
                case 1: tarifa=2.0; break;
                case 2: tarifa=1.5; break;
                case 3: tarifa=1.0; break;
            }
        }

        return tarifa*cant;
    }

    double calcularBonificacion(double pb){

        double bon=0;

        if(cant>=50 && cant<=250)
            bon=pb*0.05;

        else if(cant>=251 && cant<=500)
            bon=pb*0.20;

        else if(cant>=501)
            bon=pb*0.50;

        return bon;
    }

    double calcularPagoTotal(double pb,double bon){
        return pb+bon;
    }

    void mostrarResultados(double pb,double bon,double pt){
        System.out.print("Pago base: "+pb+"\n");
        System.out.print("Bonificación: "+bon+"\n");
        System.out.print("Pago total: "+pt+"\n");
    }

}