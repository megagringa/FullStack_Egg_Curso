/*
Implementar un programa que le pida dos números enteros a usuario y 
determine si ambos o alguno de ellos es mayor a 25.
*/
package test;

import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
            
        System.out.println("Ingrese el primer valor: ");
            int num1 = leer.nextInt();
    
        System.out.println("Ingrese el segundo valor:");
            int num2 = leer.nextInt();
            
    if(num1>25 && num2>25){
        System.out.println("Los dos numeros son mayores a 25.");
        
    }else if(num1>25){
        System.out.println("El primer numero es mayor a 25.");
        
    }else if(num2>25){
        System.out.println("El segundo numero es mayor a 25.");
        
    }else{
        System.out.println("Ninguno es mayor a 25.");
    }        
}
}
   