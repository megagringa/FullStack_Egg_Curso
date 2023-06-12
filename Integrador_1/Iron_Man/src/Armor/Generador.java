/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armor;

/**
 *
 * @author ing_j
 */
public class Generador {

    private float cargaMaximaReactor;

    public Generador() {
        cargaMaximaReactor = Float.MAX_VALUE;
    }

    public void mostrarEstado() {
        System.out.println("Estado del Generador:");
        System.out.println("Carga Máxima del Reactor: " + cargaMaximaReactor);
    }

    public void mostrarInfoReactor() {
        System.out.println("Estado del Reactor:");
        System.out.println("Carga Máxima del Reactor: " + cargaMaximaReactor);
        System.out.println("Carga Máxima del Reactor en Joules: "
                + convertirUnidadesReactor(cargaMaximaReactor, "Joules"));
        System.out.println("Carga Máxima del Reactor en Ergios: "
                + convertirUnidadesReactor(cargaMaximaReactor, "Ergios"));
    }

    private float convertirUnidadesReactor(float cargaMaxima, String unidadDestino) {
        switch (unidadDestino) {
            case "Joules":
                return cargaMaxima * 4.184f;
            case "Ergios":
                return cargaMaxima * 41840000f;
            default:
                return 0;
        }
    }
}
