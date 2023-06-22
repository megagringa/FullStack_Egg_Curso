/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ing_j
 */
public class Profesor extends Empleado {

    private String departamento;

    public Profesor(String departamento, int anioIncorporacion, String numeroDespacho, String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Departamento: " + departamento);
    }

}
