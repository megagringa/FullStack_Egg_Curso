/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Operaciones {

    private double numero1;
    private double numero2;

    public Operaciones() {

    }

    public Operaciones(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperaciones() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero para operar: ");
        double numero1 = leer.nextInt();
        this.numero1 = numero1;
        System.out.println("Ingrese el segundo numero para operar: ");
        double numero2 = leer.nextInt();
        this.numero2 = numero2;
    }

    public double sumar() {
        double sumar;
        sumar = this.numero1 + this.numero2;
        return sumar;
    }

    public double restar() {
        double restar;
        restar = this.numero1 - this.numero2;
        return restar;
    }

    public double multiplicar() {
        double multiplicar = 0;
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("No se puede multiplciar por cero.");
        } else {
            multiplicar = this.numero1 * this.numero2;

        }
        return multiplicar;
    }
    
    public double dividir(){
        double dividir = 0;
        if(this.numero2 == 0){
            System.out.println("No se puede dividir por cero.");
        }else{
            dividir = this.numero1/this.numero2;
        }
        return dividir;
    }
    

}
