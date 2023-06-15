package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * 
 */
public class EjercicioAprendizaje19 {
    public static void main(String[] args) {
        /*
         * Realice un programa que compruebe si una matriz dada es anti simétrica. Se
         * dice que
         * una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta,
         * pero cambiada
         * de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
         * una matriz A se
         * denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
         */

        Scanner read = new Scanner(System.in);
        int size;
        boolean flag = true;
        System.out.println("Ingrese un valor para establecer la dimension de la matriz:");
        size = read.nextInt();

        int matrix[][] = new int[size][size], matrixB[][] = new int[size][size];

        System.out.println(
                "Ingrese los valores para rellenar la matriz, el programa averiguara si la matriz resulta ser antisimetrica:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = read.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixB[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrixB[i][j] != (matrix[i][j] * -1)) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("La matriz es antisimetrica.");
        } else {
            System.out.println("LA matriz no es antisimetrica.");
        }
    }
}
