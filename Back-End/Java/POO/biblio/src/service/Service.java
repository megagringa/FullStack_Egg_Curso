/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Service {
    Scanner leer = new Scanner(System.in);
    Libro libro = new Libro();
    public Libro cargarLibros() {
        
        
        System.out.println("Ingrese el ISBN del libro: ");
        libro.setIsbn( leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el título del libro: ");
        libro.setTitulo(leer.nextLine());
        //leer.nextInt();
        System.out.println("Ingrese el autor del libro: ");
        libro.setAutor(leer.nextLine());
        System.out.println("Ingrese el numero de páginas del libro: ");
        libro.setNpaginas(leer.nextInt());
        
        return libro;
    }

    
    
    public void mostrarInformacion(){
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Título: " +libro.getTitulo());
        System.out.println("Autor: " +libro.getAutor());
        System.out.println("Número de páginas: " +libro.getNpaginas());
        
    }
}
