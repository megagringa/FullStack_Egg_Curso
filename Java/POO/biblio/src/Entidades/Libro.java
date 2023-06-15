/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int npaginas;
    

    public Libro() {

    }

    public Libro(int isbn, String titulo, String autor, int npaginas) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.npaginas = npaginas;
        this.isbn = isbn;
    }

    public void cargarLibros() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el ISBN del libro: ");
        isbn = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el título del libro: ");
        titulo = leer.nextLine();
        //leer.nextInt();
        System.out.println("Ingrese el autor del libro: ");
        autor = leer.nextLine();
        System.out.println("Ingrese el numero de páginas del libro: ");
        npaginas = leer.nextInt();
        
    }

    
    
    public void mostrarInformacion(){
        System.out.println("ISBN: " +this.isbn);
        System.out.println("Título: " +this.titulo);
        System.out.println("Autor: " +this.autor);
        System.out.println("Número de páginas: " +this.npaginas);
        
    }
    
    
}
