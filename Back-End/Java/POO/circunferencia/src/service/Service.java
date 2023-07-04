/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Service {

    Scanner leer = new Scanner(System.in);
    Circunferencia circulo = new Circunferencia();

    public Circunferencia crearCircunferencia() {

        System.out.println("Area: Math.PI * radio * radio ");
        System.out.println("Perimetro: 2 * Math.PI * radio ");
        System.out.println("Ingrese el radio: ");
        circulo.setRadio(leer.nextInt());

        return circulo;
    }
    
    public void mostrar(){
        System.out.println("Area: "+ circulo.area());
        System.out.println("Perimetro: "+ circulo.perimetro());
    }

}
