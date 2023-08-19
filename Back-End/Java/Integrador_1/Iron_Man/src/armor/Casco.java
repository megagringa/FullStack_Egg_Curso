/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armor;

/**
 *
 * @author ing_j
 */
public class Casco {
    private Consola consola;
    private Sintetizador sintetizador;

    public Casco() {
        this.consola = new Consola("Consola");
        this.sintetizador = new Sintetizador("Sintetizador");
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    @Override
    public String toString() {
        return " consola " + consola + ", sintetizador " + sintetizador;
    }
}
