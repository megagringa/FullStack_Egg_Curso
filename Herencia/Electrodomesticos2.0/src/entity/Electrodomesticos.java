/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public abstract class Electrodomesticos {

    Scanner read = new Scanner(System.in);
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomesticos() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 1;

    }

    public Electrodomesticos(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        String[] coloresDisponibles = {"blanco", "negro", "rojo",
            "azul", "gris"
        };
        String colorLowerCase = color.toLowerCase();

        for (String colorDisponible : coloresDisponibles) {
            if (colorDisponible.equals(colorLowerCase)) {
                this.color = colorDisponible;
                return;
            }
        }
        this.color = "blanco";
    }

    public void crearElectrodomestico() {
        System.out.println("ingrese precio: ");
        this.precio = read.nextDouble();

        System.out.println("Ingrese el color: ");
        String colorInput = read.next();
        comprobarColor(colorInput);

        System.out.println("Ingrese el consumo (A-F): ");
        char letra = read.next().charAt(0);
        comprobarConsumoEnergetico(letra);

        System.out.println("Ingrese el peso: ");
        this.peso = read.nextDouble();
    }

    public double precioFinal() {
        double precioFinal = this.precio;

        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 500;
        } else if (this.peso > 80) {
            precioFinal += 1000;
        }
        return precioFinal;
    }
}
