package Ejemplos;
/**
 *
 * @author AlisonLeon
 */
public class Ejemplo1 {

    public static void main(String[] args) {

        int B[][] = {
            {1, 31, 10, 8},
            {5, 6, 11, 2},
            {7, 9, 14, 6}
        };

        int i, j;

        // Recorrer matriz
        for(i = 0; i < B.length; i++){
            for(j = 0; j < B[i].length; j++){
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
    }
}