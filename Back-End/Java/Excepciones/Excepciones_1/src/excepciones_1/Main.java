/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.
 */
package excepciones_1;

import entidades.Persona;

/**
 *
 * @author ing_j
 */
public class Main {

    /*
     *En el código proporcionado, no se inicializa un objeto de la clase Persona 
     * a null y se invoca el método esMayorDeEdad() a través de ese objeto. 
     * Sin embargo, puedo mostrarte cómo hacerlo y cómo englobar el código 
     * con una cláusula try-catch para controlar la excepción.
     */
    public static void main(String[] args) {
        


        

//        try {
//        Persona persona = null; // Inicializar el objeto a null
//
        Persona persona1 = new Persona();
        persona1.crearPersona();
        System.out.println("-------------------------------------------");
        //Persona persona1 = new Persona("Juan", 34, 'H', 70, 1.75);
        Persona persona2 = new Persona();
        persona1.crearPersona();
        System.out.println("-------------------------------------------");
        //Persona persona2 = new Persona("Ana", 25, 'M', 23, 1.65);
        Persona persona3 = new Persona();
        persona1.crearPersona();
        System.out.println("-------------------------------------------");
        //Persona persona3 = new Persona("Pedro", 17, 'H', 70, 1.80);
        Persona persona4 = new Persona();
        persona1.crearPersona();
        System.out.println("-------------------------------------------");
        //Persona persona4 = new Persona("María", 30, 'M', 17, 1.70);

        System.out.println("la persona " + persona1.getNombre());
        if (persona1.calcularIMC() == -1) {
            System.out.println("Tiene bajo peso.");
        } else if (persona1.calcularIMC() == 0) {
            System.out.println("Tiene un peso ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }

        if (persona1.esMayorDeEdad() == true) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        System.out.println("-------------------------------------------");

        System.out.println("la persona " + persona2.getNombre());
        if (persona2.calcularIMC() == -1) {
            System.out.println("Tiene bajo peso.");
        } else if (persona2.calcularIMC() == 0) {
            System.out.println("Tiene un peso ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }

        if (persona2.esMayorDeEdad() == true) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        System.out.println("-------------------------------------------");

        System.out.println("la persona " + persona3.getNombre());
        if (persona1.calcularIMC() == -1) {
            System.out.println("Tiene bajo peso.");
        } else if (persona3.calcularIMC() == 0) {
            System.out.println("Tiene un peso ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }

        if (persona3.esMayorDeEdad() == true) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        System.out.println("-------------------------------------------");

        System.out.println("la persona " + persona4.getNombre());
        if (persona1.calcularIMC() == -1) {
            System.out.println("Tiene bajo peso.");
        } else if (persona4.calcularIMC() == 0) {
            System.out.println("Tiene un peso ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }

        if (persona4.esMayorDeEdad() == true) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        System.out.println("-------------------------------------------");

        double imcPersona1 = persona1.calcularIMC();
        boolean esMayorDeEdadPersona1 = persona1.esMayorDeEdad();

        double imcPersona2 = persona2.calcularIMC();
        boolean esMayorDeEdadPersona2 = persona2.esMayorDeEdad();

        double imcPersona3 = persona3.calcularIMC();
        boolean esMayorDeEdadPersona3 = persona3.esMayorDeEdad();

        double imcPersona4 = persona4.calcularIMC();
        boolean esMayorDeEdadPersona4 = persona4.esMayorDeEdad();

        int porDebajoPesoIdeal = 0;
        int enPesoIdeal = 0;
        int porEncimaPesoIdeal = 0;

        if (imcPersona1 == -1) {
            porDebajoPesoIdeal++;
        } else if (imcPersona1 == 0) {
            enPesoIdeal++;
        } else {
            porEncimaPesoIdeal++;
        }

        if (imcPersona2 == -1) {
            porDebajoPesoIdeal++;
        } else if (imcPersona2 == 0) {
            enPesoIdeal++;
        } else {
            porEncimaPesoIdeal++;
        }

        if (imcPersona3 == -1) {
            porDebajoPesoIdeal++;
        } else if (imcPersona3 == 0) {
            enPesoIdeal++;
        } else {
            porEncimaPesoIdeal++;
        }

        if (imcPersona4 == -1) {
            porDebajoPesoIdeal++;
        } else if (imcPersona4 == 0) {
            enPesoIdeal++;
        } else {
            porEncimaPesoIdeal++;
        }

        double porcentajePorDebajo = porDebajoPesoIdeal * 100 / 4.0;
        double porcentajeEnPesoIdeal = enPesoIdeal * 100 / 4.0;
        double porcentajePorEncima = porEncimaPesoIdeal * 100 / 4.0;

        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;

        if (esMayorDeEdadPersona1) {
            mayoresDeEdad++;
        } else {
            menoresDeEdad++;
        }

        if (esMayorDeEdadPersona2) {
            mayoresDeEdad++;
        } else {
            menoresDeEdad++;
        }

        if (esMayorDeEdadPersona3) {
            mayoresDeEdad++;
        } else {
            menoresDeEdad++;
        }

        if (esMayorDeEdadPersona4) {
            mayoresDeEdad++;
        } else {
            menoresDeEdad++;
        }

        double porcentajeMayores = mayoresDeEdad * 100 / 4.0;
        double porcentajeMenores = menoresDeEdad * 100 / 4.0;

        System.out.println("Porcentaje por debajo: " + porcentajePorDebajo);
        System.out.println("Porcentaje ideal: " + porcentajeEnPesoIdeal);
        System.out.println("Porcentaje por encima: " + porcentajePorEncima);

        System.out.println("Porcentaje de mayores de edad: " + porcentajeMayores);
        System.out.println("Porcentaje por menores de edad: " + porcentajeMenores);

        //        // Intentar invocar el método en el objeto nulo
//        boolean esMayor = persona.esMayorDeEdad();
//        System.out.println("¿Es mayor de edad? " + esMayor);
//    } catch (NullPointerException e) {
//        System.out.println("Se produjo una excepción: " + e.getMessage());
//    }
//}
    }
}
