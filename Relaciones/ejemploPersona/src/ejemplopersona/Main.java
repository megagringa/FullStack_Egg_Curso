/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopersona;

import entity.Dni;
import entity.Persona;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dni miDni = new Dni();
        miDni.setNumero(123456789);
        miDni.setSerie("#");
        
        Persona miPersona = new Persona();
        miPersona.setDni(miDni);
        miPersona.setNombre("Juan Pablo");
        miPersona.setApellido("Lopez");
        
        System.out.println(miPersona.toString());
    }
    
}
