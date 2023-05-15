/*
Ejercicio de Aprendizaje Extra.
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
package test;

import java.util.Scanner;



public class EjercicioAprendizajeExtra1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese los minutos para pasar en dias y horas: ");
        int minutos = leer.nextInt();
        
        convertirMinutos(minutos);
        
        
    }
    public static void convertirMinutos(int minutos){
            int horas = minutos/60;
            int dias = horas/24;
            horas = horas%24;
            
            System.out.println(minutos + " minutos equivalen a " + dias + " días y " + horas + " horas.");
        }
    
}