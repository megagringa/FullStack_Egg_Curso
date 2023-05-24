/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosobras1;

import interfaces.Interfaz;
import interfaces.Metodos;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interfaz metodos = new Metodos();
        metodos.metodo();
        metodos.sumar();
        
        int resultado = metodos.sumar();
        System.out.println("La suma es: "+ resultado);
        
    }
    
}
