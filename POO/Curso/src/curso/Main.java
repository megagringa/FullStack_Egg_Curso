/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

import entidad.Curso;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Curso curso = new Curso();
       curso.crearCurso();
       curso.cargarAlumnos();
        System.out.println("Ganancia semanal "+curso.calcularGananciaSemanal());
    }
    
}
