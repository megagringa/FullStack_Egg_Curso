/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import Entidades.Operaciones;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();
        operacion.crearOperaciones();
        
        System.out.println("Suma: "+operacion.sumar());
        System.out.println("Resta: "+operacion.restar());
        System.out.println("Multiplicar: "+operacion.multiplicar());
        System.out.println("Dividir: "+operacion.dividir());
    }

    
    
}
