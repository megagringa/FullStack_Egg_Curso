import java.util.Scanner;

public class EjerciciosAprendizajeExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese valor que paga el socio.");
        double valorreal = leer.nextInt();
        double descuento;

        System.out.println("Elija la clase de Socio.");
        System.out.println("A) Socios tipo A con un 50% de descuento.");
        System.out.println("B) Socios tipo B con un 35% de descuento.");
        System.out.println("C) Socios tipo C sin descuento.");
        String letra = leer.next().toUpperCase();

        switch (letra) {
            case "A":
                descuento = valorreal * 0.5;
                System.out.println("Socio A tiene un descuento de " + descuento);
                break;
            case "B":
                descuento = valorreal * 0.35;
                System.out.println("Socio B tiene un descuento de " + descuento);
                break;
            case "C":
                descuento = valorreal;
                System.out.println("Socio C no tiene descuento " + descuento);
            default:
                System.out.println("NO puso el socio correcto");
                break;
        }

    }
}
