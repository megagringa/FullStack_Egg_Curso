/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos;

import entidades.Puntos;
import service.Service;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Service puntocontrol = new Service();
        Puntos punto1 = puntocontrol.crearPuntos();
        Puntos punto2 = puntocontrol.crearPuntos();
        puntocontrol.calcularDistancia(punto1,punto2);
        
    }
    
}
