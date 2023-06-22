/*
 Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package electrodomesticos2;

import entity.Electrodomesticos;
import entity.Lavadora;
import entity.Televisor;
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
        ArrayList<Electrodomesticos> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Lavadora(1500, "blanco", 'A', 30, 10));
        electrodomesticos.add(new Televisor(2000, "negro", 'B', 20, 50, true));
        electrodomesticos.add(new Lavadora(1800, "rojo", 'C', 40, 15));
        electrodomesticos.add(new Televisor(3000, "azul", 'D', 25, 60, false));

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomesticos electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            }

            System.out.println("Precio final del electrodomestico: $" + precioFinal);
        }

        System.out.println("Precio total de las lavadoras: $" + precioTotalLavadoras);
        System.out.println("Precio total de los televisores: $" + precioTotalTelevisores);
        System.out.println("Precio total de todos los electrodomesticos: $" + precioTotalElectrodomesticos);
    }
}
