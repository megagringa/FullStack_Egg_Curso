/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armor;

import enums.EstadoDispositivo;
import java.util.Random;
/**
 *
 * @author ing_j
 */
public class Dispositivo {
    Random rand = new Random();
    int consumo;
    EstadoDispositivo estado;
    String nombre;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.consumo = 1000;
        this.estado = EstadoDispositivo.OPERATIVO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public EstadoDispositivo getEstado() {
        return estado;
    }

    public void setEstado(EstadoDispositivo estado) {
        this.estado = estado;
    }

    // validar si se puede usar segun estado averiado / operativo
    public boolean usarDispositivo() {

        if (this.estado.equals(EstadoDispositivo.OPERATIVO)) {

            int numRand = rand.nextInt(100) + 1;
            if (numRand > 30) {

                return true;
            } else {
                System.out.println("El dispositivo resulto averiado durante la ejecucion");
                this.estado = EstadoDispositivo.AVERIADO;
                return false;
            }
        }
        this.estado = EstadoDispositivo.AVERIADO;
        return false;
    }

    // probabilidad de reparar el dispositivo
    public boolean repararDisposivo() {

        int numRand = rand.nextInt(100) + 1;
        if (numRand > 40) {

            return false;
        }
        System.out.println("Reparacion exitosa!!!");
        this.estado = EstadoDispositivo.OPERATIVO;
        return true;
    }

    @Override
    public String toString() {
        return " consumo: " + consumo + " - " + estado;
    }
}
