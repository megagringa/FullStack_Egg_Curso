/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

import Entidades.Cafetera;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera cafe = new Cafetera(600,150);
        cafe.servirTaza(200);
        cafe.llenarCafetera();
        cafe.servirTaza(400);
        cafe.agregarCafe(300);
        cafe.vaciarCafetera();
        cafe.servirTaza(500);
    }
    
}
