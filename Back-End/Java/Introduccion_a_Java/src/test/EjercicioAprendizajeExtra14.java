/*
Ejercicio de Aprendizaje Extra.
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizajeExtra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias: ");
        int numfam = leer.nextInt();

        int sumedad = 0;

        for (int i = 1; i <= numfam; i++) {
            System.out.println("Ingrese la cantidad de hijos: ");
            int numhijos = leer.nextInt();

            for (int j = 1; j <= numhijos; j++) {
                System.out.println("Ingrese la edad de " + j + " de la familia " + i + ".");
                int edad = leer.nextInt();
                sumedad += edad;
            }
            double mediaedad = sumedad / numfam;
            System.out.println("La edad media de todos los hijos de todas las familias es: " + mediaedad);

        }

    }

}
