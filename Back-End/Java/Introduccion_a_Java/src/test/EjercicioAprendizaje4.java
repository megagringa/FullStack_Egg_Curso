/*
Ejercicio de Aprendizaje.
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizaje4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados que seran pasados a Fahrenheit.");
        float grados = leer.nextFloat();

        float fahrenheit = 32 + (9 * grados / 5);

        System.out.println("La formula es F = 32 + ( 9 * C / 5): " + fahrenheit);
    }
}
