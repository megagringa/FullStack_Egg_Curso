/*
Ejercicio de Aprendizaje Extra.
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
*/
package test;

import java.util.Scanner;







public class EjercicioAprendizajeExtra15 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Elija la opcion que quiere operar!!!...");
        System.out.println("1-Sumar.");
        System.out.println("2-Restar.");
        System.out.println("3-Multiplicar.");
        System.out.println("4-Dividir.");
        int op = leer.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Ingrese los dos valores a sumar: ");
                System.out.println("Ingrese el primer valor a sumar: ");
                double sum1 = leer.nextDouble();
                System.out.println("Ingrese el segundo valor a sumar: ");
                double sum2 = leer.nextDouble();
                System.out.println("El valor es: "+Sumar(sum1,sum2));
                break;
            case 2:
                System.out.println("Ingrese los dos valores a restar: ");
                System.out.println("Ingrese el primer valor a restar: ");
                double rest1 = leer.nextDouble();
                System.out.println("Ingrese el segundo valor a restar: ");
                double rest2 = leer.nextDouble();
                System.out.println("El valor es: "+Restar(rest1,rest2));
                break;
            case 3:
                System.out.println("Ingrese los dos valores a multiplicar: ");
                System.out.println("Ingrese el primer valor a multiplicar: ");
                double mult1 = leer.nextDouble();
                System.out.println("Ingrese el segundo valor a multiplicar: ");
                double mult2 = leer.nextDouble();
                System.out.println("El valor es: "+Multiplicar(mult1,mult2));
                break;
            case 4:
                System.out.println("Ingrese los dos valores a dividir: ");
                System.out.println("Ingrese el primer valor a dividir: ");
                double div1 = leer.nextDouble();
                System.out.println("Ingrese el segundo valor a dividir: ");
                double div2 = leer.nextDouble();
                System.out.println("El valor es: "+Dividir(div1,div2));
                break;
                
        }
    }
        
        public static double Sumar(double sum1,double sum2){
            double suma = sum1 + sum2;
            return suma;
        }
        public static double Restar(double rest1,double rest2){
            double resta = rest1 + rest2;
            return resta;
        }
        public static double Multiplicar(double mult1,double mult2){
            double multiplica = mult1 + mult2;
            return multiplica;
        }
        public static double Dividir(double div1,double div2){
            double divide = div1 + div2;
            return divide;
        }
 } 