/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raices;

import entidades.Raices;
import serviceRaices.ServiceRaices;

/**
 *
 * @author ing_j
 */
public class Main {

    public static void main(String[] args) {
        ServiceRaices service = new ServiceRaices();
        Raices raices = service.crearRaices();
        service.obtenerRaices(raices);
        service.obtenerRaiz(raices);
        service.calcular(raices);
        
    }
    
}
