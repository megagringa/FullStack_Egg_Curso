/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Curso {

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso() {

    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana,
            String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;

    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos() {
        Scanner sc = new Scanner(System.in);
        this.alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            this.alumnos[i] = sc.nextLine();
        }
    }

    public void crearCurso() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del curso: ");
        this.nombreCurso = sc.nextLine();
        System.out.print("Ingrese la cantidad de horas por día: ");
        this.cantidadHorasPorDia = sc.nextInt();
        System.out.print("Ingrese la cantidad de días por semana: ");
        this.cantidadDiasPorSemana = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el turno (mañana o tarde): ");
        this.turno = sc.nextLine();
        System.out.print("Ingrese el precio por hora: ");
        this.precioPorHora = sc.nextDouble();
        cargarAlumnos();
    }
    
    public double calcularGananciaSemanal() {
        return this.cantidadHorasPorDia * this.precioPorHora * 5 * this.cantidadDiasPorSemana * this.alumnos.length;
    }
}
