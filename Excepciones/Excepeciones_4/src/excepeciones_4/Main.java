/*
 Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package excepeciones_4;

import java.util.InputMismatchException;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int numero = obtenerNumero();

            // Conversión de cadena a entero
            int resultado = convertirEntero(numero);

            int resultadoDivision = dividir(numero, 0);

            System.out.println("Resultado: " + resultado);
            System.out.println("Resultado de la división: " + resultadoDivision);
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado no es válido.");
        } catch (NumberFormatException e) {
            System.out.println("Error: No se pudo convertir el valor a entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }

    public static int obtenerNumero() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese un número: ");

        int numero = scanner.nextInt();

        return numero;
    }

    public static int convertirEntero(int numero) {
        String cadena = Integer.toString(numero);
        int resultado = Integer.parseInt(cadena);
        return resultado;
    }

    public static int dividir(int numerador, int denominador) {
        int resultado = numerador / denominador;
        return resultado;
    }
}
