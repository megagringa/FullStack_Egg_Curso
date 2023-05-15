/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefono;

import entidad.Movil;


/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Movil movil = new Movil();
        movil.cargarCelular();
        movil.ingresarCodigo();
        
        System.out.println("\nDatos del celular 1:");
        System.out.println("Marca: " + movil.getMarca());
        System.out.println("Precio: " + movil.getPrecio());
        System.out.println("Modelo: " + movil.getModelo());
        System.out.println("Memoria RAM: " + movil.getMemoriaRam());
        System.out.println("Almacenamiento: " + movil.getAlmacenamiento());
        System.out.println("Codigo: " + movil.getCodigo());
        
        
        
    }
    
}
