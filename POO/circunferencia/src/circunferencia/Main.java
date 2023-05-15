/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import Entidades.Circunferencia;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        circulo.crearCircunferencia();

        System.out.println("Area: " + circulo.area());
        System.out.println("Perimetro: " + circulo.perimetro());
    }

}
