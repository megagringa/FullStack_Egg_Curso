/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

import Entidades.Libro;

/**
 *
 * @author ing_j
 */
public class Biblio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.cargarLibros();
        libro.mostrarInformacion();
       
    }

   

    
    
}
