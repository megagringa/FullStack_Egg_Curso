/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasecrets;

import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class JavaSecrets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", 
                          "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[9];
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Adivina el mes secreto. Introduce el nombre del mes en minúsculas:");
        String mesAdivinado = leer.nextLine();
        
        while (!mesAdivinado.equals(mesSecreto)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            mesAdivinado = leer.nextLine();
        }
        
        System.out.println("¡Ha acertado!");
    }
    
}
