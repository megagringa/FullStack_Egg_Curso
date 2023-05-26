/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package geometria;

import interfaz.Circulo;
import interfaz.Rectangulo;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Rectangulo rectangulo = new Rectangulo(2,3);
        
        System.out.println("Circulo: ");
        System.out.println("Area: "+ circulo.calcularArea());
        System.out.println("Perimetro: "+ circulo.calcularPerimetro());
        
        System.out.println("Rectangulo: ");
        System.out.println("Area: "+ rectangulo.calcularArea());
        System.out.println("Perimetro: "+ rectangulo.calcularPerimetro());
    }
    
}
