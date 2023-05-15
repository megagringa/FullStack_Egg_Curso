/*
Ejercicio de Aprendizaje Extra.
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
*/
package test;

import java.util.Scanner;







public class EjercicioAprendizajeExtra18 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int suma = 0;
        
        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        
        int[] vector = new int[N];
        
        for(int i=0;i<N;i++){
            System.out.println("Ingrese el elemento "+(i+1)+":");
            vector[i] = leer.nextInt();
        }
        
        for(int i=0;i<N;i++){
            suma+=vector[i];
        }
        System.out.println("La suma de los elementos del vector es: "+suma);
    }
}
