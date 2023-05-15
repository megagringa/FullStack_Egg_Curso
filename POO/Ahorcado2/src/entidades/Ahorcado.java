/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Ahorcado {

    private char[] palabra;
    private int encontradas;
    private int intentosMaximos;
    private int intentosRestantes;

    public Ahorcado() {
        this.palabra = new char[0];
        this.encontradas = 0;
        this.intentosMaximos = 0;
        this.intentosRestantes = 0;
    }

    public Ahorcado(String palabra, int intentosMaximos) {
        this.palabra = palabra.toCharArray();
        this.encontradas = 0;
        this.intentosMaximos = intentosMaximos;
        this.intentosRestantes = intentosMaximos;
    }

    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();
        this.palabra = palabra.toCharArray();
        this.encontradas = 0;
        this.intentosRestantes = this.intentosMaximos;
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + this.palabra.length);
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i] == letra) {
                encontrada = true;
                if (i >= this.encontradas) {
                    this.encontradas = i + 1;
                }
            }
        }
        if (!encontrada) {
            this.intentosRestantes--;
            System.out.println("La letra no pertenece a la palabra");
        } else {
            System.out.println("La letra pertenece a la palabra");
        }
        encontradas(letra);
        intentos();
        return encontrada;
    }

    public void encontradas(char letra) {
        int faltantes = this.palabra.length - this.encontradas;
        System.out.println("Número de letras (encontradas, faltantes): (" + this.encontradas + "," + faltantes + ")");
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + this.intentosRestantes);
        if (this.intentosRestantes == 0) {
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
        }
    }

    public void juego() {
        Scanner scanner = new Scanner(System.in);
        while (this.intentosRestantes > 0 && this.encontradas < this.palabra.length) {
            System.out.print("Ingrese una letra: ");
            char letra = scanner.next().charAt(0);
            buscar(letra);
            System.out.println("----------------------------------------------");
        }
        if (this.encontradas == this.palabra.length) {
            System.out.println("Felicitaciones, ha encontrado la palabra!");
        } else {
            System.out.println("Lo sentimos, no ha encontrado la palabra...");
        }
    }

}
