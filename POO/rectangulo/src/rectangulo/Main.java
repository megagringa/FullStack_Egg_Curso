/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import Entidades.Rectangulo;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();

        rectangulo.obtenerDatos();
        System.out.println("Superficie: " + rectangulo.superficie());
        System.out.println("Perimetro: " + rectangulo.perimetro());
        rectangulo.dibujarRectangulo();
    }

}
