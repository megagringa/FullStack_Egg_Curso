/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

/**
 *
 * @author ing_j
 */
public abstract class AlojamientoExtraHotelero extends Alojamiento {
    protected boolean esPrivado;
    protected double metrosCuadrados;

    public AlojamientoExtraHotelero(boolean esPrivado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    
    
}
