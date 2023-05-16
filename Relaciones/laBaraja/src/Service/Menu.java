/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import entity.Baraja;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Menu {

    Scanner leer = new Scanner(System.in);
    Baraja cartas = new Baraja();

    public void menu() {

        cartas.llenarBaraja();
        int op;

        do {
            System.out.println("**********Menu*********");
            System.out.println("*1.-Barajar           *");
            System.out.println("*2.-Siguiente Carta   *");
            System.out.println("*3.-Cartas Disponibles*");
            System.out.println("*4.-Dar Cartas        *");
            System.out.println("*5.-Monton            *");
            System.out.println("*6.-Mostrar baraja    *");
            System.out.println("*7.-Salir             *");
            System.out.println("***********************");

            op = leer.nextInt();
            switch (op) {
                case 1:

                    cartas.barajar();

                    break;
                case 2:
                    cartas.siguienteCarta();
                    break;
                case 3:
                    cartas.cartasDisponibles();
                    break;
                case 4:
                    cartas.darCartas();
                    break;
                case 5:
                    cartas.cartasMonton();
                    break;
                case 6:
                    cartas.mostrarBaraja();
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;

            }
        } while (op != 7);

    }
}
