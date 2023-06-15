/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armor;

/**
 *
 * @author ing_j
 */
public class Consola {
    private int consumoEnergia;
    private boolean danada;

    public Consola() {
        consumoEnergia = 1;
        danada = false;
    }

    public int usar(int tiempo) {
        if (danada) {
            System.out.println("¡La consola está dañada! No se puede utilizar.");
            return 0;
        }

        return consumoEnergia * tiempo;
    }

    public void mostrarEstado() {
        System.out.println("Estado de la Consola:");
        System.out.println("Consumo de Energía: " + consumoEnergia);
        System.out.println("Estado: " + (danada ? "Dañada" : "Sana"));
    }
}
