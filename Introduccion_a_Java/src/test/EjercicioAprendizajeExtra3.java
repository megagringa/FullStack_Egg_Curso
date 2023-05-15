/*
Ejercicio de Aprendizaje Extra.
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
*/
package test;

import java.util.Scanner;





public class EjercicioAprendizajeExtra3 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese una letra: ");
        String letra = leer.next().toLowerCase();
        
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("Es una vocal: "+letra);
        }else{
            System.out.println("No es una vocal.");
        }
    
 }   
}
