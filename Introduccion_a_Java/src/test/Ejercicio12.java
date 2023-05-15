/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
*/
package test;

import java.util.Scanner;


public class Ejercicio12 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el primer multiplo: ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo multiplo para validar: ");
        int num2 = leer.nextInt();
        
        esMultiplo(num1,num2);

    }
    public static void esMultiplo (int num1,int num2){
        if(num1%num2==0){
            System.out.println("El numero se valdia como multiplo.");
        }else{
            System.out.println("El numero no se valida como multiplo.");
        }
    }
}
  