/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ing_j
 */
public class Jugador {
    private int numeroJugador;
    private String nombreJugador;
    private boolean mojado = true;

    public Jugador() {
    }

    public Jugador(int numeroJugador, String nombreJugador, boolean mojado) {
        this.numeroJugador = numeroJugador;
        this.nombreJugador = nombreJugador;
        this.mojado = mojado;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(Revolver_de_agua revolver){
       if(revolver.mojar()){
           mojado = false;
       }else{
           mojado = true;
           revolver.siguienteCHorro();
       } 
       return mojado;
    }
    
}
