/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

/**
 *
 * @author ing_j
 */
public class Residencia extends AlojamientoExtraHotelero {

    private int cantidadHabitaciones;
    private boolean haceDescuentosGremios;
    private boolean tieneCampoDeportivo;

    public Residencia(int cantidadHabitaciones, boolean haceDescuentosGremios, boolean tieneCampoDeportivo, boolean esPrivado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.haceDescuentosGremios = haceDescuentosGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public boolean haceDescuentosGremios() {
        return haceDescuentosGremios;
    }

    public boolean tieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    @Override
    public double calcularPrecio() {
        return 0; // Precio para residencias
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Cantidad de Habitaciones: " + cantidadHabitaciones + "\n" +
                "Hace Descuentos a Gremios: " + (haceDescuentosGremios ? "Sí" : "No") + "\n" +
                "Tiene Campo Deportivo: " + (tieneCampoDeportivo ? "Sí" : "No");
    }
}
