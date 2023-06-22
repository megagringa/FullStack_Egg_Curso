/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author ing_j
 */
public class Matematica {

    private double num1, num2;

    public Matematica() {

    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor() {
        return Math.max(num1, num2);//devuelve el valor mayor de una lista de valores numéricos pasados como parámetros.

    }

    public double calcularPotencia() {
        double mayor = Math.max(num1,num2);
        double menor = Math.min(num1,num2);
        return Math.pow(Math.round(mayor), Math.round(menor));//retorna el valor de un número redondeado al entero más cercano.
    }
    
    public double calcularRaiz(){
        double menor = Math.min(num1,num2);
        double absoluto = Math.abs(menor);
        return Math.sqrt(absoluto);
    }

}
