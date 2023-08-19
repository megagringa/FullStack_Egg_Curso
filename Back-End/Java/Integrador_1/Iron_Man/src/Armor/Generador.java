/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armor;

/**
 *
 * @author ing_j
 */
public class Generador {

    private Integer energia;

    public Generador() {
        this.energia = Integer.MAX_VALUE;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getEnergia() {
        return energia;
    }

    @Override
    public String toString() {
        return "Energia " + energia + " W";
    }
}
