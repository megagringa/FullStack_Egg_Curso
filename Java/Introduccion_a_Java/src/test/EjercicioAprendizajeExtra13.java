/*
Ejercicio de Aprendizaje Extra.
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizajeExtra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros para hacer la escalera: ");
        int altura = leer.nextInt();

        for (int i = 1; i <= altura; i++) { // toma la cantidad
            for (int j = 1; j <= i; j++) { //
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}