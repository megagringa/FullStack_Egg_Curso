/*
Ejercicio de Aprendizaje.
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
*/
package test;

import java.util.Scanner;


public class EjercicioAprendizaje9 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Si ingresa una frase o palabra.");
        System.out.println("Si la primera letra es una 'A' se imprime Correcto.");
        System.out.println("Escriba la frase o palabra: ");
        String frase = leer.nextLine();
        
        if(frase.substring(0, 1).equals("A")){
            System.out.println("Correcto!!!...");
        }else{
            System.out.println("Incorrecto!!!...");
        }
        
    }
}
   