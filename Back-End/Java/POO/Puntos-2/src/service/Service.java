/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Service {
    
    public Puntos crearPuntos(){
        Puntos punto = new Puntos();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor x1: ");
        punto.setX1(leer.nextInt());
        System.out.println("Ingrese el valor x2: ");
        punto.setX2(leer.nextInt());
        System.out.println("Ingrese el valor y1: ");
        punto.setY1(leer.nextInt());
        System.out.println("Ingrese el valor y2: ");
        punto.setY2(leer.nextInt());
        
        
        return punto;
    }
    
    public void calcularDistancia(Puntos punto1){
        double C1 = (punto1.getX2()-punto1.getX1());
        double C2 = (punto1.getY2()-punto1.getY1());
        
        double distancia = Math.sqrt(Math.pow(C1,2)+Math.pow(C2,2));
        System.out.println("La distancia es: " + distancia);
    }
    
}
