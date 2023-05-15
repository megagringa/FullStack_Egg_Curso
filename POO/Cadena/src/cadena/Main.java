/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la frase: ");
        String frase = leer.nextLine();
        cadena.setFrase(frase);
        cadena.mostrarVocales();
        cadena.invertirFrase();
        System.out.println("---------");
        System.out.println("Ingrese un caracter: ");
        String letra = leer.nextLine();
        cadena.vecesRepetido(letra);
        System.out.println("---------");
        System.out.println("Ingrese frase nueva: ");
        String nuevaF = leer.nextLine();
        cadena.compararLongitud(nuevaF);
        cadena.unirfrases(nuevaF);
        System.out.println("---------");
        System.out.println("Caracter a reemplazar: ");
        String reemplazo = leer.nextLine();
        System.out.println("Caracter nuevo: ");
        String nuevo = leer.nextLine();
        cadena.reemplazar(reemplazo, nuevo);
        System.out.println("---------");
        System.out.println("Buscar caracter: ");
        String buscar = leer.nextLine();
        boolean contiene = cadena.contiene(buscar);
        System.out.println("La frase esta contenida? : " + contiene + " el carácter " + buscar);
        System.out.println("---------");
    }
    
}
