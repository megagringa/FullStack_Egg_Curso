/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ing_j
 */
public abstract class Persona {

    protected String nombre;
    protected String apellidos;
    protected String numeroIdentificacion;
    protected String estadoCivil;

    public Persona(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Número de Identificación: " + numeroIdentificacion);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
