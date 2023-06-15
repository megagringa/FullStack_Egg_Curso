/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armor;

/**
 *
 * @author ing_j
 */
public class Guante {
    private int consumoEnergiaBasico;
    private int consumoEnergiaNormal;
    private int consumoEnergiaIntensivo;
    private boolean danado;

    public Guante() {
        consumoEnergiaBasico = 1;
        consumoEnergiaNormal = 2;
        consumoEnergiaIntensivo = 3;
        danado = false;
    }

    public int usar(NivelIntensidad intensidad, int tiempo) {
        if (danado) {
            System.out.println("¡El guante está dañado! No se puede utilizar.");
            return 0;
        }

        int consumoEnergia = 0;

        switch (intensidad) {
            case BASICO:
                consumoEnergia = consumoEnergiaBasico * tiempo;
                break;
            case NORMAL:
                consumoEnergia = consumoEnergiaNormal * tiempo;
                break;
            case INTENSIVO:
                consumoEnergia = consumoEnergiaIntensivo * tiempo;
                break;
        }

        return consumoEnergia;
    }

    public void mostrarEstado() {
        System.out.println("Estado del Guante:");
        System.out.println("Consumo de Energía Básico: " + consumoEnergiaBasico);
        System.out.println("Consumo de Energía Normal: " + consumoEnergiaNormal);
        System.out.println("Consumo de Energía Intensivo: " + consumoEnergiaIntensivo);
        System.out.println("Estado: " + (danado ? "Dañado" : "Sano"));
    }
}
