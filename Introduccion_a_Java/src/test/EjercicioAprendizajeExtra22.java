/*
Ejercicio de Aprendizaje Extra.
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package test;

import java.util.Random;

public class EjercicioAprendizajeExtra22 {

    public static void main(String[] args) {
        int N = 3, M = 4, suma = 0;

        int[][] matriz = new int[N][M];

        // llena con valores aleatorios de 1 al 10
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = random.nextInt();
            }
        }
        // muestra
        System.out.println("Matriz :");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // calcular la suma
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma es: " + suma);
    }
}