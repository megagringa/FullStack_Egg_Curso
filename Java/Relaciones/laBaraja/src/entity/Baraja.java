/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Baraja {

    private ArrayList<Carta> baraja;
    private ArrayList<Carta> desBaraja;
    int i;

    Scanner read = new Scanner(System.in);

    public Baraja() {
        baraja = new ArrayList<>();
        desBaraja = new ArrayList<>();
    }

    public Baraja(ArrayList<Carta> baraja, ArrayList<Carta> desBaraja) {
        this.baraja = baraja;
        this.desBaraja = desBaraja;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getDesBaraja() {
        return desBaraja;
    }

    public void setDesBaraja(ArrayList<Carta> desBaraja) {
        this.desBaraja = desBaraja;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public void llenarBaraja() {
        for (i = 0; i < 12; i++) {
            if (i != 7 && i != 8) {
                baraja.add(new Carta((i + 1), "Espadas"));
                baraja.add(new Carta((i + 1), "Oros"));
                baraja.add(new Carta((i + 1), "Copas"));
                baraja.add(new Carta((i + 1), "Bastos"));
            }
        }
    }

    //Cambia la posición de todas las cartas de forma aleatoria.
    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void siguienteCarta() {
        System.out.println("Su carta es: " + baraja.get(0));
        desBaraja.add(baraja.get(0));
        baraja.remove(0);
        if (baraja.size() < 1 || baraja.size() < 0) {
            System.out.println("No quedan cartas.");
        }
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles: " + baraja.size());
    }

    public void darCartas() {
        System.out.println("Cartas disponibles: " + baraja.size());
        System.out.println("Designe el número de cartas: ");
        int numCartas = read.nextInt();
        i = 0;

        do {
            System.out.println("Su carta es: " + baraja.get(0));
            desBaraja.add(baraja.get(0));
            baraja.remove(0);
            if (baraja.size() < 1 || baraja.size() < 0) {
                System.out.println("No quedan cartas.");
            }
            i++;
        } while (i < numCartas);
    }
    
    public void cartasMonton(){
        if(desBaraja.size()<1){
            System.out.println("No se retirararon cartas.");
            
        }else{
            System.out.println("Cartas que salieron: ");
            for(Carta object: desBaraja){
                System.out.println(object);
            }
        }
    }
    
    public void mostrarBaraja(){
        if(baraja.size()<1){
            System.out.println("NO hay cartas en la baraja.");
        }else{
            System.out.println("-----");
            System.out.println("La baraja es: ");
            for(Carta object: baraja){
                System.out.println(object);
            }
            System.out.println("-----");
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("baraja{");
        sb.append("baraja=").append(baraja);
        sb.append('}');
        return sb.toString();
    }
}
