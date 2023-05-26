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
public class Lavadora extends Electrodomesticos {

    //Scanner read = new Scanner(System.in);
    private double carga;

    public Lavadora() {
        super();
        this.carga = 0;
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public void crearLavadora() {
        crearElectrodomestico();

        System.out.println("Ingrese la carga de la lavadora: ");
        this.carga = read.nextDouble();
    }

    @Override
    public double precioFinal() {

        double precioFinal = super.precioFinal();
        
        if(this.carga>30){
            precioFinal += 500;
        }

        return precioFinal;
    }

}
