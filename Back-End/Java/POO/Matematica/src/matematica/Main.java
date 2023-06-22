/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

import entidades.Matematica;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = Math.random() * 10;
        double num2 = Math.random() * 10;
        Matematica op = new Matematica(num1, num2);

        System.out.println("Numero 1: " + op.getNum1());
        System.out.println("Numero 2: " + op.getNum2());
        System.out.println("Numero mayor: " + op.devolverMayor());
        System.out.println("Potencia del mayor elevado al menor: " + op.calcularPotencia());
        System.out.println("Raiz cuadrada del menor: " + op.calcularRaiz());

    }

}
