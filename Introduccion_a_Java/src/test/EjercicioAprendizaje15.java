/*
Ejercicio de Aprendizaje.
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizaje15 {

    System.out.println("Primeros 100 numeros de forma ascendente.");
    int[] vector = new int[100];for(
    int i = 0;i<100;i++)
    {
        vector[i] = i + 1;
        System.out.print(vector[i] + " ");
    }System.out.println("\nPrimeros 100 numeros de forma descendente.");for(
    int i = 99;i>=0;i--)
    {
        System.out.print(vector[i] + " ");

    }
}}