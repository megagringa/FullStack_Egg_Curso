/*
Ejercicio de Aprendizaje.
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizaje14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de los euros a convertir: ");
        double euros = leer.nextInt();

        System.out.println("Ingrese la moneda a convertir.");
        System.out.println("a) libras.");
        System.out.println("b) dolares.");
        System.out.println("c) yenes.");
        String moneda = leer.next().toLowerCase();

        double cadenas = cambiarMoneda(euros, moneda);

        mensaje(euros, cadenas);

    }

    public static double cambiarMoneda(double euros, String moneda) {
        double transformar = 0;

        switch (moneda) {
            case "a":
                transformar = euros * 0.86;
                break;
            case "b":
                transformar = euros * 1.28611;
                break;
            case "c":
                transformar = euros * 129.852;
                break;
        }
        return transformar;
    }

    public static void mensaje(double euros, double cadena) {
        System.out.println("Sus " + euros + " euros se transforman " + cadena + ".");
    }
}