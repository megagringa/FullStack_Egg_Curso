/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

/**
 *
 * @author ing_j
 */
public abstract class Barco {

    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public double calcularModulo() {
        return eslora * 10;
    }
/////////////////----------------Agregado
    @Override
    public String toString() {
        return "Datos: " + "matricula: " + matricula + ", eslora: " + eslora + ", anioFabricacion: " + anioFabricacion +", ";
    }
    
    
}
