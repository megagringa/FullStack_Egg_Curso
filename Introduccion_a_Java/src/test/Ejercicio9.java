/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
*/
package test;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int contador = 1;
        int suma = 0;

        do {
            System.out.println("ingrese 20 valores a sumar");
            int num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;
                contador++;
            } else if (num < 0) {
                contador++;
                continue;
            } else {
                System.out.println("Se capturo el numero 0.");
                break;
            }

        } while (contador <= 20);
        System.out.println("la suma de lo numeros es de " + suma);
    }
}
