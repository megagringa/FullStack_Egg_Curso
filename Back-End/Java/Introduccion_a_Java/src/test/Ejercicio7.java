/*
Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
válido para tipo de bomba”
*/
package test;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean flag = true;

        do {

            System.out.println("Ingre la opcion de la bomba de 1 a 4:");
            System.out.println("1. La bomba es de agua.");
            System.out.println("2. La bomba es de gasolina.");
            System.out.println("3. La bomba es de hormigón.");
            System.out.println("4. La bomba es de pasta alimenticia.");
            System.out.println("5. Salir del programa.");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La bomba es de agua.");
                    break;
                case 2:
                    System.out.println("La bomba es de gasolina.");
                    break;
                case 3:
                    System.out.println("La bomba es de hormigón.");
                    break;
                case 4:
                    System.out.println("La bomba es de pasta alimenticia.");
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    flag = false;
                default:
                    System.out.println("No existe un valor válido para tipo de bomba.");
            }
        } while (flag);
    }
}
