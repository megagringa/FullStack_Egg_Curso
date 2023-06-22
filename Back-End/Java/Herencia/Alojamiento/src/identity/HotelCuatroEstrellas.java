/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

/**
 *
 * @author ing_j
 */
public class HotelCuatroEstrellas extends Hotel {

    private String gimnasio, nombreRestaurante;
    private int capacidadRestaurante;

    public HotelCuatroEstrellas(String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public double calcularPrecio() {
        double valorRestaurante = 0;
        if (capacidadRestaurante < 30) {
            valorRestaurante = 10;

        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valorRestaurante = 30;

        } else if (capacidadRestaurante > 50) {
            valorRestaurante = 50;
        }
        double valorGimnasio = 0;
        if (gimnasio.equals('A')) {
            valorGimnasio = 50;

        } else if (gimnasio.equals('B')) {
            valorGimnasio = 30;
        }
        return 50 + (1 * cantidadHabitaciones) + valorRestaurante + valorGimnasio;
    }
    
    @Override
    public int obtenerCantidadEstrellas(){
        return 4;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Gimnasio: " + gimnasio + "\n" +
                "Nombre del Restaurante: " + nombreRestaurante + "\n" +
                "Capacidad del Restaurante: " + capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }
    
    
}
