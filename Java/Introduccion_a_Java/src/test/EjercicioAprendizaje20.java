package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * 
 */
public class EjercicioAprendizaje20 {

    public static void main(String[] args) {
        /*
         * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
         * donde la
         * suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
         * programa que
         * permita introducir un cuadrado por teclado y determine si este cuadrado es
         * mágico o no.
         * El programa deberá comprobar que los números introducidos son correctos, es
         * decir,
         * están entre el 1 y el 9.
         */

        Scanner read = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        System.out.println(
                "Ingrese los valores enteros entre 1 y 9 para rellenar la matriz, el programa averiguara si la matriz resulta ser magica:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    matrix[i][j] = read.nextInt();
                } while (matrix[i][j] < 1 || matrix[i][j] > 9);
            }
        }
        sum(matrix);
    }

    public static void sum(int[][] mtrx) {
        int sum, counter = 0;
        boolean flag = true;

        for (int j = 0; j < 3; j++) {
            counter += mtrx[0][j];
        }

        for (int i = 1; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += mtrx[i][j];
            }
            if (sum != counter) {
                flag = false;
            }
        }
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += mtrx[j][i];
            }
            if (sum != counter) {
                flag = false;
            }
        }
        sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += mtrx[i][i];
        }
        if (sum != counter) {
            flag = false;
        }
        sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += mtrx[i][2 - i];
        }
        if (sum != counter) {
            flag = false;
        }
        if (flag) {
            System.out.println("La matriz es magica pues todos sus lados suman " + counter + ".");
        } else {
            System.out.println("La matriz no es magica.");
        }
    }
}
