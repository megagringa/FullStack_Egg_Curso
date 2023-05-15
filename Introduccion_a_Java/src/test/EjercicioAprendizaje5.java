/*
Ejercicio de Aprendizaje.
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/
package test;

import java.util.Scanner;


public class EjercicioAprendizaje5 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero en donde se devolvera.");
        System.out.println("El doble, el triple y la raíz cuadrada.");
        int num = leer.nextInt();
        
        System.out.println("El numero es: "+num+" y su doble es: "+num*2+".");
        System.out.println("Su triple es: "+num*3+" y su raíz cuadrada es: "+Math.sqrt(num));
    }
}
 