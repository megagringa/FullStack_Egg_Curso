/*
Ejercicio de Aprendizaje.
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizaje1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Sumatoria de dosnumeros.");
        System.out.println("Ingrese el primer valor: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        int num2 = leer.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es de: " + suma);
    }
}
