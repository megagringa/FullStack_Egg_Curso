/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ing_j
 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        //this.capacidadMaxima=1500;
        //this.cantidadActual=0;
        //this(1500, 0);
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        /* if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        }*/
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        /*if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }*/
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
        /*if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }*/
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("Se lleno la cafetera al maximo: " + cantidadActual);
    }

    public void servirTaza(int tamanoTaza) {
        if (cantidadActual >= tamanoTaza) {
            cantidadActual -= tamanoTaza;
            System.out.println("Se ha servido una taza de " + tamanoTaza);
        } else {
            System.out.println("No hay suficiente café para llenar la taza.");
            System.out.println("Se ha servido una taza de " + cantidadActual);
            cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("Se vacio la cafetera: " + cantidadActual);
    }

    public void agregarCafe(int cantidad) {
        cantidadActual += cantidad;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;

        }
        System.out.println("Se agrego cafe: " + cantidadActual);
    }
}
