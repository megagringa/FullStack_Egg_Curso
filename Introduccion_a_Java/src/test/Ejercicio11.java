/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
package test;

import java.util.Scanner;


public class Ejercicio11 {

    public static void main(String[] args) {
    Scanner frase = new Scanner(System.in);
    
    String palabras;
    
        System.out.println("Ingrese una frase: ");
        palabras = frase.nextLine();
        System.out.println("La nueva palabra es: "+CambiarPalabras(palabras));
        
}
    
    public static String CambiarPalabras(String palabra){

        int x;
        char letra;
        String nuevaP;
        //Saber la longitud de la cadena
        x = palabra.length();
        //Inicializar cadena
        nuevaP = "";
        //recorrer la cadena
        for(int i = 0 ; i<x ; i++ ){
            letra = palabra.charAt(i);
            
            switch(letra){
                case 'a':
                case 'A':
                letra = '@';
                nuevaP = nuevaP + letra;
                break;
                case 'e':
                case 'E':
                letra = '#';
                nuevaP = nuevaP + letra;
                break;
                case 'i':
                case 'I':
                letra = '$';
                nuevaP = nuevaP + letra;
                break;
                case 'o':
                case 'O':
                letra = '%';
                nuevaP = nuevaP + letra;
                break;
                case 'u':
                case 'U':
                letra = '*';
                nuevaP = nuevaP + letra;
                break;
                default:
                nuevaP = nuevaP + letra;
                break;

            }
        }
        return nuevaP;

    }



    
}
  