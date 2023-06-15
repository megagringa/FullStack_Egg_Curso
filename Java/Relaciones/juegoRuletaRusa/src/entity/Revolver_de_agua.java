/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ing_j
 */
public class Revolver_de_agua {

    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        this.posicionActual = (int) (Math.random() * 6) + 1;
        this.posicionAgua = (int) (Math.random() * 6) + 2;
    }

    public boolean mojar() {
        return this.posicionAgua == this.posicionActual;
    }

    public void siguienteCHorro() {
        if (this.posicionActual != 6) {
            this.posicionActual += 1;
        } else {
            this.posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver_de_agua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

}
