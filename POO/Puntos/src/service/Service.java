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

    public Puntos crearPuntos() {
        Scanner leer = new Scanner(System.in);
        Puntos punto = new Puntos();
        System.out.println("Ingrese la coordenada x: ");
        punto.setX(leer.nextInt());
        System.out.println("Ingrese la coordenada y: ");
        punto.setY(leer.nextInt());
       
        return punto;
    }
    
    public void calcularDistancia(Puntos punto1, Puntos punto2){
        double C1 = (punto2.getX()-punto1.getX());
        double C2 = (punto2.getY()-punto1.getY());
        
        double distancia = Math.sqrt(Math.pow(C1,2)+Math.pow(C2,2));
        System.out.println("La distancia es: " + distancia);
    }
    
    

}
