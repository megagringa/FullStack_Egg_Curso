/*
Ejercicio de Aprendizaje Extra.
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizajeExtra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        int resultado;

        do {
            System.out.println("Cuanto es " + num1 + " * " + num2 + " ??.");
            resultado = leer.nextInt();
            if (resultado == num1 * num2) {
                System.out.println("Correcto!!!...");
            } else {
                System.out.println("Incorrecto!!!... Ingrese su respuesta nuevamente.");
            }
        } while (resultado != num1 * num2);
    }

}
