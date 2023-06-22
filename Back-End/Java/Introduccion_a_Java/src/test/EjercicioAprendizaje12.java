/*
Ejercicio de Aprendizaje.
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizaje12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una cadena con 5 caracteres como maximo,");
        System.out.println("Si ingresa el valor &&&&& el programa termina.");
        System.out.println("El primer caracter inicia en X y el último en O");
        String cadena;

        int i = 0, contador = 0;

        do {
            cadena = leer.next();
            i++;
            if (cadena.length() == 5) {
                if (cadena.substring(0, 1).equals("X") && cadena.substring(3, 4).equals("O")) {
                    contador++;
                }
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de frase ingresadas es: " + (i - 1) + " con " + contador + " correctas y "
                + (i - 1 - contador) + " incorrectas.");
    }
}