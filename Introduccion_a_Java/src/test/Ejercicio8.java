/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
*/
package test;

import java.util.Scanner;


public class Ejercicio8 {

    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("Escriba el valor entre 0 y 10:");
        int num = leer.nextInt();
        
        while(num<0 || num>10){
            System.out.println("Vuelva a ingresar un valor entre 0 y 10:");
            num = leer.nextInt();
        }
        System.out.println("El valor de la nota es " + num);
}
}
}
 