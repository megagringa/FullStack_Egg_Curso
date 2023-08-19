/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armor;

/**
 *
 * @author ing_j
 */
public class Bota extends Dispositivo{

    public Bota(String nombre) {
        super(nombre);
    }
    
    
    
   @Override
    public String toString() {
        return "Bota consumo: " + consumo + " - " + estado;
    }

}