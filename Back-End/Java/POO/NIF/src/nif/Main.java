/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nif;

import entidades.NIF;
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
       NIF nif = service.crearNif();
       service.mostrar(nif);
       
    }
    
}
