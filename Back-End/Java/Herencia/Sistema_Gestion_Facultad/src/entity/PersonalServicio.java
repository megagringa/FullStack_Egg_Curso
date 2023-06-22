/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ing_j
 */
public class PersonalServicio extends Empleado {

    private String seccionAsignada;

    public PersonalServicio(String seccionAsignada, int anioIncorporacion, String numeroDespacho, String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }

    public void trasladarSeccion(String nuevaSeccion) {
        this.seccionAsignada = nuevaSeccion;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Sección Asignada: " + seccionAsignada);
    }
}
