/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceRaices;

import entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class ServiceRaices {
    
    public Raices crearRaices(){
        Raices raices = new Raices();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de a: ");
        raices.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de b: ");
        raices.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de c: ");
        raices.setC(leer.nextDouble());
        
        return raices;
    }
   
   public Double getDiscriminante(Raices raices){
      return Math.pow(raices.getB(), 2) - (4 * raices.getA()) * (raices.getC()) ;
         
    }
   
   public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) >= 0;
    }
   
   public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }
    
   public void obtenerRaices(Raices raices) {
        if (tieneRaices(raices)) {
            double x1 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            double x2 = (-raices.getB() - Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            System.out.println("Las raices son: " + x1 + " y " + x2);
        } else {
            System.out.println("No existen raices reales");
        }
    }
   
   public void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices)) {
            double x = -raices.getB() / (2 * raices.getA());
            System.out.println("La unica raiz es: " + x);
        } else {
            System.out.println("No existe una unica raiz real");
        }
    }
   
    public void calcular(Raices raices) {
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No existen soluciones reales");
        }
    }
   
}
