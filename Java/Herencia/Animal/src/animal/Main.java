/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */
package animal;

import entity.Animal;
import entity.Caballo;
import entity.Gato;
import entity.Perro;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("chiquito", "hueso", 5, "husky");
        System.out.println(perro.alimentarseAnimal());
        
        Animal gato = new Gato("copo", "raton", 3, "angora");
        System.out.println(gato.alimentarseAnimal());
        
        Animal caballo = new Caballo("spirit", "hierba", 7, "pura sangre");
        System.out.println(caballo.alimentarseAnimal());

    }

}
