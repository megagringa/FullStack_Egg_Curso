/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entindades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class ServicePelicula {

    Pelicula peli = new Pelicula();
    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> movie = new ArrayList();

    public void cargarPelicula() {
        String ask = "s";

        while (ask.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el nombre de la pelicula: ");
            peli.setTitulo(leer.nextLine());
            System.out.println("Ingrese el nombre del director: ");
            peli.setDuracion(leer.nextInt());
            System.out.println("Ingrese la duracion de la pelicula: ");
            peli.setTitulo(leer.nextLine());
            Pelicula cinema = new Pelicula(peli.getTitulo(), peli.getDirector(), peli.getDuracion());
            movie.add(cinema);
            System.out.println("Desea agregar otra pelicula? (S/N)");
            ask = leer.next();
            leer.nextLine();
        }
    }

    public void mostrarPelicula() {
        for (Pelicula cinepo : movie) {
            System.out.println(cinepo.toString());
        }
    }

    public void muestraHora() {
        for (Pelicula cinepo : movie) {
            if (cinepo.getDuracion() > 60) {
                System.out.println(cinepo.toString());
            }
        }
    }
    
    public void ordDesc(){
        movie.sort(Pelicula.ordenar);
        mostrarPelicula();
    }
    
    public void ordAsc(){
        movie.sort(Pelicula.ord);
        mostrarPelicula();
    }
    
    public void ordTit(){
        movie.sort(Pelicula.title);
        mostrarPelicula();
    }
    
    public void ordDir(){
        movie.sort(Pelicula.direc);
        mostrarPelicula();
    }

}
