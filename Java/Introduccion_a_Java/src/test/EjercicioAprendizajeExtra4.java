/*
Ejercicio de Aprendizaje Extra.
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizajeExtra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 al 10 apra pasarlo en romano: ");
        int numero = leer.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("No esta el numero entre 1 y 10.");
        } else {
            String[] romanos = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };

            System.out.println("El número " + numero + " en números romanos es: " + romanos[numero - 1]);
        }

    }
}
