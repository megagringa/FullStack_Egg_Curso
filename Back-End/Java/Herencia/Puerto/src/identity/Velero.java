/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

/**
 *
 * @author ing_j
 */
public class Velero extends Barco{
    private int numeroMastiles;

    public Velero(int numeroMastiles, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    
    @Override
    public double calcularModulo(){
        return super.calcularModulo() + numeroMastiles;
    }
    
    //////////////---------------- Agregado

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    @Override
    public String toString() {
        return "Velero == " + super.toString() + "numeroMastiles: " + numeroMastiles + '}';
    }
    
    
    
}
