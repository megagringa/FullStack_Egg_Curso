/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

/**
 *
 * @author ing_j
 */
public class YateDeLujo extends Barco {

    private int potenciaCV;
    private int numeroCamarotes;

    public YateDeLujo(int potenciaCV, int numeroCamarotes, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }
//////////////------------- agregado
    public int getPotenciaCV() {
        return potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
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
///////-------------------------
    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numeroCamarotes;
    }
///////------------------ agregado
    @Override
    public String toString() {
        return "Yate de Lujo== " + super.toString() + "potenciaCV: " + potenciaCV + ", numeroCamarotes: " + numeroCamarotes;
    }

}
