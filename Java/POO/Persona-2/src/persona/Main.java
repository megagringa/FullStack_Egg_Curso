/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import entidades.Persona;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.crearPersona();

        System.out.println("Persona creada:");
        persona.mostrarPersona();

        //int edad = persona.calcularEdad();
        System.out.println("Edad de la persona: " + persona.calcularEdad() + " años");

        int otraEdad = 30;
        boolean menorQueOtraEdad = persona.menorQue(otraEdad);
        if (menorQueOtraEdad) {
            System.out.println("La persona es menor que " + otraEdad + " años");
        } else {
            System.out.println("La persona no es menor que " + otraEdad + " años");
        }
    }
}




