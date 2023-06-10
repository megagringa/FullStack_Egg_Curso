/*
 Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(500) + 1;
        int intentos = 0;

        Scanner scanner = new Scanner(System.in);
        boolean adivinado = false;

        System.out.println("Bienvenido al juego de adivinar el número. ¡Adivina el número entre 1 y 500!");

        while (!adivinado) {
            System.out.print("Introduce tu intento: ");

            try {
                int intento = scanner.nextInt();
                intentos++;

                if (intento == numeroAleatorio) {
                    adivinado = true;
                    System.out.println("¡Felicidades! Has adivinado el número " + numeroAleatorio + ".");
                    System.out.println("Número de intentos: " + intentos);
                } else if (intento < numeroAleatorio) {
                    System.out.println("El número a adivinar es mayor que " + intento + ".");
                } else {
                    System.out.println("El número a adivinar es menor que " + intento + ".");
                }
            } catch (InputMismatchException e) {
                intentos++;
                System.out.println("Error: debes introducir un número válido.");
                scanner.next(); // Limpia el búfer.
            }
        }

    }
}
