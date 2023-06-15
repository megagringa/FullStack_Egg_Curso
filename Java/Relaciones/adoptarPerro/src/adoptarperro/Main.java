/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package adoptarperro;

import entity.Perro;
import entity.Person;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro d1 = new Perro("Firulais", "Doberman", "grande", 2);
        Perro d2 = new Perro("Chicho", "Beagle", "mediano", 5);

        Person P1 = new Person("Juan", "Ramales", 25, 123121, d1);
        Person P2 = new Person("Pablo", "Grajales", 55, 525852, d2);

        System.out.println(P1);
        System.out.println(P2.toString());

    }
}
