/*
Ejercicio de Aprendizaje Extra.
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random(). 
 */
package test;

import java.util.Scanner;

public class EjercicioAprendizajeExtra23 {

    static String[][] matriz = new String[20][20];
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ingreso(matriz);
        palabras(matriz);
        sopa(matriz);
        imprimir(matriz);

    }

    public static void ingreso(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = "1";
            }
        }
    }

    public static void palabras(String[][] matriz) {
        String palabra = "";

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese palabra " + (i + 1) + " entre 3 y 5 letras de largo.");
            palabra = leer.next();
            palabra = palabra.toUpperCase();

            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Debe ser una palabra entre 3 y 5 letras!\n");
                System.out.println("Ingrese palabra " + (i + 1) + " entre 3 y 5 letras de largo.");
                palabra = leer.next();
                palabra = palabra.toUpperCase();

            }

            azar(palabra);
        }
    }

    public static void azar(String palabra) {
        int num1, num2;

        boolean flag = true;

        do {
            num1 = (int) (Math.random() * (20));
            num2 = (int) (Math.random() * (20 - palabra.length()));

            for (int i = num2; i < palabra.length(); i++) {
                if (!(matriz[num1][i].equals("1"))) {
                    flag = false;
                }
            }
        } while (flag == false);

        if (flag == true) {
            int m = 0, f = 1;

            for (int j = num2; j < (num2 + palabra.length()); j++) {
                matriz[num1][j] = palabra.substring(m, f);
                m++;
                f++;
            }

        }
    }

    public static void imprimir(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public static void sopa(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j].equals("1")) {
                    matriz[i][j] = letra();
                }
            }
        }
    }

    public static String letra() {
        String letra = "";
        int randNum = (int) (Math.random() * 26);
        letra = String.valueOf((char) (randNum + 'A'));
        return letra;

    }
}