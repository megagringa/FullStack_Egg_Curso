package service;

import Entidades.Operaciones;
import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Service {

    Scanner leer = new Scanner(System.in);
    Operaciones operacion = new Operaciones();

    public Operaciones crearOperaciones() {

        System.out.println("Ingrese dos numeros para sumar, restar, "
                + "multiplicar y dividir: ");
        System.out.println("Ingrese el primer numero para operar: ");
        operacion.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero para operar: ");
        operacion.setNumero2(leer.nextInt());

        return operacion;
    }

    public void operacionMostrar() {
        System.out.println("La suma es: " + operacion.sumar());
        System.out.println("La resta es: " + operacion.restar());
        System.out.println("La multiplicacion es:  " + operacion.multiplicar());
        System.out.println("La division es: " + operacion.dividir());

    }

}
