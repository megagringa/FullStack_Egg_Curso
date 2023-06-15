/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ing_j
 */
public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoInstalacion;

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho + largo + alto);//(ancho * largo + ancho * alto + largo * alto);//(ancho*2 + largo*2 + alto*2)
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }

}
