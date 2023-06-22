/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

/**
 *
 * @author ing_j
 */
public abstract class Hotel extends Alojamiento {

    protected int cantidadHabitaciones, numeroCamas, cantidadPisos;

    public Hotel(int cantidadHabitaciones, int numeroCamas, int cantidadPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
    }

    public abstract int obtenerCantidadEstrellas();
    
    @Override
    public abstract double calcularPrecio();
    
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Cantidad de Habitaciones: " + cantidadHabitaciones + "\n" +
                "Número de Camas: " + numeroCamas + "\n" +
                "Cantidad de Pisos: " + cantidadPisos;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

}
