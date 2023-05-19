/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;


import java.util.List;

/**
 *
 * @author ing_j
 */
public class Voto {
   private Alumno alumno;
    private List<Alumno> alumnosVotados;

    public Voto(Alumno alumno, List<Alumno> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnosVotados=" + alumnosVotados + '}';
    }
    
    
}