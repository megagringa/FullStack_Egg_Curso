/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package alojamiento;

import identity.Alojamiento;
import identity.Camping;
import identity.Hotel;
import identity.HotelCincoEstrellas;
import identity.HotelCuatroEstrellas;
import identity.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Alojamiento> alojamientos = new ArrayList<>();

        // Agregar alojamientos al listado
        alojamientos.add(new HotelCuatroEstrellas("Gim4","Resto4",50,30,20,10,"Hotel4","direcc1","Cord","Siruja"));
        alojamientos.add(new HotelCincoEstrellas("Gim5", "Resto5", 15, 20, 25, 10, 30, 25, 15, "Hotel5", "direcc2", "TUCU", "LOSACA"));
        alojamientos.add(new Camping(20, 5, true, false, 45, "Camp", "Ing", "Can", "So"));
        alojamientos.add(new Residencia(10, false, true, true, 35, "Resi", "Dencia", "Harto", "Estoy"));

        // Consulta: Todos los alojamientos
        System.out.println("---- Todos los alojamientos ----");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.toString());
            System.out.println("--------------------------------");
        }

        // Consulta: Todos los hoteles de más caro a más barato
        System.out.println("---- Hoteles de más caro a más barato ----");
        List<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        hoteles.sort(Comparator.comparingDouble(Hotel::calcularPrecio).reversed());
        for (Hotel hotel : hoteles) {
            System.out.println(hotel.toString());
            System.out.println("--------------------------------");
        }

        // Consulta: Todos los campings con restaurante
        System.out.println("---- Campings con restaurante ----");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.tieneRestaurante()) {
                    System.out.println(camping.toString());
                    System.out.println("--------------------------------");
                }
            }
        }

        // Consulta: Todas las residencias que tienen descuento
        System.out.println("---- Residencias con descuento ----");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if (residencia.haceDescuentosGremios()) {
                    System.out.println(residencia.toString());
                    System.out.println("--------------------------------");
                }
            }
        }
    }
}