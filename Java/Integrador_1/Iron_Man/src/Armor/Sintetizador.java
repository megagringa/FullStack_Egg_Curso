/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armor;

/**
 *
 * @author ing_j
 */
public class Sintetizador {
    
    private int consumoEnergia;
    private boolean danado;

    public Sintetizador() {
        consumoEnergia = 1;
        danado = false;
    }

    public int usar(int tiempo) {
        if (danado) {
            System.out.println("¡El sintetizador está dañado! No se puede utilizar.");
            return 0;
        }

        return consumoEnergia * tiempo;
    }

    public void mostrarEstado() {
        System.out.println("Estado del Sintetizador:");
        System.out.println("Consumo de Energía: " + consumoEnergia);
        System.out.println("Estado: " + (danado ? "Dañado" : "Sano"));
    }
}
