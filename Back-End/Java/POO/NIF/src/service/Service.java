/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.NIF;
import java.util.Scanner;



/**
 *
 * @author ing_j
 */
public class Service {

     //private final char[] LETRAS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
     //double letra;
     
     
    /* private char calcularLetraDNI(NIF nif) {
        int resto = (int) (nif.getDni() % 23);
        
        if (resto >= 0 && resto <= 22) {
            nif.setLetra(LETRAS_DNI[resto]);
        }
        
        return LETRAS_DNI[resto];
    }*/
    
    public NIF crearNif() {
        NIF nif = new NIF();
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el número de DNI:");
        nif.setDni(leer.nextInt()); 
        //letra = calcularLetraDNI(nif);
        int resto = (int) (nif.getDni() % 23);
        String[] letras = {"T", "R", "W'", "A", "G", "M", "Y", "F", "P", "D","X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        if (resto >= 0 && resto <= 22) {
            nif.setLetra(letras[resto]);
        }
   
        return nif;
    }

    
    public void mostrar(NIF nif) {
        System.out.println(String.format("%08d", nif.getDni()) + "-" + nif.getLetra());
    }


}
