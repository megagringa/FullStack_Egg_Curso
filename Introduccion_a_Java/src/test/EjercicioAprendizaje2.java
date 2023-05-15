/*
Ejercicio de Aprendizaje.
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
*/
package test;

import java.util.Scanner;


public class EjercicioAprendizaje2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("Su nombre es :"+nombre);
    }
}
