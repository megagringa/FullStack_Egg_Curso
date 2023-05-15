/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploequipo;

import entity.Equipo;
import entity.Jugador;
import java.util.ArrayList;

/**
 *
 * @author ing_j
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador1 =new  Jugador();
        jugador1.setNombre("JuanPa");
        jugador1.setApellido("López");
        jugador1.setPosicion("defensa");
        jugador1.setNumero(3);
        Jugador jugador2 = new Jugador("Eduardo","Gonzáles","mediocampista",9);
        Jugador jugador3 = new Jugador("Daniel","Palma","delantero",11);
        Jugador jugador4 = new Jugador("Lina","Ascanio","delantera",18);
        Jugador jugador5 = new Jugador("Ruben","Pinto","defensa",2);
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        jugadores.add(jugador5);
        
        Equipo miEquipo = new Equipo();
        miEquipo.setJugadores(jugadores);
        
        System.out.println(miEquipo);
    }
    
}
