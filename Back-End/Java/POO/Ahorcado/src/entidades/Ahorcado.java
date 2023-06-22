/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Ahorcado {

    private LinkedList<String> palabra = new LinkedList<>();
    private LinkedList<String> palabrasDisponibles = new LinkedList<>();
    private LinkedList<String> rallitas = new LinkedList<>();
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    private LinkedList<String> letrasDichas = new LinkedList<>();
    private int valorEntero;

    public Ahorcado() {
        //agrega palabras String en palabrasDisponibles
        palabrasDisponibles.add("arco");
        palabrasDisponibles.add("azul");
        palabrasDisponibles.add("asno");
        palabrasDisponibles.add("ayer");
        palabrasDisponibles.add("azar");
        palabrasDisponibles.add("agua");

    }

    public void bienvenida() {
        System.out.println("Que quieres hacer");
        System.out.println("Pulsa 1 para jugar");
        System.out.println("Pulsa 0 para abandonar");
        String eleccion = leer.nextLine();
        while (!eleccion.equals("0")) {
            if (eleccion.equals("1")) {
                adivinarLetra();
            } else {
                System.out.println("Eleecion no valida.Probar de nuevo.");
                eleccion = leer.nextLine();
            }
        }
        System.out.println("Adios.");
        System.exit(0);
    }

    public void adivinarLetra() {
        valorEntero = (int) (Math.random() * palabrasDisponibles.size());
        convertirEnRallitas();
        String empezar = "";
        empezar = rallitas.toString().replaceAll("[\\[\\]]", "").replaceAll(",", " ");
        System.out.println(empezar);

        int completo = 0;

        while (completo < palabra.size()) {
            System.out.println(" ");
            System.out.println("Introduce una letra que forma la palabra.");
            String adivinaLetra = leer2.nextLine();

            for (int i = 0; i < palabra.size(); i++) {
                if (palabra.get(i).equals(adivinaLetra)) {
                    rallitas.set(i, adivinaLetra.toString());
                    completo++;
                } else {
                    completo = completo;
                }
            }
            letrasDichas.add(adivinaLetra);
            System.out.println("Las letras que colocaste son: "+letrasDichas);
            String resultado = rallitas.toString().replaceAll("[\\[\\]]", "").replaceAll(",", " ");
            System.out.println(resultado);
        }
        System.out.println("");
        System.out.println("Completo la palabra.");
        System.out.println("");
        
        letrasDichas.clear();
        bienvenida();
    }

    public void convertirEnRallitas() {
        String escogida = "";
        escogida = palabrasDisponibles.get(valorEntero);
        int j = 0;
        int m = 0;
        
        palabra.clear();

        while (j < escogida.length()) {
            char letra = escogida.charAt(j);
            String letraEnString = String.valueOf(letra);
            palabra.add(letraEnString);
            j++;
        }

        rallitas.clear();
        while (m < palabra.size()) {
            rallitas.add("_");
            m++;
        }

    }

}
