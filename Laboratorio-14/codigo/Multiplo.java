/**
 *
 * @author AlisonLeon
 */
package Ejercicio01;

public class Multiplo {

    private int c1=0,c2=0,c3=0;
    private int num;
    private int opc;

    public int getC1() {
        return c1;
    }

    public int getC2() {
        return c2;
    }

    public int getC3() {
        return c3;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public void setNum(int num) {
        this.num = num;
    }

    void multiplo3(){
        if(num%3==0)
            c1++;
    }

    void multiplo4(){
        if(num%4==0)
            c2++;
    }

    void multiplo7(){
        if(num%7==0)
            c3++;
    }

}