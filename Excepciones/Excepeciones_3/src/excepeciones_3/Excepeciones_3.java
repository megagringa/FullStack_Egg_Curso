/*
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado. 
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

