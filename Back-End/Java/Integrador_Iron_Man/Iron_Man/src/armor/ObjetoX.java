/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armor;
import java.util.Random;
/**
 *
 * @author ing_j
 */
public class ObjetoX {
    Random rand = new Random();
    public int Resistencia;
    private boolean hostil;
    private int[] coor;

    public ObjetoX() {
        this.Resistencia = rand.nextInt(50) + 51;
        int aux = rand.nextInt(2);
        if (aux == 0) {
            hostil = true;
        } else {
            this.hostil = false;
        }
        this.coor = new int[3];
        for (int i = 0; i < 3; i++) {
            coor[i]=rand.nextInt(101)-50;
        }
        
        
    }

    @Override
    public String toString() {
        return "Enemigo{" + "Resistencia=" + Resistencia + ", hostil=" + hostil + '}';
    }
}
