/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import entidades.Ahorcado;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ahorcado a = new Ahorcado();
        System.out.println("Bienvenidos");
        System.out.println("Jugar al ahorcado.");
        a.bienvenida();
    }

}
