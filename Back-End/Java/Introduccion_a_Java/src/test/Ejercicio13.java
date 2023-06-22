/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
*/
package test;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[6];
        System.out.println("Ingrese los nombres del equipo: ");

        for (int i = 0; i < 6; i++) {
            equipo[i] = leer.nextLine();
        }
        System.out.println("Los nombres del equipo son: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" -" + equipo[i]);
        }
        System.out.print(" ");
    }
}
