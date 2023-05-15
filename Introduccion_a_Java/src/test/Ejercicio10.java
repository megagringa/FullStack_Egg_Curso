/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package test;

import java.util.Scanner;


public class Ejercicio10 {

    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese cuatro valores comprendidos entre 1 y 20: ");
        for(int i = 0; i<4; i++){
            System.out.println("");
            int num = leer.nextInt();
            System.out.print(num);
            if(num>0 && num<21){
                for(int j=0;j<num;j++){
                    System.out.print("*");
                }
            }else{
                System.out.println("El valor ingresado no esta en el rango.");
                i--;
            }
        }
}
}
   