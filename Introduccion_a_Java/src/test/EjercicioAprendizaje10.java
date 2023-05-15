/*
Ejercicio de Aprendizaje.
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/
package test;

import java.util.Scanner;


public class EjercicioAprendizaje10 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo.");
        int valorpositivo = leer.nextInt();
        int suma = 0;
       
        if(valorpositivo<0){
            System.out.println("Los valores negativos no entran en este programa.");
            
        }else{
            for(int i=0; i<valorpositivo;i++){
            System.out.println("Ingresar valores a sumar :");
             int num = leer.nextInt();
          
            suma += num;
           }
        }
        
       
        System.out.println("La suma es: "+suma);
    
}
    }