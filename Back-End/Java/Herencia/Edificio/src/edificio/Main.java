/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package edificio;

import entity.Edificio;
import entity.EdificioDeOficinas;
import entity.Polideportivo;
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
        ArrayList<Edificio> edificios = new ArrayList<>();

        Polideportivo poli1 = new Polideportivo("Polideportivo 1", "Techado", 50, 30, 20);
        Polideportivo poli2 = new Polideportivo("Polideportivo 2", "Abierto", 50, 30, 20);
        edificios.add(poli1);
        edificios.add(poli2);

        EdificioDeOficinas oficina1 = new EdificioDeOficinas(30, 20, 10, 10, 5, 5);
        EdificioDeOficinas oficina2 = new EdificioDeOficinas(40, 30, 15, 20, 4, 8);
        edificios.add(oficina1);
        edificios.add(oficina2);

        for (Edificio edificio : edificios) {
            System.out.println("Superficie del edificio: " + edificio.calcularSuperficie());
            System.out.println("Volumen del edificio: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Instalación: " + polideportivo.getTipoInstalacion());

            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioOficinas = (EdificioDeOficinas) edificio;
                edificioOficinas.cantPersona();

            }
            System.out.println();

        }

    }

}
