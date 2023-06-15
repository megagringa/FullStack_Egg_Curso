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
public class Movil {
private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo;

    
    public Movil() {
        marca = "";
        precio = 0.0;
        modelo = "";
        memoriaRam = 0;
        almacenamiento = 0;
        codigo = new int[7];
    }

    
    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    
    public void cargarCelular() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la marca: ");
        marca = leer.nextLine();

        System.out.print("Ingrese el precio: ");
        precio = leer.nextDouble();

        leer.nextLine(); // Consumir el salto de línea después de leer el double

        System.out.print("Ingrese el modelo: ");
        modelo = leer.nextLine();

        System.out.print("Ingrese la cantidad de memoria RAM (en GB): ");
        memoriaRam = leer.nextInt();

        System.out.print("Ingrese la cantidad de almacenamiento (en GB): ");
        almacenamiento = leer.nextInt();

        
      
    }

    // Método ingresarCodigo()
    public void ingresarCodigo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código de 7 números:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Dígito " + (i + 1) + ": ");
            codigo[i] = scanner.nextInt();
        }
    }
}