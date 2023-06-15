/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

/**
 *
 * @author ing_j
 */
public class Camping extends AlojamientoExtraHotelero{
    private int capacidadMaximaCarpas,cantidadBanos;
    private boolean tieneRestaurante;

    public Camping(int capacidadMaximaCarpas, int cantidadBanos, boolean tieneRestaurante, boolean esPrivado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public boolean tieneRestaurante() {
        return tieneRestaurante;
    }

    @Override
    public double calcularPrecio() {
        return 0; // Precio para campings
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Capacidad Máxima de Carpas: " + capacidadMaximaCarpas + "\n" +
                "Cantidad de Baños: " + cantidadBanos + "\n" +
                "Tiene Restaurante: " + (tieneRestaurante ? "Sí" : "No");
    }
    
    
}
