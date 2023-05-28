/*
Ejercicio de Aprendizaje Extra.
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
*/
package test;

import java.util.Arrays;

public class EjercicioAprendizajeExtra19 {

    public static void main(String[] args) {

        int[] vector1 = { 1, 2, 3, 4, 5 };
        int[] vector2 = { 1, 2, 3, 4, 5 };

        if (Arrays.equals(vector1, vector2)) {
            System.out.println("Los vectores son iguales.");

        } else {
            System.out.println("Los vectores no son iguales.");
        }
    }
}
