/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

/**
 *
 * @author ing_j
 */
public class BarcoMotor extends Barco {

    private int potenciaCV;

    public BarcoMotor(int potenciaCV, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }
    ///////////---------- agregado
    public int getPotenciaCV() {
        return potenciaCV;
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
//////-------------------------------
    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }
    /////////---------------- agregado
    @Override
    public String toString() {
        return "Barco a Motor== " + super.toString() + ", potenciaCV: " + potenciaCV;
    }

}
