/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author ing_j
 */
public class Cuenta {

    
    private int numeroCuenta;
    private long dni;
    private int saldoActual;
    private double interes;

    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, long dni, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public static Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el dni del cliente: ");
        long dni = leer.nextInt();
        System.out.println("Ingrese el saldo actual: ");
        int saldoActual = leer.nextInt();
        System.out.println("Ingrese el interes: ");
        int interes = leer.nextInt();
        return new Cuenta(numeroCuenta, dni, saldoActual, interes);
    }

    public void ingresar(double ingreso) {
        saldoActual = (int) (saldoActual + ingreso);
        System.out.println("Se ha ingresado " + ingreso + " en la cuenta.");
    }

    public void retirar(double retiro) {
        if (retiro > saldoActual) {
            System.out.println("No se puede retirar " + retiro + " porque el saldo actual es " + saldoActual + ".");
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
            System.out.println("Se ha retirado " + retiro + " de la cuenta.");
        }
    }

    public void extraccionRapida() {
        double limite = saldoActual * 0.2;
        System.out.println("Ingrese la cantidad que desea retirar (limite: " + limite + "):");
        Scanner leer = new Scanner(System.in);
        double retiro = leer.nextDouble();
        if (retiro > limite) {
            System.out.println("No se puede retirar " + retiro + " porque supera el límite de extracción rápida (" + limite + ").");
        } else {
            saldoActual -= retiro;
            System.out.println("Se ha retirado " + retiro + " de la cuenta.");
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual de la cuenta es: " + saldoActual);
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dni);
        System.out.println("Saldo actual: " + saldoActual);
        System.out.println("Interés: " + interes);
    }

}
