/*
Ejercicio de Aprendizaje Extra.
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizajeExtra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contadorroto = 0, contadorpar = 0, contadorimpar = 0;

        while (true) {
            System.out.println("Ingrese un numero entero: ");
            int num = leer.nextInt();

            if (num % 5 == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            contadorroto++;

            if (num % 2 == 0) {
                contadorpar++;
            } else {
                contadorimpar++;
            }

        }
        System.out.println("Cantidad de numeros :" + contadorroto);
        System.out.println("Cantidad de pares: " + contadorpar);
        System.out.println("Cantidad de impares: " + contadorimpar);
    }
}