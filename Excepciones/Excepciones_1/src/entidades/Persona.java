/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Persona {
  
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {

    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();
        
        System.out.println("Ingrese el sexo con la letra(H,M,O): ");
        sexo = leer.next().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo incorrecto, ingrese si o si (H,M,O).");
            sexo = leer.next().charAt(0);
        }
        System.out.print("Introduce el peso en kg: ");
        peso = leer.nextDouble();
        
        System.out.print("Introduce la altura en metros: ");
        altura = leer.nextDouble();
        
    }

    public int calcularIMC() {
        double ideal = peso / Math.pow(altura, 2);
        if (ideal < 20) {
            return -1;
        } else if (ideal >= 20 && ideal <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}