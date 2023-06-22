/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizaje11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al menu.");
        System.out.println("Elija una opcion!!!...");
        int opcion;

        do {
            System.out.println("MENU.");
            System.out.println("1.Sumar.");
            System.out.println("2.Restar.");
            System.out.println("3.Multiplicar.");
            System.out.println("4.Dividir.");
            System.out.println("5.Salir.");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Elija dos numeros para sumar: ");
                    int sum1 = leer.nextInt();
                    int sum2 = leer.nextInt();
                    System.out.println("La suma de los numeros es: " + sumar(sum1, sum2));
                    break;
                case 2:
                    System.out.println("Elija dos numeros para restar: ");
                    int rest1 = leer.nextInt();
                    int rest2 = leer.nextInt();
                    System.out.println("La resta de los numeros es: " + restar(rest1, rest2));
                    break;
                case 3:
                    System.out.println("Elija dos numeros para multiplicar: ");
                    int mult1 = leer.nextInt();
                    int mult2 = leer.nextInt();
                    System.out.println("La multiplicacion de los numeros es: " + multiplicar(mult1, mult2));
                    break;
                case 4:
                    System.out.println("Elija dos numeros para dividir: ");
                    int div1 = leer.nextInt();
                    int div2 = leer.nextInt();
                    System.out.println("La division de los numeros es: " + dividir(div1, div2));
                    break;
                case 5:
                    String letra;
                    System.out.println("Esta seguro que quiere salir??.");
                    System.out.println("S/N");
                    letra = leer.next();

                    if (letra.toUpperCase().equals("S")) {

                    } else {
                        System.out.println("Volvemos al programa!!...");
                        opcion = 0;
                    }

                default:
                    System.out.println("Las opciones son del 1 al 4.");
                    System.out.println("Si elige el 5 sale del menu.");
            }
        } while (opcion != 5);

    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        int multiplica;
        multiplica = num1 * num2;
        return multiplica;
    }

    public static int dividir(int num1, int num2) {
        int divide;
        divide = num1 / num2;
        return divide;
    }

}