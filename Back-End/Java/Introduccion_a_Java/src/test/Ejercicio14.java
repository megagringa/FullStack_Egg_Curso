/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
*/
package test;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] equipo = new String[2][2];
        System.out.println("Ingrese los nombres de jugadores en el equipo: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                equipo[i][j] = leer.nextLine();
            }

        }
        System.out.println("Los nombres son: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" -" + equipo[i][j]);
            }

        }
        System.out.print(" ");
    }
}
