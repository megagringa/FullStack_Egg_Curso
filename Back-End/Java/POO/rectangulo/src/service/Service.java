package service;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Service {

    Rectangulo rectangulo = new Rectangulo();

    public Rectangulo obtenerDatos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura: ");
        rectangulo.setAltura(leer.nextInt());
        System.out.println("Ingrese la base: ");
        rectangulo.setBase(leer.nextInt());

        return rectangulo;
    }

    public void mostrarDatos() {
        System.out.println("SUperficie: " + rectangulo.superficie());
        System.out.println("Perimetro: " + rectangulo.perimetro());

    }

    public void dibujoR() {

        rectangulo.dibujarRectangulo();
    }

}

