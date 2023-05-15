/*
Ejercicio de Aprendizaje Extra.
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
Bucle "while".
*/
package test;

import java.util.Scanner;





public class EjercicioAprendizaje7 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de numeros a calcular: ");
        int n = leer.nextInt();
        
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        
        int contador = 1;
        
        while(contador<=n){
            System.out.println("Ingrese un numero: ");
            double num = leer.nextDouble();
            sum += num;
            
            if(num>max){
                max = num;
            }
            
            if(num<min){
                min = num;
            }
            contador++;
        }
        double promedio = sum/n;
        System.out.println("Valor maximo: "+max);
        System.out.println("Valor minimo: "+min);
        System.out.println("El promedio: "+promedio);
 }   
}
