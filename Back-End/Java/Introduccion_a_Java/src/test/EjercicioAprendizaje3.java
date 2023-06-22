/*
Ejercicio de Aprendizaje.
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizaje3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la frase: ");
        String frase = leer.nextLine();

        System.out.println(frase.toLowerCase());// minusculas
        System.out.println(frase.toUpperCase());// mayusculas
    }
}
