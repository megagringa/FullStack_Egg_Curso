/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepeciones_3;

import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Excepeciones_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        String numero1 = scanner.nextLine();
        
        System.out.print("Ingrese el segundo número: ");
        String numero2 = scanner.nextLine();
        
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        
        int resultado = num1 / num2;
        
        System.out.println("El resultado de la división es: " + resultado);
        
        scanner.close();
    }
}

