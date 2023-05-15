/*
Ejercicio de Aprendizaje Extra.
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
package test;

import java.util.Random;



public class EjercicioAprendizajeExtra20 {

    public static void main(String[] args) {
    
     int[]vector = new int[10];
     llenarVector(vector);
     imprimirVector(vector);   
    }
    public static void llenarVector(int[] vector){
        Random rand = new Random();
        for(int i=0;i<vector.length;i++){
            vector[i]=rand.nextInt(100);
        }
    
        
    }
    public static void imprimirVector(int[]vector){
            for(int i=0;i<vector.length;i++){
                System.out.println(vector[i]+" ");
            }
            System.out.println();
        }
}
