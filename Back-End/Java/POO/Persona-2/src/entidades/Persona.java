/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Persona {
    private String nombre;
    private Date fechaNacimiento;
    
    public Persona(){
        
    }
    
    public Persona(String nombre,Date fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = leer.nextLine();
        System.out.println("Fecha de nacimiento(dd/mm/yyyy):");
        String fechaNacimientoString = leer.nextLine();
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public int calcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimientoLocal = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(fechaNacimientoLocal, fechaActual).getYears();
    }
    
    public boolean menorQue(int edad) {
        int edadActual = calcularEdad();
        return edadActual < edad;
    }
    
    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.toString());
    }
    
}
