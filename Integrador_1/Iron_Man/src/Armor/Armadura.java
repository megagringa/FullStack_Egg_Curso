/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armor;

/**
 *
 * @author ing_j
 */
public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private int nivelResistencia;
    private int nivelSalud;
    private float nivelBateria;
    private Generador generador;
    private Bota botaIzquierda;
    private Bota botaDerecha;
    private Guante guanteIzquierdo;
    private Guante guanteDerecho;
    private Consola consola;
    private Sintetizador sintetizador;

    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia, int nivelSalud, float nivelBateria, Generador generador, Bota botaIzquierda, Bota botaDerecha, Guante guanteIzquierdo, Guante guanteDerecho, Consola consola, Sintetizador sintetizador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.nivelBateria = nivelBateria;
        this.generador = generador;
        this.botaIzquierda = botaIzquierda;
        this.botaDerecha = botaDerecha;
        this.guanteIzquierdo = guanteIzquierdo;
        this.guanteDerecho = guanteDerecho;
        this.consola = consola;
        this.sintetizador = sintetizador;
    }
    
    
}
