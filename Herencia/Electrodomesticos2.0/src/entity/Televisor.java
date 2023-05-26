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
public class Televisor extends Electrodomesticos {

    private int resolution;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolution = 0;
        this.sintonizadorTDT = false;

    }

//    public Televisor(int resolution, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
//        super(precio, color, consumoEnergetico, peso);
//        this.resolution = resolution;
//        this.sintonizadorTDT = sintonizadorTDT;
//    }
    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolution, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolution = resolution;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public void crearTelevisor() {
        crearElectrodomestico();

        System.out.println("Ingrese la resolucion de la TV: ");
        this.resolution = read.nextInt();

        System.out.println("Sintonizador TDT incorporado?? (true/false)");
        this.sintonizadorTDT = read.nextBoolean();

    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (this.resolution > 40) {
            precioFinal += 1.3;
        }
        if (this.sintonizadorTDT) {
            precioFinal += 500;
        }

        return precioFinal;
    }

}
