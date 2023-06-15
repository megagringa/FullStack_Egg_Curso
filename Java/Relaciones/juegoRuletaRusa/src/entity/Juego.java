/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ing_j
 */
public class Juego {

    private List<Jugador> jugadores = new ArrayList<>();
    private Revolver_de_agua revolver;
    private boolean bandera;

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver_de_agua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        do {
            bandera = true;
            for (Jugador jugador : jugadores) {
                System.out.println("turno del jugador: "
                        + jugador.getNumeroJugador() + "-"
                        + jugador.getNombreJugador());

                if (jugador.disparo(revolver)) {
                    System.out.println("Se ha salvado.");
                    System.out.println(revolver);
                } else {
                    System.out.println("Muerto por chorro.");
                    System.out.println(revolver);
                    bandera = false;
                    break;
                }
            }
        } while (bandera);
    }
}
