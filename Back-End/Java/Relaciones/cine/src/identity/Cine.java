/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identity;

import java.util.Random;

/**
 *
 * @author ing_j
 */
public class Cine {
    
    private Pelicula pelicula;
    private char[][] sala;
    private int filas;
    private int columnas;
    private double precioEntrada;

    public Cine(Pelicula pelicula, int filas, int columnas, double precioEntrada) {
        this.pelicula = pelicula;
        this.filas = filas;
        this.columnas = columnas;
        this.precioEntrada = precioEntrada;
        this.sala = new char[filas][columnas];
        // Inicializar la sala con vacíos asquerosos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sala[i][j] = ' ';
            }
        }
    }

    public void mostrarSala() {
        System.out.println("Sala de Cine:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(i + 1 + " " + (char)('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean ubicarEspectador(Espectador espectador) {
        if (espectador.getEdad() < pelicula.getEdadMinima() || espectador.getDinero() < precioEntrada) {
            return false; // No cumple los requisitos para ver la película
        }
        
        //Ingresa en modo aleatorio.
        Random random = new Random();
        int fila = random.nextInt(filas);
        int columna = random.nextInt(columnas);

        while (sala[fila][columna] == 'X') {
            fila = random.nextInt(filas);
            columna = random.nextInt(columnas);
        }

        sala[fila][columna] = 'X';
        return true;
    }
}
