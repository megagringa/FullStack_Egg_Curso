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

     public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia, int nivelSalud, float nivelBateria) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.nivelBateria = nivelBateria;
        this.generador = new Generador();
        this.botaIzquierda = new Bota();
        this.botaDerecha = new Bota();
        this.guanteIzquierdo = new Guante();
        this.guanteDerecho = new Guante();
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
    }
     public void caminar(int tiempo) {
        int consumoEnergia = botaIzquierda.usar(NivelIntensidad.BASICO, tiempo) +
                botaDerecha.usar(NivelIntensidad.BASICO, tiempo);
        actualizarBateria(consumoEnergia);
    }

    public void correr(int tiempo) {
        int consumoEnergia = botaIzquierda.usar(NivelIntensidad.NORMAL, tiempo) +
                botaDerecha.usar(NivelIntensidad.NORMAL, tiempo);
        actualizarBateria(consumoEnergia);
    }

    public void propulsar(int tiempo) {
        int consumoEnergia = botaIzquierda.usar(NivelIntensidad.INTENSIVO, tiempo) +
                botaDerecha.usar(NivelIntensidad.INTENSIVO, tiempo);
        actualizarBateria(consumoEnergia);
    }

    public void volar(int tiempo) {
        int consumoEnergia = botaIzquierda.usar(NivelIntensidad.INTENSIVO, tiempo) +
                botaDerecha.usar(NivelIntensidad.INTENSIVO, tiempo) +
                guanteIzquierdo.usar(NivelIntensidad.NORMAL, tiempo) +
                guanteDerecho.usar(NivelIntensidad.NORMAL, tiempo);
        actualizarBateria(consumoEnergia);
    }

    public void usarGuantes() {
        guanteIzquierdo.disparar();
        guanteDerecho.disparar();
        actualizarBateria(guanteIzquierdo.getConsumoEnergia() + guanteDerecho.getConsumoEnergia());
    }

    public void escribir(String mensaje) {
        consola.escribir(mensaje);
        actualizarBateria(consola.getConsumoEnergia());
    }

    public void hablar(String mensaje) {
        sintetizador.hablar(mensaje);
        actualizarBateria(sintetizador.getConsumoEnergia());
    }

    public void mostrarEstado() {
        System.out.println("Estado de la Armadura Iron Man:");
        System.out.println("Color Primario: " + colorPrimario);
        System.out.println("Color Secundario: " + colorSecundario);
        System.out.println("Nivel de Resistencia: " + nivelResistencia);
        System.out.println("Nivel de Salud: " + nivelSalud);
        System.out.println("Nivel de Batería: " + nivelBateria);
        generador.mostrarEstado();
        botaIzquierda.mostrarEstado();
        botaDerecha.mostrarEstado();
        guanteIzquierdo.mostrarEstado();
        guanteDerecho.mostrarEstado();
        consola.mostrarEstado();
        sintetizador.mostrarEstado();
    }

    public void mostrarEstadoBateria() {
        System.out.println("Estado de la Batería: " + nivelBateria + "%");
    }

    public void mostrarInfoReactor() {
        generador.mostrarInfoReactor();
    }

    private void actualizarBateria(float consumoEnergia) {
        if (nivelBateria >= consumoEnergia) {
            nivelBateria -= consumoEnergia;
        } else {
            System.out.println("¡Batería insuficiente! La armadura se apagará.");
            nivelBateria = 0;
        }
    }
}
    

