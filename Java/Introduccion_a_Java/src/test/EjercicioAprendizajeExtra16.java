/*
Ejercicio de Aprendizaje Extra.
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizajeExtra16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        String respuesta = "Si";

        while (respuesta.equalsIgnoreCase("Si")) {
            pedirDatos(leer);

            contador++;
            if (contador == 1) {
                System.out.println("Ha ingresado 1 persona.");
            } else {
                System.out.println("Ha ingresado " + contador + " personas.");
            }

            System.out.println("¿Desea seguir agregando personas? (Si/No)");
            respuesta = leer.nextLine();
        }

        System.out.println("Programa terminado.");

    }

    public static void pedirDatos(Scanner leer) {
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad de " + nombre + ":");
        int edad = leer.nextInt();
        leer.nextLine();
        String edadM = edad >= 18 ? "Mayor." : "Menor.";
        System.out.println(nombre + " tiene " + edad + " años y es " + edadM + " de edad.");
    }
}
