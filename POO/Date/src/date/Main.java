/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el día:");
        int dia = scanner.nextInt();
        
        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();
        
        System.out.println("Ingrese el año:");
        int anio = scanner.nextInt();
        
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        
        long y = ChronoUnit.YEARS.between(fecha, fechaActual);
        
        System.out.println("La fecha ingresada es: " + fecha);
        System.out.println("La fecha actual es: " + fechaActual);
        System.out.println("Hay " + Math.abs(y) + " años entre la fecha ingresada y la fecha actual.");
    }
}
