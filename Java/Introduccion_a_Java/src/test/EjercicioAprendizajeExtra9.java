/*
Ejercicio de Aprendizaje Extra.
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
*/
package test;

import java.util.Scanner;

public class EjercicioAprendizajeExtra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cociente = 0, residuo;

        System.out.println("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = leer.nextInt();

        /*
         * Por ejemplo: 50 / 13:
         * 50 – 13 = 37 una resta realizada
         * 37 – 13 = 24 dos restas realizadas
         * 24 – 13 = 11 tres restas realizadas
         * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
         */
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        residuo = dividendo;
        System.out.println("El cociente es " + cociente + " y el residuo es " + residuo);
    }

}
