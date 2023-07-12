/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import Entidades.Rectangulo;
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
        Service service = new Service();
        Rectangulo rectangulo = service.obtenerDatos();
        System.out.println("----------------");
        System.out.println("----------------");
        service.mostrarDatos();
        System.out.println("----------------");
        System.out.println("----------------");
        service.dibujoR();
        System.out.println("----------------");
        System.out.println("----------------");
    }

}
