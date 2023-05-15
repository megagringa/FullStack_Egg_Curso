/*
Ejercicio de Aprendizaje Extra.
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
*/
package test;

import java.util.Scanner;





public class EjercicioAprendizaje6 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int contadorbajo = 0;
    double altura, totalaltura = 0, promediogeneral, promediobajo = 0;
    
        System.out.println("Ingrese la cantidad de personas: ");
        int N = leer.nextInt();
        
        for(int i=0;i<N;i++){
            System.out.println("Ingrese la altura de la persona: "+i+" metros.");
            altura = leer.nextDouble();
           totalaltura += altura;
        
        
        if(altura<1.6){
            promediobajo += altura;
            contadorbajo++;
        }
        }
        promediogeneral = totalaltura/N;
        if(promediobajo>0){
            promediobajo/=contadorbajo;
        }
        
        System.out.println("Promedio general "+promediogeneral+" metros.");
        
        if(promediobajo>0){
            System.out.println("Promedio por debajo de 1.6: "+promediobajo+" metros.");
        }else{
            System.out.println("No hay personas por debajo de 1.6 .");
        }
 }   
}
