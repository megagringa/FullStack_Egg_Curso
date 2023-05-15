/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author ing_j
 */
public class NIF {
    private long dni;
    private String letra;  
    
    
    
    public NIF() {
    }

    
    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    
   
    
}
