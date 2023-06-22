/*
Ejercicio de Aprendizaje.
Crear un programa que dado un numero determine si es par o impar.
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizaje6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para determinar si es par o no: ");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

    }
}