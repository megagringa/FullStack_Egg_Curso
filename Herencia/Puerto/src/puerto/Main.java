/*
 En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package puerto;

import identity.Alquiler;
//import identity.Barco;
import identity.BarcoMotor;
import identity.Velero;
import identity.YateDeLujo;
import java.time.LocalDate;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Velero velero = new Velero(3, "Fiero", 13, 2016);
        Alquiler alquilerVelero = new Alquiler("Pancracio", "123456789", LocalDate.of(2023, 5, 1), LocalDate.of(2023, 5, 5), 1, velero);
        double precioVelero = alquilerVelero.calcularAlquiler();
        System.out.println("Alquiler - Velero - $" + precioVelero);
        System.out.println(velero.toString());
        System.out.println(alquilerVelero.toString());
        
        System.out.println("--------------------------------------------");

        BarcoMotor barcoMotor = new BarcoMotor(300, "Motoraso", 15.0, 2018);
        Alquiler alquilerBarcoMotor = new Alquiler("Muertacia", "987654321", LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), 2, barcoMotor);
        double precioBarcoMotor = alquilerBarcoMotor.calcularAlquiler();
        System.out.println("Precio - Barcos a Motor - $" + precioBarcoMotor);
        System.out.println(barcoMotor.toString());
        System.out.println(alquilerBarcoMotor.toString());
        
        System.out.println("--------------------------------------------");

        YateDeLujo yateLujo = new YateDeLujo(500, 4, "YateGusto", 20.0, 2020);
        Alquiler alquilerYateLujo = new Alquiler("Sufriendo", "456123789", LocalDate.of(2023, 7, 1), LocalDate.of(2023, 7, 10), 3, yateLujo);
        double precioYateLujo = alquilerYateLujo.calcularAlquiler();
        System.out.println("Precio - Yate de lujo - $" + precioYateLujo);
        System.out.println(yateLujo.toString());
        System.out.println(alquilerYateLujo.toString());
        
        System.out.println("--------------------------------------------");
    }

}
