package service;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Service {
    Scanner leer = new Scanner(System.in);
    Cuenta cuenta = new Cuenta();

    public Cuenta crearCuenta() {

        System.out.println("Ingrese el numero de cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el dni del cliente: ");
        cuenta.setDni(leer.nextInt());
        System.out.println("Ingrese el saldo actual: ");
        cuenta.setSaldoActual(leer.nextInt());
        System.out.println("Ingrese el interes: ");
        cuenta.setInteres(leer.nextInt());
        return cuenta;
    }

}
