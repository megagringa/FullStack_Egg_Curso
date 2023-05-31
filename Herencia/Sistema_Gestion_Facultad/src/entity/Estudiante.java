/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ing_j
 */
public class Estudiante extends Persona {

    private String cursoMatriculado;

    public Estudiante(String cursoMatriculado, String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public void matricularEnCurso(String nuevoCurso) {
        this.cursoMatriculado = nuevoCurso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso Matriculado: " + cursoMatriculado);
    }

}
