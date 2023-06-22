/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

import java.time.LocalDate;

/**
 *
 * @author ing_j
 */
public class Alquiler {

    private String nombre;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombre, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double calcularAlquiler() {
        int diasOcupados = calcularDiasOcupados();
        double moduloBarco = barco.calcularModulo();
        return diasOcupados * moduloBarco;
    }

    private int calcularDiasOcupados() {
        return fechaDevolucion.compareTo(fechaAlquiler);// la comparacion del horror!!!
    }
    //////// ----------------- Agregado.
    public String getNombre() {
        return nombre;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    @Override
    public String toString() {
        return "Alquiler == " + "nombre=" + nombre
                + ", documentoCliente=" + documentoCliente + ", fechaAlquiler="
                + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion
                + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco;
    }

}
