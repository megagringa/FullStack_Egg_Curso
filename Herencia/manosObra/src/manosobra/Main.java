/*
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package manosobra;

import entity.Animal;
import entity.Gato;
import entity.Perro;
import java.util.ArrayList;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        animales.add(a);
        animales.add(b);
        animales.add(c);

        for (Animal animal : animales) {
            System.out.println(animal.hacerRuido());
        }
    }
}
