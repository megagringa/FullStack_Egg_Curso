package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise16 {

    public static void main(String[] args) {
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
        al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido*/

        Scanner read = new Scanner(System.in);
        int vector[] = new int[15];
        int numSearch, counter = 0;

        for (int i = 0; i < 15; i++) {
            vector[i] = (int) (Math.random() * 100);
        }

        System.out.println("Ingrese un numero para buscar dentro del Arreglo:");
        numSearch = read.nextInt();

        for (int i = 0; i < 15; i++) {
            if (vector[i] == numSearch) {
                counter++;
                System.out.println("El numero " + numSearch + " se encuentra en la posicion: " + i + 1);
            }
        }
        if (counter == 0) {
            System.out.println("El numero " + numSearch + " no se encontro dentro del arreglo.");
        } else {
            System.out.println("El numero " + numSearch + " se encuentra repetido " + counter + "veces.");
        }
    }
}
